import java.util.Scanner;
public class CopyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept number of elements
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        // Create two arrays
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        // Accept elements for first array
        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        // Copy elements from first array to second array
        for (int i = 0; i < n; i++) {
            arr2[i] = arr1[i];
        }
        // Display first array
        System.out.println("First Array:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }
        // Display second array
        System.out.println("\nSecond Array:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
