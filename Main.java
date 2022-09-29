import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("please type your name");
    Scanner s1 = new Scanner(System.in); // Creates a Scanner object
        String name = s1.nextLine(); // reads user input
        System.out.println("Your name is: " + name);
        System.out.println("please type your age");
        int age = s1.nextInt();//hopefully reads user age
        System.out.println("your age is " + age);
        int retirementAge = (67 - age);
        System.out.println("you can retire in: " +retirementAge + " years.");


    }
}