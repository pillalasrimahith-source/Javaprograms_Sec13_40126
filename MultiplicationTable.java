import java.util.Scanner;
class MultiplicationTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Enter a number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Print multiplication table from 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

    }
}