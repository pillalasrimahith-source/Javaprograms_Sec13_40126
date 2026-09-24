import java.util.Scanner;
class Grade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Enter student's marks
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        // Check the grade
        if (marks >= 90 && marks <= 100) {
            System.out.println("Grade A");
        }
        else if (marks >= 75 && marks <= 89) {
            System.out.println("Grade B");
        }
        else if (marks >= 60 && marks <= 74) {
            System.out.println("Grade C");
        }
        else if (marks >= 40 && marks <= 59) {
            System.out.println("Grade D");
        }
        else {
            System.out.println("Fail");
        }

    }
}