package TheGoldenBucket2.Inter;

import TheGoldenBucket2.Help.Food;
import TheGoldenBucket2.ListFoodsImpl;

public interface ListFoods {
    boolean add(Food f);
    boolean contains(Food f);
    boolean remove(Food f);
    int size();
    ListFoodsImpl.ListElement getFirst();
}
