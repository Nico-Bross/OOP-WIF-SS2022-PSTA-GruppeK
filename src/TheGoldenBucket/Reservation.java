package TheGoldenBucket;

public class Reservation {
    Customer c;
    String time;
    String date;
    Employee waiter;
    Order[] orders;
    private static int reservationCounter = 0; //Bei 0 lassen oder höher anfangen ? -MB
    private int id;

    public Reservation(Customer c, String time, String date) {
        reservationCounter++;
        id = reservationCounter;
        this.c = c;
        this.time = time;
        this.date = date;
    }

    public Reservation(Customer c, String time, String date, Employee waiter, Order[] orders) {
        this(c, time, date);
        this.waiter = waiter;
        this.orders = orders;
    }


    void addOrder(Order o){
        Utilities.enlargeOrderArray(orders);
        orders[orders.length]=o;
    }
}
