import java.util.Scanner;
class GrossSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Enter basic salary
        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        // Enter HRA
        System.out.print("Enter HRA: ");
        double hra = sc.nextDouble();

        // Enter allowance
        System.out.print("Enter Allowance: ");
        double allowance = sc.nextDouble();

        // Calculate gross salary
        double gross = basic + hra + allowance;

        // Display gross salary
        System.out.println("Gross Salary: " + gross);

    }
}