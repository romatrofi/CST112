/**
 * Chapter 1 Exercise 4:
 *      (Print a table) Write a program that displays the following table:
 *          a a^2 a^3
 *          1  1   1
 *          2  4   8
 *          3  9   27
 *          4  16  64
 *
 * Created by Daniel Gutmann on 9/9/16.
 */

public class Exercise_04 {
    public static void main(String[] args) {
      System.out.println("a a^2 a^3");

        for(int i = 1; i <= 4; i++) {
          int a = i;
          int squared = a * a;
          int cubed = a * a * a;

          System.out.println(a + "  " + squared + "   " + cubed);
        };
    }
}
