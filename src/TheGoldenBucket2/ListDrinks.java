package TheGoldenBucket2;

public interface ListDrinks {
     boolean add (Drink d);
     boolean contains (Drink d);
     boolean remove (Drink d);
     int size ();
     ListDrinksImpl.ListElement getFirst ();
}
