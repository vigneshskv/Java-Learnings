# File IO:
  1. File
  2. FileWriter
  3. FileReader
  4. BufferedWriter
  5. BufferedReader
  6. PrintWriter
  
# File:
  ```java
  
  file f = new file("file_path.extension");
  
 ```
  
  This creates a new file object.
  
  **NOTE:**
  - This doesnt create physical file, rather just creates object and if the file_path already exists then just points to 
    the file.
  - Java FileIO is based on UNIX, and hence file and directory both are considered as file in java.
