/*
* This program uses classes and subclasses to create and change the properties 
* of a bicycle and truck.
*
* @author  Jacob Bonner
* @version 1.0
* @since   2021-01-05
*/

import java.util.Scanner;  // Import the Scanner class

public class NewVehicles {
  /**
   * This function allows the user to have a bike and a truck as well as change
   * the properties of the vehicles.
   */
  public static void main(String[] args) {
    try {
      // Creating the scanners for any inputs that may be necessary input
      final Scanner colourInput = new Scanner(System.in);
      final Scanner licenseInput = new Scanner(System.in);
      final Scanner speedInput = new Scanner(System.in);

      // User input for colour of the bicycle
      System.out.print("What is the colour your bicycle: ");
      String vehicleColour = colourInput.nextLine();

      // Initializing the user's bike and telling the user its colour
      Bike userBike = new Bike(vehicleColour);
      System.out.println("You got a bike! Its colour is: " 
                         + userBike.getColour());
      System.out.println("Your bike has " + userBike.getTires() + " wheels");
      System.out.println();

      // User input for colour of the truck
      System.out.print("What is the colour your truck: ");
      vehicleColour = colourInput.nextLine();

      // Initializing the user's truck and telling the user its colour
      Truck userTruck = new Truck(vehicleColour);
      System.out.println("You got a truck! Its colour is: " 
                         + userTruck.getColour());
      System.out.println("Your truck has " + userTruck.getTires() + " wheels");

      // Setting the license plate number of the user's new truck
      System.out.print("Now that you have your truck, what is its "
                       + "license plate number: ");
      String userLicensePlate = licenseInput.nextLine();
      userTruck.setLicensePlate(userLicensePlate);
      System.out.println("Your license plate is: " 
                         + userTruck.getLicensePlate());
      System.out.println("");

      // Changing the colour of the bicycle
      System.out.print("Your bike needs some new paint! What colour is it: ");
      vehicleColour = colourInput.nextLine();
      userBike.setColour(vehicleColour);
      System.out.println("The bike's new paint job colour is: " 
                         + userBike.getColour());
      System.out.println("");

      // Changing the colour of the truck
      System.out.print("Your truck needs some new paint! What colour is it: ");
      vehicleColour = colourInput.nextLine();
      userTruck.setColour(vehicleColour);
      System.out.println("The truck's new paint job colour is: " 
                         + userTruck.getColour());
      System.out.println("");

      // Accelerating the truck and honking the horn
      System.out.print("Take your truck out for a ride! How fast are you "
                       + "going (KM/h): ");
      int userSpeedInput = speedInput.nextInt();
      userTruck.accelerate(userSpeedInput);
      System.out.println("You are travelling at " + userTruck.getSpeed()
                         + " KM/h");
      System.out.println("Honking the horn: " + userTruck.provideAir());

      // Slowing the truck down
      System.out.print("You hit traffic! How much are you slowing down "
                       + "(KM/h): ");
      userSpeedInput = speedInput.nextInt();
      userTruck.decelerate(userSpeedInput);
      System.out.println("You are travelling at " + userTruck.getSpeed()
                         + " KM/h");
      System.out.println("");

      // Accelerating the bike and ringing
      System.out.print("Take your bike out for a ride! How fast are you "
                       + "going (KM/h): ");
      userSpeedInput = speedInput.nextInt();
      userBike.accelerate(userSpeedInput);
      System.out.println("You are travelling at " + userBike.getSpeed()
                         + " KM/h");
      System.out.println("Ringing the bell: " + userBike.ringBell());

      // Telling the user the cadence of the bike
      System.out.println("Your cadence is: " + userBike.getCadence() + " RPM");

      // Slowing the bike down
      System.out.print("People on the trail! How much are you slowing down "
                       + "(KM/h): ");
      userSpeedInput = speedInput.nextInt();
      userBike.decelerate(userSpeedInput);
      System.out.println("You are travelling at " + userBike.getSpeed()
                         + " KM/h");

      // Catches and tells the user what error occurred
    } catch (NullPointerException e) {
      System.out.println("");
      System.out.println("ERROR: Attempt to change vehicle " 
                         + "property beyond allowed bounds");
    } catch (Exception e) {
      System.out.println("");
      System.out.println("ERROR: Invalid Input");
    }
  }
}
