import java.util.Scanner;
public class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept number of elements
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        // Create a one-dimensional array
        int[] arr = new int[n];

        // Accept array elements
        System.out.println("Enter " + n + " integer elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Accept the element to search
        System.out.print("Enter element to search: ");
        int search = sc.nextInt();

        boolean found = false;

        // Search for the element
        for (int i = 0; i < n; i++) {
            if (arr[i] == search) {
                found = true;
                break;
            }
        }

        // Display the result
        if (found) {
            System.out.println("Element is present in the array.");
        } else {