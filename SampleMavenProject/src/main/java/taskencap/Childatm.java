package taskencap;

import java.util.Scanner;

class Childatm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Parentatm sp = new Parentatm();

        System.out.print("Enter your ATM PIN: ");
        int enteredPin = sc.nextInt(); // ← getting pin from user

        sp.setPin(enteredPin); // passing pin to Bank
        sp.validatePin(); // validating in Bank class

        
    }
}
