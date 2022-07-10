package TheGoldenBucket2;

public class ListElement<T> {

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
