import java.util.Scanner;

public class Problem2 {
    public static void main(String args[]) {
        // Create a scanner to take user input for temp and wind speed
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit between -58F and 41F: ");
        double temp = scan.nextDouble();
        System.out.print("Enter the wind speed (>=2) in miles per hour: ");
        double wind = scan.nextDouble();
        scan.close();

        // ensure the temp and wind speed values inputted are valid
        if (temp < -58 || temp > 41)
            System.out.println("The temperature is out of range.");
        else if (wind < 2)
            System.out.println("The wind speed is out of range.");
        // if and only if the inputs are valid do we calculate wind chill and use
        // conditionals to print the corresponding warning
        else {
            double windchill = 35.74 + (0.6215 * temp) - (35.75 * Math.pow(wind, 0.16))
                    + (0.4275 * temp * Math.pow(wind, 0.16));
            System.out.println("The wind chill index is " + windchill + ".");
            if (windchill >= 16 && windchill <= 30)
                System.out.println("COLD. Unpleasant.");
            else if (windchill >= 1 && windchill <= 15)
                System.out.println("VERY COLD. Very unpleasant.");
            else if (windchill >= -21 && windchill <= 0)
                System.out.println("BITTER COLD. Frostbite possible.");
            else if (windchill < -21)
                System.out.println("EXTREMELY COLD. Frostbite likely. Outdoor activity becomes dangerous.");
        }
    }
}
