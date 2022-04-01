package TheGoldenBucket;

public class Reservation {
    private Customer c;
    private String time;
    private String date;
    private Employee waiter;
    private Order[] orders;

    public Reservation(Customer c , String time, String date, Employee waiter){
        this.c = c;
        this.time = time;
        this.date = date;
        this.waiter = waiter;
        orders = new Order[0];
    }

    void addOrder(Order o){
        Utilities.enlargeOrderArray(orders);
        orders[orders.length-1]=o;
    }

    public String getTime() {
        return time;
    }

    public String getDate() {
        return date;
    }

    public Employee getWaiter() {
        return waiter;
    }
}

//Test-Kommentar

//Hallo zurück
//Hallo Wie gehts
//Gut wie ist das Wetter bei dir?