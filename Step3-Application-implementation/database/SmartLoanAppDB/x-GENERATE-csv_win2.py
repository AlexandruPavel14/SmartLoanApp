import sqlite3
import csv
import os
from constants import output_folder  # Import the output_folder from constants.py

os.makedirs(output_folder, exist_ok=True)

# Connect to the SQLite database
db_path = r'C:\path\Step3-Application-implementation\database\SmartLoanAppDB\app.db'
if not os.path.exists(db_path):
    print(f"Database file not found: {db_path}")
else:
    conn = sqlite3.connect(db_path)
    cursor = conn.cursor()

    # Get the list of all tables
    cursor.execute("SELECT name FROM sqlite_master WHERE type='table';")
    tables = cursor.fetchall()

    if not tables:
        print("No tables found in the database.")
    else:
        # Iterate over each table and save its content to a CSV file
        for table_name in tables:
            table_name = table_name[0]
            print(f"Processing table: {table_name}")
            cursor.execute(f"SELECT * FROM {table_name}")
            rows = cursor.fetchall()

            # Get the column names
            cursor.execute(f"PRAGMA table_info({table_name})")
            columns = [column[1] for column in cursor.fetchall()]

            if not columns:
                print(f"Table {table_name} has no columns.")
                continue

            # Write the data to a CSV file
            csv_file_path = os.path.join(output_folder, f"{table_name}.csv")
            with open(csv_file_path, 'w', newline='', encoding='utf-8') as csv_file:  # Specify utf-8 encoding
                writer = csv.writer(csv_file)
                writer.writerow(columns)  # Write the column names as the first row
                writer.writerows(rows)  # Write the data rows
            print(f"Data from table {table_name} saved to {csv_file_path}")

    # Close the database connection
    conn.close()