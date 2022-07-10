package TheGoldenBucket2;
import java.util.Iterator;

public class GenericImpl<T> implements ListGeneric<T> {

    ListElement<T> first;

    @Override
    public boolean add(T addData) {
        ListElement<T> newElement = new ListElement<T>(addData, null);

        if(first == null){
            first = newElement;
            return true;
        }

        else{
            ListElement current = first;
            while(current.next != null){
                current = current.next;
            }
            current.next = newElement;
        }
        return false;
    }

    @Override
    public boolean remove(T d) {

        if (first == null){
            return false;
        }

        if (first.content == d){
            first = first.next;
            return true;
        }

        ListElement<T> current = first;

        while (current.next != null){
            if (current.next.content == d){
                current.next = current.next.next;
                return true;
            }
            current = current.next;

        }
        return false;
    }

    @Override
    public boolean contains(T d) {
        if(first == null){
            return true;
        }

        ListElement<T> current = first;

        while(current.next != null){
            if (!(current.content.equals(current.next.content))){
                return false;
            }
            current = current.next;
        }

        return true;
    }


    @Override
    public int size() {

        int result = 0;

        ListElement<T> currentPosition = first;
        while (currentPosition != null) {
            result++;
            currentPosition = currentPosition.next;
        }
        return result;
    }

    @Override
    public String toString(){
        String output;
        if (first == null){
            return "List is empty! \n";
        }else{

            ListElement current = first;
            output = "list of ListElements in following lines\n";
            while (current != null) {
                output += current.content.toString() + "\n";
                current = current.next;
            }
            output += "(end of ListElements)";
        }
        return output;
    }

    @Override
    public ListElement<T> getFirst() {
        return first;
    }


}
