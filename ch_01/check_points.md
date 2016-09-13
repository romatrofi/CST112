# Chapter 1 - Check Points:

## Section 1:
  >1.1 What are hardware and software?

    Hardware is the visible, physical parts of a computer (i.e CPU, GPU, MoBo), and software give invisible instructions to the hardware to perform specific tasks (i.e git, Photoshop, Google Chrome).
  >1.2 List five major hardware components of a computer.

    CPU, RAM, motherboard, power supply, input devices (i.e keyboard/mouse).
  >1.3 What does the acronym “CPU” stand for?

    Central Processing Unit.
  >1.4 What unit is used to measure CPU speed?

    Hertz (Hz). Modern CPUs now measure in gigahertz (GHz).
  >1.5 What is a bit? What is a byte?

    A bit is a binary digit (i.e 1 or 0). A byte is the minimum storage unit, holding 8 bits.
  >1.6 a)What is memory for? b)What does RAM stand for? c)Why is memory called RAM?

    a)For storing programs and data a program is working with.
    b)RAM stands for Random Access Memory.
    c)Bytes in the memory can be accessed randomly in any order.
  >1.7 What unit is used to measure memory size?

    Memory is measured in bytes. Today, ram is now measured in gigabytes (GBs)
  >1.8 What unit is used to measure disk size?

    Disk size is measured in bytes. Hard drives today are measured in gigabytes (GBs) and terabytes (TBs)
  >1.9 What is the primary difference between memory and a storage device?

    Memory is volatile, meaning any data will be erased when the computer shuts down. A storage device allows memory to be stored permanently on a computer.


## Section 2:
  >1.10 What language does the CPU understand?

    Machine language.
  >1.11 What is an assembly language?

    Uses short, descriptive words to represent machine language instructions. Assembly language makes the code easier to read for humans.
  >1.12 What is an assembler?

    Converts assembly language into machine language for the computer to understand.
  >1.13 What is a high-level programming language?

    English like and easy to read/learn. Instructions written to the computer are called statements. Also platform independent (can run on different types of machines).
  >1.14 What is a source program?

    A program written in a high level programming language.
  >1.15 What is an interpreter?

    Reads a statement from the source code -> translates it to machine code -> executes the statement immediately (i.e Javascript, CSS).
  >1.16 What is a compiler?

    Translates the source code all at once and creates a machine code file to be executed (i.e Java, C++).
  >1.17 What is the difference between an interpreted language and a compiled language?

    An interpreted language translates and executes one statement at a time. A compiled language translates the entire source code into a file for execution.

## Section 3:
  >1.18 a)What is an operating system? b)List some popular operating systems.

    a)Manages and controls a computers activity.
    b)Windows, macOS, Linux, Gentoo.
  >1.19 What are the major responsibilities of an operating system?

    Controlling and monitoring system activities, allocating resources, scheduling operations.
  >1.20 What are multiprogramming, multithreading, and multiprocessing?

    Multiprogramming allows multiple programs to be ran at once by the same CPU (i.e having Chrome open and playing Overwatch). Multithreading allows a program to execute multiple tasks at the same time (i.e Spotify downloading and playing music at the same time). Multiprocessing uses two or more processors together.

## Section 4:
  >1.21 Who invented Java? Which company owns Java now?

    A team lead by James Gosling at Sun Microsystems. Oracle now owns Java.
  >1.22 What is a Java applet?

    Applets provide an interactive graphical user interface (GUI). It can also be ran from a web browser.
  >1.23 What programming language does Android use?

    Android devices run on Java.

