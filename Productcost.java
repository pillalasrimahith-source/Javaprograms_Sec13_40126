class Productcost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get product price
        System.out.print("Enter product price: ");
        double price = sc.nextDouble();

        // Get quantity
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();
        // Calculate total cost
        double total = price * quantity;

        // Display the details
        System.out.println("Product Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Amount: " + total);
    }
}