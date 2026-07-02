package ControlStatements.Loops;
import java.util.Scanner;
public class SumOfDigits {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int sum = 0;
    int num = sc.nextInt();
    int digit;
    while(num>0){
        digit = num%10;
        num = num/10;
        sum = sum+digit;

    }
    System.out.println("Sum of Digits = " + sum);
    sc.close();
}

}