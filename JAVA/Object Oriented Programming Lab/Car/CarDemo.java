package Car;

public class CarDemo {
  public static void main(String[] args) {
    // create a Car object
    Car myCar = new Car(2020, "Toyota");

    // accelerate the car 5 times
    for (int i = 0; i < 5; i++) {
      myCar.accelerate();
      System.out.println("Current speed after acceleration: " + myCar.getSpeed());
    }

    // brake the car 5 times
    for (int i = 0; i < 5; i++) {
      myCar.brake();
      System.out.println("Current speed after braking: " + myCar.getSpeed());
    }
  }
}
