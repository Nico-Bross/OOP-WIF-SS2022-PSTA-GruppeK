package TheGoldenBucket;

public class Reservation {
    Customer c;
    String time;
    String date;
    Employee waiter;
    Order[] orders;

    void addOrder(Order o){
        this.orders = Utilities.enlargeOrderArray(orders);
        orders[orders.length-1]=o;
    }
}
