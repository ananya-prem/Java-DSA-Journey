package StarPatterns;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int line = 1; line <= n; line++) {

            // Print spaces
            for (int space = 1; space <= n - line; space++) {
                System.out.print(" ");
            }

            // Print stars
            for (int star = 1; star <= line; star++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }

        sc.close();
    }
}

