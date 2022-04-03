package TheGoldenBucket2;

import TheGoldenBucket2.Help.Food;
import TheGoldenBucket2.Inter.ListFoods;

public class ListFoodsImpl implements ListFoods {

    private ListElement first;

    public static class ListElement {
        Food f;
        ListElement next;
        ListElement(Food current, ListElement next) {
            this.next = next;
            this.f = current;
        }
    }

    public boolean add(Food addFood) {
        ListElement e = new ListElement(addFood, null);

        if (first == null) {
            first = e;
            return true;
        }

        ListElement current = first;

        while (current.next != null) {
            if (current.f == addFood) {
                return true;
            } else {
                current = current.next;
            }
        }
        current.next = e;
        return true;
    }

    public boolean contains(Food checkFood) {
        if (first == null) {
            return false;
        }

        ListElement current = first;

        while (current.next != null) {
            if (current.f == checkFood) {
                return true;
            } else {
                current = current.next;
            }
        }
        return false;
    }

    public boolean remove(Food f) {

        if (first == null) {
            return false;
        }

        if (first.f == f) {
            first = first.next;
            return true;
        }

        ListElement current = first;

        while (current.next != null) {
            if (current.next.f == f) {
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

        ListElement current = first;

        while (current.next != null) {
            i++;
            current = current.next;

        }
        return i;
    }

    public ListElement getFirst () {
        return first;
    }
}
