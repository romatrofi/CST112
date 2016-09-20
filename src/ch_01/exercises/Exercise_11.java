/**
 * Chapter 1 Exercise 11:
 *      (Population projection) The U.S. Census Bureau projects population based on the
 *      following assumptions:
 *          -One birth every 7 seconds
 *          -One death every 13 seconds
 *          -One new immigrant every 45 seconds
 *      Write a program to display the population for each of the next five years. Assume the
 *      current population is 312,032,486 and one year has 365 days. Hint: In Java, if two
 *      integers perform division, the result is an integer. The fractional part is truncated. For
 *      example, 5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5). To get an accurate result with
 *      the fractional part, one of the values involved in the division must be a number with a
 *      decimal point. For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.
 *
 * Created by Daniel Gutmann on 9/13/16.
 */

public class Exercise_11 {
    public static void main(String[] args) {
        int yearOnePop = 312032486;

        int dayInSeconds = (24 * 60) * 60;

        int birthsInOneDay = (dayInSeconds - (dayInSeconds % 7)) / 7;
        int deathsInOneDay = (dayInSeconds - (dayInSeconds % 13)) / 13;
        int immigrantsInOneDay = (dayInSeconds - (dayInSeconds % 45)) / 45;

        for(int year = 0; year <= 5; year++) {
            int births = (birthsInOneDay * 365) * year;
            int immigrants = (immigrantsInOneDay * 365) * year;
            int deaths = (deathsInOneDay * 365) * year;

            int population = yearOnePop + (births + immigrants - deaths);

            System.out.println("The population for year " + year + " is " + population + " with " + births + " births, " + immigrants + " immigrants, and " + deaths + " deaths since the first year");
        };
    }
}
