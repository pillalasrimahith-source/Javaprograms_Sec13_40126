import java.util.Scanner;
class PassFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Enter student's marks
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        // Check whether marks are 40 or above
        if (marks >= 40) {
            System.out.println("Student has Passed");
        } else {
            System.out.println("Student has Failed");
        }
}