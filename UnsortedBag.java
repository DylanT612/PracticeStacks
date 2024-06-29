/*
I certify, that this computer program submitted by me is all of my own work.
Signed: Dylan Theis 6/14/2024

Author: Dylan Theis
Date: Summer 2024
Class: CSC322
Project: Sorted vs Unsorted Bags
Description: UnsortedBag overrides methods in IBag
*/

import java.util.ArrayList;

// UnsortedBag Implements IBag
class UnsortedBag<E> implements IBag<E> {
    // Create an ArrayList called data
    private ArrayList<E> data = new ArrayList<E>();

    // Overriding the methods in IBag
    @Override
    public void add(E item) {
        data.add(item);
    }

    @Override
    public E remove() {
        return data.remove(data.size() - 1);
    }

    @Override
    public boolean contains(E item) {
        return data.contains(item);
    }

    @Override
    public boolean empty() {
        return data.isEmpty();
    }
}