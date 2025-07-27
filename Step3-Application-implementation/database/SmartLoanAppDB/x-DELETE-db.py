import os
from constants import output_folder, db_files  # Import output_folder and db_files from constants.py

# Delete the database files
for file_path in db_files:
    try:
        os.remove(file_path)
        print(f"Deleted {file_path}")
    except FileNotFoundError:
        print(f"File not found: {file_path}")
    except Exception as e:
        print(f"Error deleting {file_path}: {e}")

# Optionally, delete the output folder
try:
    os.rmdir(output_folder)
    print(f"Deleted folder {output_folder}")
except FileNotFoundError:
    print(f"Folder not found: {output_folder}")
except OSError:
    print(f"Folder {output_folder} is not empty or cannot be deleted.")
except Exception as e:
    print(f"Error deleting folder {output_folder}: {e}")