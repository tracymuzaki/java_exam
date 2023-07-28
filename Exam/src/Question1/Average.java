package Question1;
//(ii)java program to input 5 numbers from the keyboard and find their average
import Question2.Student;

import java.util.Scanner;//imported the Scanner class to ask for input
//created a class Average
public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // created a scanner object
        //first number
        System.out.println("Input first number: ");//requested for keyboard input
        int first_number = scanner.nextInt();//line to read keyboard input
        //second number
        System.out.println("Enter second number: ");
        int second_number = scanner.nextInt();
        //third number
        System.out.println("Enter third number: ");
        int third_number = scanner.nextInt();
        //fourth number
        System.out.println("Enter fourth number: ");
        int fourth_number = scanner.nextInt();
        //fifth number
        System.out.println("Enter fifth number: ");
        int fifth_number = scanner.nextInt();
        //finding average of the five numbers
        System.out.println("The average of the five numbers is: "+((first_number+second_number+third_number+fourth_number+fifth_number)/5));
    }

}
