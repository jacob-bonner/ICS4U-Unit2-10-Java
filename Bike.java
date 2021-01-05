/*
* This subclass creates a bike using specifications from the Vehicle class.
*
* @author  Jacob Bonner
* @version 1.0
* @since   2021-01-05
*/

public class Bike extends Vehicle {
  // Initializing fields
  private float cadence;
  private int tireNumber;

  /**
   * Setting field values with a constructor.
   */
  public Bike(String bikeColour) {
    super(bikeColour);
    this.colour = bikeColour;
    this.cadence = 0;
    this.tireNumber = 2;
  }

  /**
   * This method shows the user the tire number.
   */
  public int getTires() {
    return this.tireNumber;
  }

  /**
   * This shows the user the bike's cadence.
   */
  public float getCadence() {
    // Calculating and returning cadence
    //   Equation of speed over 8.3 was derived by using average
    //   specifications of a bicycle to determine average multiplier
    this.cadence = getSpeed() * 8.3f;
    return this.cadence;
  }

  /**
   * This method rings the bike's bell.
   */
  public String ringBell() {
    return "RING";
  }
}
