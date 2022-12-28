package Car;

public class Car {
  // fields for the yearModel, make, and speed
  private int yearModel;
  private String make;
  private int speed;

  // constructor that accepts the yearModel and make as arguments
  // and assigns them to the object's yearModel and make fields
  // it also assigns 0 to the speed field
  public Car(int yearModel, String make) {
    this.yearModel = yearModel;
    this.make = make;
    this.speed = 0;
  }

  // accessor methods to get the values of the fields
  public int getYearModel() {
    return yearModel;
  }

  public String getMake() {
    return make;
  }

  public int getSpeed() {
    return speed;
  }

  // method to accelerate the car by adding 5 to the speed field
  public void accelerate() {
    speed += 5;
  }

  // method to brake the car by subtracting 5 from the speed field
  public void brake() {
    speed -= 5;
  }
  
}
