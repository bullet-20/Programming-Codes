package Car;

public class main {
  public static void main(String[] args) {
    Car myCar = new Car(2020, "Toyota");

    // accelerate the car
    myCar.accelerate();
    myCar.accelerate();

    // brake the car
    myCar.brake();

    // print the current speed of the car
    System.out.println("Current speed: " + myCar.getSpeed());
  }
}