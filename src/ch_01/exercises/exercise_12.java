/**
 * Chapter 1 Exercise 12:
 *      (Average speed in kilometers) Assume a runner runs 24 miles in 1 hour, 40 minutes,
 *      and 35 seconds. Write a program that displays the average speed in kilometers per
 *      hour. (Note that 1 mile is 1.6 kilometers.)
 *
 * Created by Daniel Gutmann on 9/13/16.
 */

public class exercise_12 {
    public static void main(String[] args) {
        double miles = 24;
        double kilometers = miles * 1.6;

        double hours = 1;
        double minutes = 40;
        double seconds = 35;
        double timeInMinutes = (hours * 60) + minutes + (seconds / 60);

        double kph = (kilometers / timeInMinutes) * 60;
        System.out.println("The average speed for the runner is " + kph + " kph");
    }
}
