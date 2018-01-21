# Files and IO:
  A stream can be defined as a sequence of data. There are two kinds of Streams
  - InPutStream − The InputStream is used to read data from a source.
  - OutPutStream − The OutputStream is used for writing data to a destination.
  
  1. [Byte Streams](#byte-streams)
  2. [Character Streams](#character-streams)
  3. [Standard Streams](#standard-streams)
      - [Standard Input](#standard-input)
      - [Standard Output](#standard-output)
      - [Standard Error](#standard-error)
  
  
## Byte Streams
  Java byte streams are used to perform input and output of 8-bit bytes. 
  
  1. [FileInputStream](fileinputstream)
  2. [FileOutputStream](fileoutputstream)
  
  ### FileInputStream
  ### FileOutputStream

## Character Streams
  Java Character streams are used to perform input and output for 16-bit unicode

  1. [File](#file)
  2. [FileWriter](#filewriter) (not recommended)
  3. [FileReader](#filereader) (not recommended)
  4. [BufferedWriter](#bufferedwriter)
  5. [BufferedReader](#bufferedreader)
  6. [PrintWriter](#printwriter)
  
  ## File
  ```java

  file f = new file("file_path.extension");

 ```

  This creates a new file object.

  **NOTE:**
  - This doesnt create physical file, rather just creates object and if the file_path already exists then just points to 
    the file.
  - Java FileIO is based on UNIX, and hence file and directory both are considered as file in java.

## FileWriter
  ```java

  // Below two constructors overwrites existing data.
  FileWriter fw = new FileWriter(String filename);
  FileWriter fw = new FileWriter(File f);

  // Below two constructors appends to existing data.
   FileWriter fw = new FileWriter(String filename, boolean append);
   FileWriter fw = new FileWriter(File f, boolean append);

  ```

  Writes textual/character data to the file.

  **NOTE:**
  - If the specified file in the constructor doesn'e exist, they will create the file and then wrtie data into it.

  **Cons:**
  - Programmer have to manually insert "\n"(line separator) in writer else all data will be written in single line.
  - Different systems use different representation for line separator.

## FileReader
  ```java

  FileReader fr = new FileReader(String filename);
  FileReader fr = new FileReader(File f);

  ```

  Read textual/character data from the file. 

  **Cons:**
  - Reads file character by character and not line by line. 

## BufferedWriter
  ```java

  BufferedWriter bw = new BufferedWriter(Writer w );
  BufferedWriter bw = new BufferedWriter(Writer w, int buffersize);

  ```

  Read textual/character data from the file, but use `newline()` method whihc relieves the programmer of taking care of representation of line separator in different platform.
  i.e, FileWriter + newline().

  **NOTE:**
  - BufferedWriter cannot communicate directly with File, it can communicate only via Writer object only.
  - When closing BufferedWriter underlying Writer is automatically closed and hence we need not close the Writer object.

  **Cons:**
  - Reads file character by character and not line by line. 

## BufferedReader
  ```java

  BufferedReader br = new BufferedReader(Reader r);
  BufferedReader br = new BufferedReader(Reader r, int buffersize);

  ```

  To read character/textual data from file. Has advantage over FileReader by facilitating reading data line by line.
  i.e, BufferedReader = FileReader + readline().

  **Cons:**
  - Writes only char and String, i.e, not supports other type such as int, float, boolean, and o write these other types we need to pass them as string which affects the performance of the system.


## PrintWriter
  ```java

  PrintWriter pr = new PrintWriter(Strring filename);
  PrintWriter pr = new PrintWriter(File f);
  PrintWriter pr = new PrintWriter(Writer w);

  ```

  Most enhanced writer to write character data to file. Main advantage is it can write any ype of java primitive type iretly to file.

  **Pros:**
  - Supports writing all primitiv types.
  - Need not call separate method such as `newline()` in BufferedReader, `pintln("data")` will write data and insert newline.


## Standard Streams
  Standard IO input output- keyboard, monitor.
  ### Standard Input
  ### Standard Output
  ### Standard Error
