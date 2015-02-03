package lab03;

import java.util.Random;

/**
 *
 * @author jaden.young
 */
public class ArrayBag<T> implements Bag<T> {

    private T[] bag;
    private int count;
    
    /**
     * Default constructor<BR>
     * Creates an array of generic type with length 50
     */
    public ArrayBag() {
        Object[] temp = new Object[50];
        bag = (T[])temp;
        temp = null;
    }
    
    /**
     * Overloaded constructor<BR>
     * Creates an array of generic type with specified length
     * @param size Length of the array
     */
    public ArrayBag(int size) {
        Object[] temp = new Object[size];
        bag = (T[])temp;
        temp = null;
    }

    /** Returns the number of items in the bag */
    @Override
    public int getCurrentSize() {
        return count;
    }

    /** Returns true if the bag is empty, false if not */
    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    /** Returns true if the bag is full, false if not */
    @Override
    public boolean isFull() {
        return count == bag.length;
    }

    /**
     * Adds an item to the end of the bag.<BR>
     * If the bag is full, the length is doubled, and the item is then added.
     * Returns true if the addition was successful, false if not
     * @param item Item to be added
     * @return True if the item was added successfully, false if not
     */
    @Override
    public boolean add(T item) {
        boolean success = false;
        if(count == bag.length) {
            Object[] temp = new Object[2 * bag.length];
            for(int i = 0; i < count; i++) {
                temp[i] = bag[i];
            }
            bag = (T[])temp;
            temp = null;
        }
        bag[count] = item;
        count++;
        return bag[count - 1] == item;
    }

    /**
     * Removes a random item from the bag.<BR>
     * Returns the removed item
     * @return item removed from the bag
     */
    @Override
    public T remove() {
        Random rand = new Random();
        int index = rand.nextInt(count);
        T removed = bag[index];
        for(int i = index; i < count; i++) {
            bag[i] = bag[i + 1];
        }
        count--;
        return removed;
    }

    
    @Override
    public boolean remove(T item) {
        boolean foundMatch = false;
        int curIndex = 0;
        while(curIndex < count && !foundMatch) {
            if(bag[curIndex].equals(item)) {
                for(int i = curIndex; i < count; i++) {
                    bag[i] = bag[i + 1];
                }
                count--;
                return true;
            }
            
        }
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getFrequencyOf(T item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean contains(T item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
