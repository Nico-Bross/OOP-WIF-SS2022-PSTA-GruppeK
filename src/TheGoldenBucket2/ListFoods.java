package TheGoldenBucket2;

public interface ListFoods {
    public boolean add (Food f);
    public boolean contains (Food f);
    public boolean remove (Food f);
    public int size ();
    public ListFoodsImpl.ListElement getFirst ();
}
