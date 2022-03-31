package TheGoldenBucket;

public class Reservation {
    private Customer c;
    private String time;
    private String date;
    private Employee waiter;
    private Order[] orders;

    public Reservation(Customer c, String time, String date, Employee waiter, Order[] orders) {
        this.c = c;
        this.time = time;
        this.date = date;
        this.waiter = waiter;
        this.orders = orders;
    }


    public void setC(Customer c) {
        this.c = c;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public void setWaiter(Employee waiter) {
        this.waiter = waiter;
    }
    public void setOrders(Order[] orders) {
        this.orders = orders;
    }

    public Customer getC() {
        return c;
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
    public Order[] getOrders() {
        return orders;
    }

    void addOrder(Order o){
        Utilities.enlargeOrderArray(orders);
        orders[orders.length]=o;
    }
}
