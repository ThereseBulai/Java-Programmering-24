import java.util.Scanner;

public class GradingSystem {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       char actualGrade = 'C';

       System.out.print("Enter your grade (A, B, C, D, or F): ");
       char grade = scanner.next().charAt(0);

       // Task 1: Check if grade actually matches the input.
       // Task: Convert the if/else into a switch case structure.
       /* 
       if (grade == 'A') {
           System.out.println("Excellent! You scored above 90.");
       } else if (grade == 'B') {
           System.out.println("Well done! You scored between 80 and 90.");
       } else if (grade == 'C') {
           System.out.println("Good effort! You scored between 70 and 80.");
       } else if (grade == 'D') {
           System.out.println("You passed, but consider improving. You scored between 60 and 70.");
       } else if (grade == 'F') {
           System.out.println("Unfortunately, you failed. You scored below 60.");
       } else {
           System.out.println("Invalid grade input.");
       }
*/
       switch (grade){
        case A:
            System.out.println("Excellent! You scored above 90.");

       }
       scanner.close();
   }
}