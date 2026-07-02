package ControlStatements.Loops;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int original = n;

        int temp = n;
        int count = 0;

        // Count the number of digits
        while (temp > 0) {
            count++;
            temp = temp / 10;
        }

        int sum = 0;

        // Calculate Armstrong sum
        while (n > 0) {
            int digit = n % 10;
            sum = sum + (int) Math.pow(digit, count);
            n = n / 10;
        }

        if (sum == original) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }

        sc.close();
    }
}