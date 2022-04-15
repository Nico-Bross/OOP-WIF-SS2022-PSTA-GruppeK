package CreazyStation;

public class LinkedListTrain{

    class Node {

        Car data;
        Node next;

        Node(Car data)   { this.data = data; }
    }

    Node head;
    Station station;
    CentralStation central;

    public LinkedListTrain(Station station, CentralStation central){
        this.station = station;
        this.central = central;
    }

    public void add(Car v) {
        Node neuesElement = new Node();
        neuesElement.data=v;
        neuesElement.next=null;

        /*
        if(head == null){
            head = neuesElement;
            return;
        }
        */
        neuesElement.next=head;
        head = neuesElement;
        /*
        Element it = head;
        while(it.next!=null){
            it=it.next;
        }
        it.next= neuesElement;
        */
    }



    public CentralStation getCentral() { return this.central;   }

}



