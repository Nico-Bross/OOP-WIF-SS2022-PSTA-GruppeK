package TheGoldenBucket;

import java.util.Arrays;

public class Reservation {

    private Customer c;
    private String time;
    private String date;
    private Employee[] employees;
    private Order[] orders;

    public Reservation(Customer c, String time, String date, Employee[] employees) {
        this.c = c;
        this.time = time;
        this.date = date;
        this.employees = employees;
        this.orders = new Order[0];
    }

    public void addOrder(Order o) {
        orders = Utilities.enlargeOrderArray(orders);
        orders[orders.length-1] = o;
    }

    @Override
    public String toString() {
        return "Order(s):\n" + Arrays.toString(orders) + "\nReservation:\n" +
                c.getName() + " at " + time + " on " + date +
                "\nEmployees:" + Arrays.toString(employees);
    }
}
