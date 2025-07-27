import shutil
from constants import output_folder  # Import the output_folder from constants.py

# Delete the folder
try:
    shutil.rmtree(output_folder)
    print(f"Deleted folder {output_folder}")
except FileNotFoundError:
    print(f"Folder not found: {output_folder}")
except Exception as e:
    print(f"Error deleting folder {output_folder}: {e}")