/**
 * Chapter 1 Exercise 10:
 *      (Average speed in miles) Assume a runner runs 14 kilometers in 45 minutes and 30
 *      seconds. Write a program that displays the average speed in miles per hour. (Note
 *      that 1 mile is 1.6 kilometers.)
 *
 * Created by Daniel Gutmann on 9/13/16.
 */

public class exercise_10 {
    public static void main(String[] args) {
        double kilometers = 14.0;
        double miles = kilometers / 1.4;

        double time = (45.5 * 60.0 + 30.0) / (60.0 * 60.0);

        double speed = miles / time;
        
        System.out.println("The runner ran an average of " + speed + " miles per hour!");

    }
}
