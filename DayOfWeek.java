import java.util.Scanner;
public class DayOfWeek {
public static void main(String[] args) {    
// Enter a number from 1 to 7
        
System.out.print("Enter a number (1-7): ");
        int day = sc.nextInt();

        // Display day name using switch-case
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid day number");
      }
    }
}
 