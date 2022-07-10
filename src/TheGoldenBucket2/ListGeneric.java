package TheGoldenBucket2;

public interface ListGeneric <T> {

    public boolean add (T d);
    public boolean contains (T d);
    public boolean remove (T d);
    public int size ();
    public String toString();

    ListElement<T> getFirst();
}
