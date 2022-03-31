package TheGoldenBucket2;

public class ListOrdersImpl implements ListOrders{
    private ListOrdersImpl.ListElement first;

    public class ListElement {
        Order o;
        ListOrdersImpl.ListElement next;
        ListElement (Order current, ListOrdersImpl.ListElement next){
            this.next = next;
            this.o = current;
        }
    }

    public boolean add(Order addOrder) {
        ListOrdersImpl.ListElement e = new ListOrdersImpl.ListElement(addOrder,null);

        if (first == null){
            first = e;
            return true;
        }

        ListOrdersImpl.ListElement current = first;

        while (current.next != null){
            if (current.o.orderId == addOrder.orderId){
                return true;
            } else {
                current = current.next;
            }
        }
        current.next = e;
        return true;
    }

    public boolean contains(Order checkOrder) {
        if (first == null){
            return false;
        }

        ListOrdersImpl.ListElement current = first;

        while (current.next != null){
            if (current.o.orderId == checkOrder.orderId){
                return true;
            } else {
                current = current.next;
            }
        }
        return false;
    }

    public boolean remove(Order o) {

        if (first == null){
            return false;
        }

        if (first.o.orderId == o.orderId){
            first = first.next;
            return true;
        }

        ListOrdersImpl.ListElement current = first;

        while (current.next != null){
            if (current.next.o.orderId == o.orderId){
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

        ListOrdersImpl.ListElement current = first;

        while (current.next != null) {
            i++;
            current = current.next;
        }
        return i++;
    }

    public ListOrdersImpl.ListElement getFirst (){
        return first;
    }
}
