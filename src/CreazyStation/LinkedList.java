package CreazyStation;

public class LinkedList {

    public ListElement head;

    public LinkedList(){}

    public LinkedList(ListElement head){
        this.head = head;
    }

    public void insertLast(Car car){
        ListElement newElement = new ListElement(car);
        if (head == null){
            head = newElement;
        }else{
            ListElement last = this.head;
            while(last.next != null){
                last = last.next;
            }
            last.next = newElement;
        }
    }

    public Car deleteFirst(){
        if(head == null){
            return null;
        }
        ListElement oldHead = head;
        head = head.next;
        return oldHead.car;
    }
    @Override
    public String toString(){
        String s;
        if (head == null){
            return "";
        }else{

            ListElement current = this.head;
            s = "list of cars in following lines\n";
            while (current != null) {
                s += current.car.toString() + "\n";
                current = current.next;
            }
            s += "(end of car list)";

            }
            return s;
        }

    public int getListLength() {
        int result = 0;
        ListElement currentPosition = head;
        while (currentPosition != null) {
            result++;
            currentPosition = currentPosition.next;
        }
        return result;
    }
}
