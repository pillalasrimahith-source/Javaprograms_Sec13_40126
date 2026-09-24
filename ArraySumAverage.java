import java.util.Scanner;
public class ArraySumAverage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Accept the number of elements
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        // Create a one-dimensional array
        int[] arr = new int[n];

        int sum = 0;

        // Accept array elements and calculate sum
        System.out.println("Enter " + n + " numbers:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }

        // Calculate average
        double average = (double) sum / n;

        // Display sum and average
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);

    }
}
System.out.println("Element is not present in the array.");
        }

    }
}s