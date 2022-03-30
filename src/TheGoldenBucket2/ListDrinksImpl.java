package TheGoldenBucket2;

import TheGoldenBucket2.Help.Drink;
import TheGoldenBucket2.Inter.ListDrinks;

public class ListDrinksImpl implements ListDrinks {

    private ListDrinksImpl.ListElement first;

    public class ListElement {
        Drink d;
        ListDrinksImpl.ListElement next;
        ListElement (Drink current, ListElement next){
            this.next = next;
            this.d = current;
        }
    }

    public boolean add(Drink addDrink) {
        ListDrinksImpl.ListElement e = new ListDrinksImpl.ListElement(addDrink,null);

        if (first == null){
            first = e;
            return true;
        }

        ListDrinksImpl.ListElement current = first;

        while (current.next != null){
            if (current.d == addDrink){
                return true;
            } else {
                current = current.next;
            }
        }
        current.next = e;
        return true;
    }

    public boolean contains(Drink checkDrink) {
        if (first == null){
            return false;
        }

        ListDrinksImpl.ListElement current = first;

        while (current.next != null){
            if (current.d == checkDrink){
                return true;
            } else {
                current = current.next;
            }
        }
        return false;
    }

    public boolean remove(Drink d) {

        if (first == null){
            return false;
        }

        if (first.d == d){
            first = first.next;
            return true;
        }

        ListDrinksImpl.ListElement current = first;

        while (current.next != null){
            if (current.next.d == d){
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

        ListDrinksImpl.ListElement current = first;

        while (current.next != null) {
            i++;
            current = current.next;
        }
        return i++;
    }

    public ListDrinksImpl.ListElement getFirst (){
        return first;
    }
}
