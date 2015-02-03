package lab03;

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

    @Override
    public T getCurrentSize() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isFull() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(T item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T remove() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean remove(T item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
