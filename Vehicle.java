/*
* This class creates a vehicle.
*
* @author  Jacob Bonner
* @version 1.0
* @since   2021-01-05
*/

abstract class Vehicle {
  // Initializing fields
  String colour;
  private float speed;
  private int maximumSpeed;

  /**
   * Setting field values with a constructor.
   */
  public Vehicle(String colourInput) {
    this.colour = colourInput;
    this.speed = 0;
    this.maximumSpeed = 112;
  }

  /**
   * Setter for the colour.
   */
  public void setColour(String userColour) {
    colour = userColour;
  }

  /**
   * Getter for the colour.
   */
  public String getColour() {
    return colour;
  }

  /**
   * Getter for the speed.
   */
  public float getSpeed() {
    return this.speed;
  }

  /**
   * Method that accelerates the vehicle.
   */
  public float accelerate(float userIncrease) throws Exception {
    // Checking to see if speed exceeds maximum then increasing the speed
    if (this.speed + userIncrease > this.maximumSpeed) {
      throw null;
    } else {
      this.speed = this.speed + userIncrease;
    }

    // Returning the new speed to the user
    return this.speed;
  }
  
  /**
   * Method that deccelerates the vehicle.
   */
  public float decelerate(float userDecrease) throws Exception {
    // Checking to see if speed exceeds maximum then increasing the speed
    if (this.speed - userDecrease < 0) {
      throw null;
    } else {
      this.speed = this.speed - userDecrease;
    }

    // Returning the new speed to the user
    return this.speed;
  }
}
