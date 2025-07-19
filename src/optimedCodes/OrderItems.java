package optimedCodes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderItems {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            List<String> listOfItems = new ArrayList<>();

            while (true) {
                System.out.println(listOfItems.toString());
                System.out.println("\nSelect an option (Enter Number):");
                System.out.println("1. Add Product");
                System.out.println("2. Remove Item");
                System.out.println("3. Check Item");
                System.out.println("4. Exit");

                int choice;
                if (scanner.hasNextInt()) {
                    choice = scanner.nextInt();
                    scanner.nextLine();
                } else {
                    System.out.println("Please enter a valid number.");
                    scanner.nextLine();
                    continue;
                }


                switch (choice) {
                    case 1:
                        System.out.print("Enter Product Name to Add: ");
                        String item = scanner.nextLine();
                        listOfItems.add(item);
                        System.out.println("Product Added: " + item);
                        break;
                    case 2:
                        System.out.print("Enter Product Name to Remove: ");
                        String removeItem = scanner.nextLine();
                        if (listOfItems.remove(removeItem)) {
                            System.out.println("Product Removed: " + removeItem);
                        } else {
                            System.out.println("Product does not exist.");
                        }
                        break;
                    case 3:
                        System.out.print("Enter Product Name to Check: ");
                        String checkItem = scanner.nextLine();
                        if (listOfItems.contains(checkItem)) {
                            System.out.println("Product exists in the list.");
                        } else {
                            System.out.println("Product not found.");
                        }
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Please enter a valid option from 1 to 4");
                }
            }
        }
    }
}
