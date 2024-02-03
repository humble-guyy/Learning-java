package day4;
import java.util.Scanner;
public class grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the student's score:");
        int score = scanner.nextInt();

        char grade = (score >= 90) ? 'A' : (score >= 80) ? 'B' : (score >= 70) ? 'C' : (score >= 60) ? 'D' : 'F';

        System.out.println("Student's Grade: " + grade);
    }
}

