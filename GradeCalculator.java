import java.util.*;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks (0-100): ");
        int marks = sc.nextInt();

        char grade;

        // Convert marks to grade
        if (marks >= 90 && marks <= 100)
            grade = 'A';
        else if (marks >= 80)
            grade = 'B';
        else if (marks >= 70)
            grade = 'C';
        else if (marks >= 60)
            grade = 'D';
        else if (marks >= 0)
            grade = 'F';
        else {
            System.out.println("Invalid Marks!");
            sc.close();
            return;
        }

        // Display result using switch
        switch (grade) {
            case 'A':
                System.out.println("Grade: A");
                System.out.println("Excellent");
                break;

            case 'B':
                System.out.println("Grade: B");
                System.out.println("Very Good");
                break;

            case 'C':
                System.out.println("Grade: C");
                System.out.println("Good");
                break;

            case 'D':
                System.out.println("Grade: D");
                System.out.println("Pass");
                break;

            case 'F':
                System.out.println("Grade: F");
                System.out.println("Fail");
                break;
        }

        sc.close();
    }
}
