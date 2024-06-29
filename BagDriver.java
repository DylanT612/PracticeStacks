/*
I certify, that this computer program submitted by me is all of my own work.
Signed: Dylan Theis 6/14/2024

Author: Dylan Theis
Date: Summer 2024
Class: CSC322
Project: Sorted vs Unsorted Bags
Description: BagDriver is the main file
*/

import java.util.Scanner;

// Driver Program
public class BagDriver {
    public static void main(String[] args) {
        java.util.Scanner scanner = new Scanner(System.in);

        // Ask user for type of bag
        System.out.print("Which type of bag do you want? sorted/unsorted: ");
        String bagType = scanner.nextLine().trim();

        IBag<String> bag;
        // If user entered sorted or unsorted
        if (bagType.equalsIgnoreCase("sorted")) {
            bag = new SortedBag<String>();
        } else {
            bag = new UnsortedBag<String>();
        }

        // Ask user how many items to put in the bag
        System.out.print("How many items to put in the bag? ");
        int numItems = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // For the number they entered
        for (int i = 0; i < numItems; i++) {
            System.out.print("Enter item " + (i + 1) + ": ");
            // Add each item to bag
            String item = scanner.nextLine().trim();
            bag.add(item);
        }

        System.out.println();

        // Let user check for specific items
        System.out.println("You can check if something is in the bag. Check for (type done to stop):");
        String checkItem;
        // Loop keeps going until done is typed
        while (!(checkItem = scanner.nextLine().trim()).equalsIgnoreCase("done")) {
            // If the bag has or doesn't have the user input
            if (bag.contains(checkItem)) {
                System.out.println("Yes, it's in the bag.");
            } else {
                System.out.println("No, it's not in the bag.");
            }
        }

        System.out.println();

        // Print items from bag and remove the last item in the bag each time
        System.out.println("Let's remove stuff from the bag:");
        while (!bag.empty()) {
            System.out.println("Removing item: " + bag.remove());
        }

        scanner.close();
    }
}
