package TheGoldenBucket2;

import TheGoldenBucket2.Inter.ListOrders;

public class ListOrdersImpl implements ListOrders {

    private ListElement first;

    public static class ListElement {
        private Order o;
        private ListElement next;
        ListElement(Order current, ListElement next) {
            this.next = next;
            this.o = current;
        }

        public Order getO() {
            return o;
        }
        public ListElement getNext() {
            return next;
        }
    }

    public boolean add(Order addOrder) {
        ListElement e = new ListElement(addOrder, null);

        if (first == null) {
            first = e;
            return true;
        }

        ListElement current = first;

        while (current.next != null) {
            if (current.o.getOrderId() == addOrder.getOrderId()) {
                return true;
            } else {
                current = current.next;
            }
        }
        current.next = e;
        return true;
    }

    public boolean contains(Order checkOrder) {
        if (first == null) {
            return false;
        }

        ListElement current = first;

        while (current.next != null) {
            if (current.o.getOrderId() == checkOrder.getOrderId()) {
                return true;
            } else {
                current = current.next;
            }
        }
        return false;
    }

    public boolean remove(Order o) {

        if (first == null) {
            return false;
        }

        if (first.o.getOrderId() == o.getOrderId()) {
            first = first.next;
            return true;
        }

        ListElement current = first;

        while (current.next != null) {
            if (current.next.o.getOrderId() == o.getOrderId()) {
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
