/*
I certify, that this computer program submitted by me is all of my own work.
Signed: Dylan Theis 6/14/2024

Author: Dylan Theis
Date: Summer 2024
Class: CSC322
Project: Sorted vs Unsorted Bags
Description: The Interface for the bags
*/

// Interface for Bag
interface IBag<E> {
    // Basic methods to be overridden in each bag
    void add(E item);

    E remove();

    boolean contains(E item);

    boolean empty();
}