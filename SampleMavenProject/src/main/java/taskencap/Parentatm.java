package taskencap;

import java.util.Scanner;

//Class 1 - Bank
public class Parentatm {
 private int pin; // private = encapsulation

 // Method to set the pin from User
 public void setPin(int pin) {
     this.pin = pin;
 }

 // Method to validate pin
 public void validatePin() {
     if (pin == 1001 || pin == 1234 || pin == 1212) {
         System.out.println("PIN validation successful!");
         System.out.println("You can withdraw the amount.");
     } else {
         System.out.println("Invalid PIN! Transaction denied.");
     }
 }
}

