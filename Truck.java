/*
* This subclass creates a truck using specifications from the Vehicle class.
*
* @author  Jacob Bonner
* @version 1.0
* @since   2021-01-05
*/

public class Truck extends Vehicle {
  // Initializing fields
  private String licensePlateNumber;
  private int tireNumber;

  /**
   * Setting field values with a constructor.
   */
  public Truck(String truckColour) {
    super(truckColour);
    this.colour = truckColour;
    this.licensePlateNumber = "DEFAULT";
    this.tireNumber = 4;
  }

  /**
   * This setter sets the license plate of the truck.
   */
  public void setLicensePlate(String licensePlateInput) {
    this.licensePlateNumber = licensePlateInput;
  }

  /**
   * This getter shows the user the license plate of the truck.
   */
  public String getLicensePlate() {
    return this.licensePlateNumber;
  }

  /**
   * This method shows the user the tire number.
   */
  public int getTires() {
    return this.tireNumber;
  }

  /**
   * This method blows the truck's horn.
   */
  public String provideAir() {
    return "HONK";
  }
}
