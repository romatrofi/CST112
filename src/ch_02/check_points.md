# Chapter 2 - Check Points:

## Section 1:
  >2.1 Identify and fix the errors in the following code:
  >```java
  >public class Test {
  >  public void main(string[] args) {
  >    double i = 50.0;
  >    double k = i + 50.0;
  >    double j = k + 1;
  >
  >    System.out.println("j is " + j + " and
  >    k is " + k);
  >  }
  >}
  >```

  ```java
  public class Test {
    //Added "static" and capitalized the "S" in "string".
    public static void main(String[] args) {
      double i = 50.0;
      double k = i + 50.0;
      double j = k + 1;

      //Put the whole System.out.println statement on one line to abolish the compile error.
      System.out.println("j is " + j + " and k is " + k);
    }
  }
  ```

## Section 2:
  >2.2 a)How do you write a statement to let the user enter a double value from the keyboard?
  >b)What happens if you entered [5a](#) when executing the following code?
  >```java
  >double radius = input.nextDouble();
  >```

  ```java
  //Part a)
  import java.util.Scanner;
  public class PartA {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a value: ");
      //This statement takes the user input, and labels it as value.
      double value = input.nextDouble();
      System.out.println("The value you entered is: " + value);
    }
  }
  ```
    b)The program throws a runtime error at us.
  >2.3 Are there any performance differences between the following two [import](#) statements?
  >```java
  >import java.util.Scanner;
  >import java.util.*;
  >```

    There are no performance differences between the two statements.

## Section 3:
  >2.4 Which of the following identifiers are valid? Which are Java keywords?
  >[miles](#), [Test](#), [a++](#), [––a](#), [4#R](#), [$4](#), [#44](#), [apps](#)
  >[class](#), [public](#), [int](#), [x](#), [y](#), [radius](#)  

    Valid Identifiers: [miles](#), [Test](#), [$4](#), [apps](#), [x](#), [y](#), [radius](#)
    Invalid Identifiers: [a++](#), [––a](#), [4#R](#), [#44](#)
    Java Keywords: [class](#), [public](#), [int](#)

## Section 4:
  >2.5 Identify and fix the errors in the following code:
  >```java
  >public class Test {
  >  public static void main(String[] args) {
  >    int i = k + 2;
  >    System.out.println(i);
  >  }
  >}
  >```

  ```java
  /*not declaring the variable "k" is going to throw a compile error at you.
  *To fix this, either remove the variable "k", or assign "k" a value.
  */
  public class Test {
    public static void main(String[] args) {
      //removed the "k" from the variable "i"
      int i = 2;
      System.out.println(i);
    }
  }
  ```

## Section 5:
  >2.6 Identify and fix the errors in the following code:
  >```java
  >public class Test {
  >  public static void main(String[] args) {
  >    int i = j = k = 2;
  >    System.out.println(i + " " + j + " " + k);
  >  }
  >}
  >```

  ```java
  /*Throwing a compile error due to the variable "i" and "j" not having a value assigned.
  *To fix this, assign a value for the variables "i" and "j"
  */
  public class Test {
    public static void main(String[] args) {
      //assigned values to the variables "i" and "j"
      int i = 1, j = 3, k = 2;
      System.out.println(i + " " + j + " " + k);
    }
  }
  ```

## Section 6:
  >2.7 What are the benefits of using constants? Declare an [int](#) constant [SIZE](#) with value [20](#).

    Constants represent data that can not be changed. Benefits include:
    1) Not having to type the same value multiple times
    2) You only need to change a constant value, it is only in a single location
    3) Descriptive constants make source code easier to read.

  ```java
  final int SIZE = 20;
  ```
  >2.8 a)What are the naming conventions for class names, method names, constants, and variables?
  >b)Which of the following items can be a constant, a method, a variable, or a
  >class according to the Java naming conventions? MAX_VALUE, Test, read, readDouble

    a) Naming conventions:
      1) class: Capitalize the first letter of each word. i.e ThisIsAClassName
      2) method: Use lowercase lettering. Every word after the first gets a capital letter. i.e thisIsAMethodName
      3) constant: Capitalize every letter and use underscores for spaces. i.e THIS_IS_A_CONSTANT_NAME
      4) variables: Use lowercase lettering. Every word after the first gets a capital letter. i.e thisIsAClassName
    b)Which item can be a constant, method, variable, or class according to the naming conventions.
      1) "MAX_VALUE" is a constant.
      2) "Test" is a class name.
      3) "read" is a method/variable
      4) "readDouble" is a method/variable
  >2.9 Translate the following algorithm into Java code:
  >  Step 1: Declare a [double](#) variable named [miles](#) with initial value [100](#).
  >  Step 2: Declare a [double](#) constant named [KILOMETERS_PER_MILE](#) with value
  >  [1.609](#).
  >  Step 3: Declare a [double](#) variable named [kilometers](#), multiply [miles](#) and
  >  [KILOMETERS_PER_MILE](#), and assign the result to [kilometers](#).
  >  Step 4: Display [kilometers](#) to the console.
  >  What is [kilometers](#) after Step 4?

  ```java
  public class Example {
    public static void main(String[] args) {
      double miles = 100;
      final double KILOMETERS_PER_MILE = 1.609;
      double kilometers = miles * KILOMETERS_PER_MILE;
      System.out.println("You ran " + kilometers + " kilometers!");
    }
  }
  ```
    kilometers will be equal to "160.9"

## Section 7:
  >2.10 Find the largest and smallest [byte](#), [short](#), [int](#), [long](#), [float](#), and [double](#). Which
  of these data types requires the least amount of memory?

  | Type          | Smallest                                | Largest |
  |---------------|-----------------------------------------|-------------------------------------------|
  | [byte](#)     | -128 or -2<sup>7</sup>                  | 127 or 2<sup>7</sup> - 1                  |
  | [short](#)    | -32768 or -2<sup>15</sup>               | 32767 or 2<sup>15</sup> - 1               |
  | [int](#)      | -2147483648 or -2<sup>31</sup>          | 2147483647 or 2<sup>31</sup> - 1          |
  | [long](#)     | -9223372036854775808 or -2<sup>63</sup> | 9223372036854775807 or 2<sup>63</sup> - 1 |
  | [- float](#)  | -3.4028235E + 38                        | -1.4E - 45                                |
  | [+ float](#)  | 1.4E - 45                               | 3.4028235E + 38                           |
  | [- double](#) | -1.7976931348623157E + 308              | -4.9E - 324                               |
  | [+ double](#) | 4.9E - 324                              | 1.7976931348623157E + 308                 |

    byte requires the least amount of memory.
  >2.11 Show the result of the following remainders.
  [56](#) % [6](#)
  [78](#) % [-4](#)
  [-34](#) % [5](#)
  [-34](#) % [-5](#)
  [5](#) % [1](#)
  [1](#) % [5](#)

    [56](#) % [6](#) = 2
    [78](#) % [-4](#) = 2
    [-34](#) % [5](#) = -4
    [-34](#) % [-5](#) = -4
    [5](#) % [1](#) = 0
    [1](#) % [5](#) = 1
  >2.12 If today is Tuesday, what will be the day in 100 days?

  ```java
  public class Example {
    public static void main(String[] args) {
      String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
      int time = 100;
      int result = (2 + time) % 7;
      System.out.println("In " + time + " days, it will be " + days[result]);
    }
  }
  ```
    It will be Thursday in 100 days.
  >2.13 What is the result of [25 / 4](#)? How would you rewrite the expression if you wished
  the result to be a floating-point number?

    The result would be 6. You would rewrite it as [25.0 / 4](#)
    i
  >2.14 Show the result of the following code:
  >```java
  >System.out.println(2 * (5 / 2 + 5 / 2));
  >System.out.println(2 * 5 / 2 + 2 * 5 / 2);
  >System.out.println(2 * (5 / 2));
  >System.out.println(2 * 5 / 2);
  >```

  ```sh
  $ 8
  $ 10
  $ 4
  $ 5
  ```  
  >2.15 Are the following statements correct? If so, show the output.
  >```java
  >System.out.println("25 / 4 is " + 25 / 4);
  >System.out.println("25 / 4.0 is " + 25 / 4.0);
  >System.out.println("3 * 2 / 4 is " + 3 * 2 / 4);
  >System.out.println("3.0 * 2 / 4 is " + 3.0 * 2 / 4);
  >```

    Yes, the statements are correct. The output is:
  ```sh
  $ 25 / 4 is 6
  $ 25 / 4.0 is 6.25
  $ 3 * 2 / 4 is  1
  $ 3.0 * 2 / 4 is 1.5
  ```
  >2.16 Write a statement to display the result of (2)^3.5.

    ```java
    public class Example {
      public static void main(String[] args) {
        System.out.println("The result is " + Math.pow(2, 3.5));
      }
    }
    ```
  >2.17 Suppose [m](#) and [r](#) are integers. Write a Java expression for (mr)^2 to obtain a floating point result.

  ```java
  import java.util.Scanner;

  public class Example {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a value for m: ");
      int m = input.nextInt();
      System.out.print("Enter a value for r: ");
      int r = input.nextInt();
      System.out.println("The result is " + Math.pow((m * r), 2));
    }
  }
  ```

## Section 8:
