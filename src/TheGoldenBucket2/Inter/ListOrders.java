package TheGoldenBucket2.Inter;

import TheGoldenBucket2.ListOrdersImpl;
import TheGoldenBucket2.Order;

public interface ListOrders {
    boolean add (Order o);
    boolean contains(Order o);
    boolean remove(Order o);
    int size();
    ListOrdersImpl.ListElement getFirst();
}
