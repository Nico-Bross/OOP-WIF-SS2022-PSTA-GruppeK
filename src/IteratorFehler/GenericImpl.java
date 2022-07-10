package IteratorFehler;

import java.util.Iterator;

public class GenericImpl<T> implements ListGeneric<T> {

    ListElement<T> first;

    public Iterator<T> iterator() {
        return new Iterator<>() {
            private ListElement<T> head = first;

            @Override
            public boolean hasNext() { //
                return head != null;
            }

            @Override
            public T next() {
                T h = head.content;
                head = head.next;
                return h;

            }
        };
    }

    private class ListElement<T> {

        T content;
        ListElement<T> next;

        public ListElement(T content, ListElement next){
            this.content = content;
            this.next = next;
        }

        public T get() {return content;}

        @Override
        public String toString(){
            return "Node ( " +
                    "content" + content +
                    "; next=" + next +
                    " )";

        }
    }



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
            return false;
        }

        ListElement<T> current = first;

        while(current.next != null){
            if (!(current.content.equals(current.next.content))){
                return true;
            }
            current = current.next;
        }

        return false;
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
    public T getFirst() {
        return first.content;
    }


}
