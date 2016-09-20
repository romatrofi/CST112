/**
 * Snippet Week 2:
 *
 *
 * Created by Daniel Gutmann on 9/13/16.
 *
 */
package snippetweek02;

import java.util.Scanner;

public class Week_02 {
  public static void main(String[] args) {
    //Statement from Step #2.
    System.out.println("Step #1 - Add an output statement to write your name");
    Scanner nameInput = new Scanner(System.in);
    System.out.print("Enter your name: ");
    String name = nameInput.nextLine();
    System.out.println("Hi, my name is " + name + "!");

    //From #3 - ComputerAreaWithConstant.java
    System.out.println("Step #2 - ComputerAreaWithConstant.java");
    final double PI = 3.14159; // Declare a constant
    // Create a Scanner object
    Scanner radiusInput = new Scanner(System.in);
    // Prompt the user to enter a radius
    System.out.print("Enter a number for radius: ");
    double radius = radiusInput.nextDouble();
    // Compute area
    double area = radius * radius * PI;
    // Display result
    System.out.println("The area for the circle of radius " + radius + " is " + area);

    //From #4 - DisplayTime.java
    System.out.println("Step #3 - DisplayTime.java");
    Scanner secondsInput = new Scanner(System.in);
    // Prompt the user for input
    System.out.print("Enter an integer for seconds: ");
    int seconds = secondsInput.nextInt();
    int minutes = seconds / 60; // Find minutes in seconds
    int remainingSeconds = seconds % 60; // Seconds remaining
    System.out.println(seconds + " seconds is " + minutes + " minutes and " + remainingSeconds + " seconds");
  }
}
