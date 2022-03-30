package TheGoldenBucket2;

public class ListFoodsImpl implements ListFoods{

    private ListFoodsImpl.ListElement first;

    public class ListElement {
        Food f;
        ListFoodsImpl.ListElement next;
        ListElement (Food current, ListFoodsImpl.ListElement next){
            this.next = next;
            this.f = current;
        }
    }

    public boolean add(Food addFood) {
        ListFoodsImpl.ListElement e = new ListFoodsImpl.ListElement(addFood,null);

        if (first == null){
            first = e;
            return true;
        }

        ListFoodsImpl.ListElement current = first;

        while (current.next != null){
            if (current.f== addFood){
                return true;
            } else {
                current = current.next;
            }
        }
        current.next = e;
        return true;
    }

    public boolean contains(Food checkFood) {
        if (first == null){
            return false;
        }

        ListFoodsImpl.ListElement current = first;

        while (current.next != null){
            if (current.f == checkFood){
                return true;
            } else {
                current = current.next;
            }
        }
        return false;
    }

    public boolean remove(Food f) {

        if (first == null){
            return false;
        }

        if (first.f == f){
            first = first.next;
            return true;
        }

        ListFoodsImpl.ListElement current = first;

        while (current.next != null){
            if (current.next.f == f){
                current.next = current.next.next;
                return true;
            } else {
                current = current.next;
            }
        }
        return false;
    }

    public int size() {
        int i = 1;

        ListFoodsImpl.ListElement current = first;

        while (current.next != null) {
            i++;
            current = current.next;

        }
        return i++;
    }

    public ListFoodsImpl.ListElement getFirst (){
        return first;
    }
}
