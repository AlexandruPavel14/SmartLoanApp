import sqlite3
import csv
import os
from constants import output_folder  # Import the output_folder from constants.py

os.makedirs(output_folder, exist_ok=True)

# Connect to the SQLite database
conn = sqlite3.connect('/Users/daniel/Desktop/projectING/Step3-Application-implementation/database/SmartLoanAppDB/SmartLoanAppDB.db')
cursor = conn.cursor()

# Get the list of all tables
cursor.execute("SELECT name FROM sqlite_master WHERE type='table';")
tables = cursor.fetchall()

# Iterate over each table and save its content to a CSV file
for table_name in tables:
    table_name = table_name[0]
    cursor.execute(f"SELECT * FROM {table_name}")
    rows = cursor.fetchall()
    
    # Get the column names
    cursor.execute(f"PRAGMA table_info({table_name})")
    columns = [column[1] for column in cursor.fetchall()]

    # Write the data to a CSV file
    csv_file_path = os.path.join(output_folder, f"{table_name}.csv")
    with open(csv_file_path, 'w', newline='') as csv_file:
        writer = csv.writer(csv_file)
        writer.writerow(columns)  # Write the column names as the first row
        writer.writerows(rows)  # Write the data rows

# Close the database connection
conn.close()