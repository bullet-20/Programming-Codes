package PersonalInformation;

public class Main {
  public static void main(String[] args) {
    PersonalInformation myInfo = new PersonalInformation("Susan Meyers", "123 Main St", 30, "555-555-1212");
    PersonalInformation friend1Info = new PersonalInformation("Mark Jones", "456 Main St", 25, "555-555-1213");
    PersonalInformation friend2Info = new PersonalInformation("Joy Rogers", "789 Main St", 35, "555-555-1214");

    // update the phone number of friend1
    friend1Info.setPhoneNumber("555-555-1215");

    // print the personal information of each person
    System.out.println("My personal information:");
    System.out.println("Name: " + myInfo.getName());
    System.out.println("Address: " + myInfo.getAddress());
    System.out.println("Age: " + myInfo.getAge());
    System.out.println("Phone number: " + myInfo.getPhoneNumber());

    System.out.println("\nFriend 1's personal information:");
    System.out.println("Name: " + friend1Info.getName());
    System.out.println("Address: " + friend1Info.getAddress());
    System.out.println("Age: " + friend1Info.getAge());
    System.out.println("Phone number: " + friend1Info.getPhoneNumber());

    System.out.println("\nFriend 2's personal information:");
    System.out.println("Name: " + friend2Info.getName());
    System.out.println("Address: " + friend2Info.getAddress());
    System.out.println("Age: " + friend2Info.getAge());
    System.out.println("Phone number: " + friend2Info.getPhoneNumber());
  }
}
/* Main.java and PersonalInformation.java is pretty much the same thing */ 