import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Parallel arrays1

        String[] itemNames = new String[10];
        double[] itemPrices = new double[10];
        int[] itemStocks = new int[10];

        

        Scanner sc = new Scanner(System.in);

        while (true) {
            // Task 3: User menu
            System.out.println("\nMenu:");
            System.out.println("1. View Inventory");
            System.out.println("2. Restock Item");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume leftover newline

            if (choice == 1) {
                printInventory(itemNames, itemPrices, itemStocks);
            } else if (choice == 2) {
                System.out.print("Enter item name to restock: ");
                String target = sc.nextLine();

                System.out.print("Enter amount to add: ");
                int amount = sc.nextInt();
                sc.nextLine(); // consume newline

                restockItem(itemNames, itemStocks, target, amount);
            } else if (choice == 3) {
                System.out.println("Exiting program.");
                break;
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }
    }

    // Task 1: Inventory Display
    

        
    }

    // Inventory Display
    public static void printInventory(String[] names, double[] prices, int[] stocks) {
        for (int i = 0; i < names.length; i++) {
            if (names[i] != null) { // only print slots that aren't empty
                System.out.println(names[i] + " - $" + prices[i] + " - Stock: " + stocks[i]);
            }
        }
    }

    // Task 2: Restock & Search
    //Restock & Search
    public static void restockItem(String[] names, int[] stocks, String target, int amount) {
        boolean found = false;

        for (int i = 0; i < names.length; i++) {
            if (names[i] != null && names[i].equals(target)) {
                stocks[i] += amount;
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Item not found.");
        }
    }
}