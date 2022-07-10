package IteratorFehler;

import java.util.Iterator;

public interface ListGeneric <T> {

    public Iterator<T> iterator();

    public boolean add (T d);
    public boolean contains (T d);
    public boolean remove (T d);
    public int size ();
    public String toString();

    T getFirst();
}
