package TheGoldenBucket2;

public interface ListOrders {
    boolean add (Order o);
    boolean contains (Order o);
    boolean remove (Order o);
    int size ();
    ListOrdersImpl.ListElement getFirst ();
}
