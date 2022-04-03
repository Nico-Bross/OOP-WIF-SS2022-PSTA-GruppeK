package TheGoldenBucket2;

import TheGoldenBucket2.Help.*;
import TheGoldenBucket2.Inter.ListOrders;

public class Reservation {

    private Customer c;
    private String time;
    private String date;
    private Employee waiter;
    private ListOrders orders;

    Reservation(Customer c, String time, String date, Employee waiter) {
        this.c = c;
        this.time = time;
        this.date = date;
        this.waiter = waiter;
        this.orders = new ListOrdersImpl();
    }

    public void addOrder(Order o) {
        orders.add(o);
    }

    public Customer getCustomer() {
        return c;
    }

    public String getTime() {
        return time;
    }

    public String getDate() {
        return date;
    }

    public Employee getEmployee() {
        return waiter;
    }

    public ListOrders getOrders() {
        return orders;
    }
}
