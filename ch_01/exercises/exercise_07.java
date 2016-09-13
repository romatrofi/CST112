/**
 * Chapter 1 Exercise 7:
 *      (Approximate pi) pi can be computed using the following formula:
 *      pi = 4 x (1 - 1 + 1 - 1 + 1 - 1 + ...)
 *               (    3   5   7   9   11     )
 *
 *      Write a program that displays the result of:
 *       4 x (1 - 1 + 1 - 1 + 1 - 1 )
 *           (    3   5   7   9   11)
 *
 *      And:
 *      4 x (1 - 1 + 1 - 1 + 1 - 1 + 1 )
 *          (    3   5   7   9   11  13)
 *
 *      Use 1.0 instead of 1 in your program.
 *
 * Created by Daniel Gutmann on 9/9/16.
 */

public class exercise_07 {
    public static void main(String[] args) {
    double pi = (1.0 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
    System.out.println(pi);
    }
}
