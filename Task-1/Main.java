package Task_1;
import java.util.*;
public class SimpleCalculator 
{
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float result;

        System.out.println("\n\t\tSimple Calculator");
        System.out.print("\nEnter the first number: ");
        float a = scan.nextFloat();
        System.out.print("\nEnter the second number: ");
        float b = scan.nextFloat();

       
        System.out.print("Enter the operation : ");
        System.out.println("\n1.Addition \n2.Subtraction \n3.Multiplication \n4.Division");
        int choice = scan.nextInt();

        

        
        switch (choice) {
            case 1:
                result = a + b;
                System.out.println("\n\t\tResult: " + result);
                break;
            case 2:
                result = a - b;
                System.out.println("\n\t\tResult: " + result);
                break;
            case 3:
                result = a * b;
                System.out.println("\n\t\tResult: " + result);
                break;
            case 4:
                if (b != 0) {
                    result = a / b;
                    System.out.println("\n\t\tResult: " + result);
                } else {
                    System.out.println("\n\tError: Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("\n\tInvalid operator. Please use +, -, *, /");
        }

        scan.close();
    }
}



