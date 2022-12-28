package PersonalInformation;

public class PersonalInformation {
  // fields for name, address, age, and phone number
  private String name;
  private String address;
  private int age;
  private String phoneNumber;

  // constructor that accepts the name, address, age, and phone number as arguments
  // and assigns them to the object's name, address, age, and phoneNumber fields
  public PersonalInformation(String name, String address, int age, String phoneNumber) {
    this.name = name;
    this.address = address;
    this.age = age;
    this.phoneNumber = phoneNumber;
  }

  // accessor and mutator methods for the fields
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }
}
