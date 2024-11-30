package Task_2;
import java.util.*;
public class StudentGradeTracker 
{
	public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of Subjects: ");
        int numberOfSubjects = scan.nextInt();

        int[] marks = new int[numberOfSubjects];

        float totalMarks = 0;

        for (int i = 0; i < numberOfSubjects; i++) {

            System.out.print("\nEnter the marks obtained out of 100 in Subject " + (i + 1) + ":");

            int a = scan.nextInt();

            if (a <= 100) {
                // Storing Subject Marks in Array
                marks[i] = a;

                // Calculate Total Marks
                totalMarks += marks[i];
            } else {
                System.out.println("\n\t!!! Please enter the valid marks !!!");
                i--;
            }

        }
        scan.close();

        // Calculate Average Percentage
        float averagePercentage = totalMarks / numberOfSubjects;

        String grade;

        switch ((int) (averagePercentage / 10)) {
            case 9, 10:
                grade = "A";
                break;
            case 8:
                grade = "B";
                break;
            case 7:
                grade = "C";
                break;
            case 6:
                grade = "D";
                break;
            case 5, 4:
                grade = "Pass";
                break;
            default:
                grade = "Fail";
                break;
        }

        System.out.println("\nTotal marks: " + totalMarks + "/" + numberOfSubjects * 100);

        System.out.println("\nAverage percentage: " + averagePercentage);

        System.out.println("\nGrade: " + grade);

    }
}

