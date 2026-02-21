import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        

        String[] itemNames = new String[10];
        double[] itemPrices = new double[10];
        int[] itemStocks = new int[10];

        

        Scanner sc = new Scanner(System.in);

    

        
    }

    // Inventory Display
    public static void printInventory(String[] names, double[] prices, int[] stocks) {
        for (int i = 0; i < names.length; i++) {
            if (names[i] != null) { // only print slots that aren't empty
                System.out.println(names[i] + " - $" + prices[i] + " - Stock: " + stocks[i]);
            }
        }
    }

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