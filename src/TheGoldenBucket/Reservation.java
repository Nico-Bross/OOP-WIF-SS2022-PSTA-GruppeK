package TheGoldenBucket;

public class Reservation {

    private Customer c;
    private String time;
    private String date;
    private Employee waiter;
    private Order[] orders;

    public Reservation(Customer c, String time, String date) {
        this.c = c;
        this.time = time;
        this.date = date;
    }

    public void addOrder(Order o) {
        this.orders = Utilities.enlargeOrderArray(orders);
        orders[orders.length-1] = o;
    }

    public void setWaiter(Employee waiter) {
        this.waiter = waiter;
    }
}