## Section 5:
  >1.24 What is the Java language specification?

    A technical definition of Java programming syntax and semantics (can be viewed at [Java's documentation page](http://docs.oracle.com/javase/specs/)).
  >1.25 What does JDK stand for?

    Java Development Toolkit.
  >1.26 What does IDE stand for?

    Integrated Development Environment.
  >1.27 Are tools like NetBeans and Eclipse different languages from Java, or are they dialects or extensions of Java?

    These tools allow developing Java programs quickly by editing, compiling, building, and debugging, all integrated in one GUI.

## Section 6:
  >1.28 a)What is a keyword? b)List some Java keywords.

    a)Reserved words for the compiler/interpreter to use for a specific action.
    b)class, static, void, public, main.
  >1.29 a)Is Java case sensitive? b)What is the case for Java keywords?

      a) Yes.
      b)Java keywords are written in lower-case.
  >1.30 a)What is a comment? b)Is the comment ignored by the compiler? c)How do you denote a comment line and a comment paragraph?

    a)To help communicate and understand a program
    b)Yes, comments are ignored by the compiler
    c) To denote a comment line, you use:

    ```java
    //A single comment line.
    ```
    To denote a comment paragraph, you use:
   ```java
   /* Enter a
   comment paragraph
   like this! */
   ```
  >1.31 What is the statement to display a string on the console?

  ```java
  System.out.println("Enter text to display here");
  ```
  >1.32 Show the output of the following code:
   >```java
   >public class Test {
   >	public static void main(String[] args) {
   >	 System.out.println("3.5 * 4 / 2 – 2.5 is ");
   >	 System.out.println(3.5 * 4 / 2 – 2.5);
   >	}
   >}
   >```

    The output is:
    3.5 * 4 / 2 - 2.5 is
    4.5

## Section 7:
  >1.33 What is the Java source filename extension, and what is the Java bytecode filename extension?

    The Java source filename extension is .java and the Java bytecode filename extension is .class .
  >1.34 What are the input and output of a Java compiler?

    The input is a file with the .java file extension. If there's no errors within the .java file, the compiler will output a bytecode file with the .class file extension.
  >1.35 What is the command to compile a Java program?

   ```sh
   $ javac [filename.java]
   ```
  >1.36 What is the command to run a Java program?

   ```sh
   $ java [filename]
   ```
  >1.37 What is the JVM?

    Stands for Java Virtual Machine. It's used to run Java bytecode on a variety of computers and operating systems.
  >1.38 Can Java run on any machine? What is needed to run Java on a computer?

    a)Only if your machine meets the minimum requirements and Java is installed.
    b)To compile and run Java programs, you need the JDK (Java Development Tookkit) installed.
  >1.39 If a [NoClassDefFoundError](#) occurs when you run a program, what is the cause of the error?

    There class file you're trying to execute does not exist.
  >1.40 If a [NoSuchMethodError](#) occurs when you run a program, what is the cause of the error?

    There's no main method, or "main" is improperly spelled (i.e Main).

## Section 8:
  >1.41 Reformat the following program according to the programming style and documentation guidelines. Use the end-of-line brace style.
  >```java
  >//Original style
  >public class Test
  >{
  >  // Main method
  >  public static void main(String[] args) {
  >  /** Display output */
  >  System.out.println("Welcome to Java");
  >  }
  >}
  >```

  ```java
  //End-of-line brace style
  public class Test {
    //Main method
    public static void main(String[] args) {
      /**Display output */
      System.out.println("Welcome to Java");
    }
  }
  ```

## Section 9:
  >1.42 What are syntax errors (compile errors), runtime errors, and logic errors?

    Syntax errors are detected by the compiler and are errors with code construction (i.e brackets, mistyped keyword). A runtime error terminates the program abnormally. This occurs when an operation is impossible to carry out. Logic errors occur when the program does not perform as intended to (i.e program gives the wrong temperature output when converting degrees to celsius).
  >1.43 Give examples of syntax errors, runtime errors, and logic errors.

    An example of a syntax error would be not including a closing quote in a string or improperly spelling main. An example of a runtime error would be when a user inputs a string when the program is looking for a numerical input. An example of a logic error would be when a program gives an improper output when converting celsius to degrees.
  >1.44 If you forget to put a closing quotation mark on a string, what kind error will be raised?

    The compiler will display a syntax error.
  >1.45 If your program needs to read integers, but the user entered strings, an error would occur when running this program. What kind of error is this?

    A runtime error would occur, specifically an input error.
  >1.46 Suppose you write a program for computing the perimeter of a rectangle and you mistakenly write your program so that it computes the area of a rectangle. What kind of error is this?


    This is a logic error.
  >1.47 Identify and fix the errors in the following code:
  >```java
  >//Original code:
  >public class Welcome {
  >  public void Main(String[] args) {
  >    //Had to add a closing quote to fix the formatting, so i switched the double quotes "" to single quotes ''
  >    System.out.println('Welcome to Java!');
  >  }
  >}
  >```

   ```java
   public class Welcome {
     //Added static to the statement and changed the "M" in "Main" to a lower-case "m"
     public static void main(String[] args) {
       //Put a closing quote inside the System.out.println statement
       System.out.println("Welcome to Java!");
     }
   }
   ```
