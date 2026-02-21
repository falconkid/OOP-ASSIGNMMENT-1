import java.util.Scanner;

/**
 * Main class for managing a simple inventory system using parallel arrays.
 * Allows viewing inventory, restocking items, and exiting the program.
 */

public class Main {

    /**
     * The entry point of the program.
     * Displays a menu for the user to interact with the inventory.
     *
     * @param args command line arguments (not used)
     */

    public static void main(String[] args) {
        

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

    
     /**
     * Prints the current inventory to the console.
     * Only prints items that are not null.
     *
     * @param names  array of item names
     * @param prices array of item prices corresponding to names
     * @param stocks array of item stock quantities corresponding to names
     */

    public static void printInventory(String[] names, double[] prices, int[] stocks) {
        for (int i = 0; i < names.length; i++) {
            if (names[i] != null) { // only print slots that aren't empty
                System.out.println(names[i] + " - $" + prices[i] + " - Stock: " + stocks[i]);
            }
        }
    }

    // Task 2: Restock & Search
    //Restock & Search

    /**
     * Restocks a specific item in the inventory by a given amount.
     * If the item is not found, prints "Item not found."
     *
     * @param names  array of item names
     * @param stocks array of item stock quantities corresponding to names
     * @param target the name of the item to restock
     * @param amount the quantity to add to the item's stock
     */
    
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
