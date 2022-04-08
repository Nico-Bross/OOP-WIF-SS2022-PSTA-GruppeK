package TheGoldenBucket;

public class Reservation {
    Customer c;
    String time;
    String date;
    Employee waiter;
    Order[] orders;

    public Reservation(){}

    public Reservation(Customer c, String time, String date){
        this.c = c;
        this.time = time;
        this.date = date;
    }

    void addWaiter(Employee e){
        this.waiter = e;
    }

    void addOrder(Order o){
        this.orders = Utilities.enlargeOrderArray(orders);
        orders[orders.length-1]=o;
    }
}
