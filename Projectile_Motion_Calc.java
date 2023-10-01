// Nadir Mahmood
// Projectile Motion Calculator
// September 30th 2023
// This program will calculate the maximum horizontal distance of a projectile motion

import java.util.Scanner;

public class Projectile_Motion_Calc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double initial_angle, initial_speed, gravitational_force_value;
        double distance_traveled;

        // Ask the user to enter the angle of the projectile
        System.out.print("Enter the initial angle of the projectile in degrees: ");
        initial_angle = in.nextDouble();

        System.out.print("Enter the initial speed of the projectile in meters per second: ");
        initial_speed = in.nextDouble();

        // This is the constant gravitational force value
        gravitational_force_value = 9.8;

        // The angle will be converted to radians for trignometric functions
        double angle_in_radians = Math.toRadians(initial_angle);

        // The distance will be calculated using the following formula
        distance_traveled = (initial_speed * initial_speed * Math.sin(2 * angle_in_radians)) / gravitational_force_value;

        // Print the result
        System.out.printf("The maximum horizontal distance covered by the projectile is:" + distance_traveled + " meters");
    }
}
