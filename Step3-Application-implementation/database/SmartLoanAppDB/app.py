from fastapi import FastAPI, HTTPException
from fastapi.responses import JSONResponse
from fastapi.middleware.cors import CORSMiddleware
import sqlite3

# Set your database path here
DATABASE_PATH = "/Users/daniel/Desktop/projectING/Step3-Application-implementation/database/SmartLoanAppDB/SmartLoanAppDB.db"

app = FastAPI(
    title="Simple SQLite Table Lister API",
    description="API that lists all tables in a SQLite database.",
    version="1.0.0",
)

# Add CORS middleware (optional for dev)
app.add_middleware(
    CORSMiddleware,
    allow_origins=["*"],
    allow_credentials=True,
    allow_methods=["*"],
    allow_headers=["*"],
)

@app.get("/")
def root():
    return {"message": "API is running. Go to /tables to see all tables in the database."}

@app.get("/tables", summary="Get Table Names", tags=["Database"])
def get_table_names():
    """
    Fetch the names of all tables in the SQLite database.
    """
    try:
        # Connect to the SQLite database
        connection = sqlite3.connect(DATABASE_PATH)
        cursor = connection.cursor()

        # Fetch all table names
        cursor.execute("SELECT name FROM sqlite_master WHERE type='table';")
        tables = cursor.fetchall()

        # Extract table names from the query result
        table_names = [table[0] for table in tables]

        # Close the connection
        connection.close()

        # Return the table names as a JSON response
        return JSONResponse(content={"tables": table_names})
    except sqlite3.Error as e:
        raise HTTPException(status_code=500, detail=f"Database error: {str(e)}")

# Entry point for Uvicorn to run the app
if __name__ == "__main__":
    import uvicorn
    uvicorn.run("app:app", host="127.0.0.1", port=8000, reload=True)
