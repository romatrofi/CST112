/**
 * Chapter 1 Exercise 9:
 *      (Area and perimeter of a rectangle) Write a program that displays the area and
 *      perimeter of a rectangle with the width of 4.5 and height of 7.9 using the following
 *      formula:
 *      area = width * height
 *
 * Created by Daniel Gutmann on 9/9/16.
 */

public class exercise_09 {
    public static void main(String[] args) {
        double width = 4.5;
        double height = 7.9;

        double perimeter = (width * 2) + (height * 2);
        double area = width * height;
        
        System.out.println("The perimeter is: " + perimeter);
        System.out.println("The area is: " + area);
    }
}
