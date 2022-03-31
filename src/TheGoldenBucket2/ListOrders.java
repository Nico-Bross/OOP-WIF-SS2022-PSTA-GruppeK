package TheGoldenBucket2;

public interface ListOrders {
    public boolean add (Order o);
    public boolean contains (Order o);
    public boolean remove (Order o);
    public int size ();
    public ListOrdersImpl.ListElement getFirst ();
}
