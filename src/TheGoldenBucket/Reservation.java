package TheGoldenBucket;

public class Reservation {
    private Customer c;
    private String time;
    private String date;
    private Employee waiter;
    private Order[] orders;

    public Reservation(Customer c,String time, String date,Employee waiter, Order[] orders){
        this.c = c;
        this.time = time;
        this. = orders;
        this.waiter = waiter;
        this.date = date;
    }

    void addOrder(Order o){
        Utilities.enlargeOrderArray(orders);
        orders[orders.length]=o;
    }

    public Customer getC() {
        return c;
    }

    public void setC(Customer c) {
        this.c = c;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Employee getWaiter() {
        return waiter;
    }

    public void setWaiter(Employee waiter) {
        this.waiter = waiter;
    }

    public Order[] getOrders() {
        return orders;
    }

    public void setOrders(Order[] orders) {
        this.orders = orders;
    }
}
