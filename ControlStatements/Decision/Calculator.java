package ControlStatements.Decision;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        int num_1;
        int num_2;
        char op;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 2 numbers: ");
        num_1 = sc.nextInt();
        num_2= sc.nextInt();
        System.out.println("Enter the operator ");
        op = sc.next().charAt(0);
        switch (op) {
    case '+':
        int sum = num_1+num_2;
        System.out.println("Sum =" +sum);
        break;

    case '-':
        int diff= num_1-num_2;
        System.out.println("Difference =" +diff);
        break;

    case '*':
        int prod =num_1*num_2;
        System.out.println("Product =" +prod);
        break;

    case '/':
        int qou = num_1/num_2;
        System.out.println("Qoutient =" +qou);
        break;

    case '%':
        int rem = num_1%num_2;
        System.out.println("Remainder =" +rem);
        break;

    default:
        System.out.println("Enter valid operator");
} 
sc.close();
    }
}
