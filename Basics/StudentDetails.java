package Basics;
import java.util.Scanner;

public class StudentDetails {
    public static void main(String args[]){

    String name;
    int age;
    float cgpa;
    Scanner sc = new Scanner(System.in);
    name = sc.nextLine();
    age= sc.nextInt();
    cgpa = sc.nextFloat();

    System.out.println("Name"+name);
    System.out.println("Age"+age);
    System.out.println("CGPA"+cgpa);
    sc.close();
}
}