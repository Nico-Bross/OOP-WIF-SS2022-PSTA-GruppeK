package TheGoldenBucket2;

public interface ListFoods {
     boolean add (Food f);
     boolean contains (Food f);
     boolean remove (Food f);
     int size ();
     ListFoodsImpl.ListElement getFirst ();
}
