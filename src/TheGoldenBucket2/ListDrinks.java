package TheGoldenBucket2;

public interface ListDrinks {
    public boolean add (Drink d);
    public boolean contains (Drink d);
    public boolean remove (Drink d);
    public int size ();
    public ListDrinksImpl.ListElement getFirst ();
}
