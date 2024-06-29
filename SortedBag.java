/*
I certify, that this computer program submitted by me is all of my own work.
Signed: Dylan Theis 6/14/2024

Author: Dylan Theis
Date: Summer 2024
Class: CSC322
Project: Sorted vs Unsorted Bags
Description: SortedBag overrides methods in IBag and uses binary search
*/

import java.util.ArrayList;

// Sorted Bag Implements IBag and implements Comparable to use sorting(binary search)
class SortedBag<E extends Comparable<E>> implements IBag<E> {
    // Create new ArrayList called data
    private ArrayList<E> data = new ArrayList<E>();

    // Overrides methods in IBag
    // Add method adds item while having a
    //        }sorted order
    @Override
    public void add(E item) {
        int index = 0;
        // Increments the new spot for item in list [Z-A]
        while (index < data.size() && data.get(index).compareTo(item) > 0) {
            index++;
        }
        // At item at the index above
        data.add(index, item);

    }

    // Removing last item from list
    @Override
    public E remove() {
        return data.remove(data.size() - 1);
    }

    // Contains method checks if list contains item using binary search
    @Override
    public boolean contains(E item) {
        return binarySearch(item, 0, data.size() - 1);
    }

    // Binary Search
    private boolean binarySearch(E item, int left, int right) {
        // Base Case: if left is greater than right it means item not in list
        if (left > right) {
            return false;
        }
        // Find midpoint
        int mid = left + (right - left) / 2;
        // Check the middle item
        if (data.get(mid).equals(item)) {
            return true;
        // If element is greater than item, search right half
        } else if (data.get(mid).compareTo(item) > 0) {
            return binarySearch(item, mid + 1, right);
        // If element is less than item, search the left half
        } else {
            return binarySearch(item, left, mid - 1);
        }
    }

    // Overrides IBags empty method
    @Override
    public boolean empty() {
        return data.isEmpty();
    }
}
