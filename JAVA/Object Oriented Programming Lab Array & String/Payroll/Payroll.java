package Payroll;

import java.util.Scanner;

class Payroll {
  int[] employeeId = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};
  int[] hours = new int[7];
  double[] payRate = new double[7];
  double[] wages = new double[7];

  public Payroll() {
    // constructor code goes here
  }

  public void setHours(int id, int h) {
    for (int i = 0; i < employeeId.length; i++) {
      if (employeeId[i] == id) {
        hours[i] = h;
      }
    }
  }

  public void setPayRate(int id, double r) {
    for (int i = 0; i < employeeId.length; i++) {
      if (employeeId[i] == id) {
        payRate[i] = r;
      }
    }
  }

  public void calculateWages() {
    for (int i = 0; i < employeeId.length; i++) {
      wages[i] = hours[i] * payRate[i];
    }
  }

  public int getHours(int id) {
    for (int i = 0; i < employeeId.length; i++) {
      if (employeeId[i] == id) {
        return hours[i];
      }
    }
    return -1; // return -1 if employee ID not found
  }

  public double getPayRate(int id) {
    for (int i = 0; i < employeeId.length; i++) {
      if (employeeId[i] == id) {
        return payRate[i];
      }
    }
    return -1; // return -1 if employee ID not found
  }

  public double getWages(int id) {
    for (int i = 0; i < employeeId.length; i++) {
      if (employeeId[i] == id) {
        return wages[i];
      }
    }
    return -1; // return -1 if employee ID not found
  }

  public double getGrossPay(int id) {
    for (int i = 0; i < employeeId.length; i++) {
      if (employeeId[i] == id) {
        return wages[i];
      }
    }
    return -1; // return -1 if employee ID not found
  }
}
