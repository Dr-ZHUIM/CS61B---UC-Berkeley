package lesson6_ALists;

import lesson8_inheritance_implements.MyList;

/* Invariant
 *  - addLast: The next item we want to add, will go into position size.
 *  - getLast: The item we want to return is in position size - 1.
 *  - size: The nubmer of items in the list should be size.
 */

public class AList<Item> implements MyList<Item> {
    private Item[] items;
    private int size;

    /** Create an empty list */
    public AList() {
        items = (Item[]) new Object[100];
        size = 0;
    }

    private void resize(int capacity) {
        Item[] newArray = (Item[]) new Object[capacity];
        System.arraycopy(items, 0, newArray, 0, size);
        items = newArray;
    }

    /** Inserts X into the back of the list: */
    public void addLast(Item x) {
        if (size == items.length) {
            resize(size + 1);
        }
        items[size] = x;
        size += 1;
    }

    /** Gets the last from the back of the list */
    public Item getLast() {
        return items[size - 1];
    }

    /** Gets the ith item in the list */
    public Item get(int i) {
        return items[i];
    }

    /** Gets the numbers of items in the list */
    public int size() {
        return size;
    }

    /** Deletes the last item from back of the list and return deleted Item */
    public Item removeLast() {
        Item returnItem = getLast();
        items[size - 1] = null;
        size -= 1;
        return returnItem;
    }

}
