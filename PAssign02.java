import java.util.Scanner;
public class PAssign02 {
    public static void main(String[] args) {
        int totalGrades = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Revel grade:");
        double revelGrade = input.nextDouble() * 0.10;
        totalGrades++;
        System.out.println("Enter Programming Assignments grade:");
        double programmingGrade = input.nextDouble() * 0.10;
        totalGrades++;
        System.out.println("Enter Lab grade:");
        double labGrade = input.nextDouble() * 0.10;
        totalGrades++;
        System.out.println("Enter Exam 1 grade:");
        double examOneGrade = input.nextDouble() * 0.15;
        totalGrades++;
        System.out.println("Enter Exam 2 grade:");
        double examTwoGrade = input.nextDouble() * 0.15;
        totalGrades++;
        System.out.println("Enter Exam 3 grade:");
        double examThreeGrade = input.nextDouble() * 0.15;
        totalGrades++;
        System.out.println("Enter Final Exam grade:");
        double finalExamGrade = input.nextDouble() * 0.25;
        totalGrades++;
        System.out.println("There were " + totalGrades + " grades entered.");
        double finalGrade = (revelGrade + programmingGrade + labGrade + examOneGrade + examTwoGrade + examThreeGrade + finalExamGrade);
        System.out.println("The final grade for this course is " + finalGrade + ".");

        
    }
}
