package TheGoldenBucket2.Inter;

import TheGoldenBucket2.Help.Drink;
import TheGoldenBucket2.ListDrinksImpl;

public interface ListDrinks {
    boolean add(Drink d);
    boolean contains(Drink d);
    boolean remove(Drink d);
    int size();
    ListDrinksImpl.ListElement getFirst();
}
