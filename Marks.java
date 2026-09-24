import java.util.Scanner;
public class Marks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Enter marks of three subjects
        System.out.print("Enter marks of Subject 1: ");
        double m1 = sc.nextDouble();

        System.out.print("Enter marks of Subject 2: ");
        double m2 = sc.nextDouble();

        System.out.print("Enter marks of Subject 3: ");
        double m3 = sc.nextDouble();

        // Calculate total marks
        double total = m1 + m2 + m3;

        // Calculate average marks
        double average = total / 3;

        // Display the results
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
    }
}