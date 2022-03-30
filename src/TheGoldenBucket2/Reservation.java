package TheGoldenBucket2;

import TheGoldenBucket2.Help.Customer;
import TheGoldenBucket2.Help.Employee;
import TheGoldenBucket2.Inter.ListOrders;

public class Reservation {

    private Customer c;
    private String time;
    private String date;
    private Employee waiter;
    private ListOrders orders;

    Reservation (Customer c, String time, String date, Employee waiter){
        this.c = c;
        this.time = time;
        this.date = date;
        this.waiter = waiter;
        this.orders = new ListOrdersImpl();
    }

    public String getTime (){
        return time;
    }

    public void setTime (String time){
        this.time = time;
    }

    public String getDate (){
        return date;
    }

    public void setDate (String date){
        this.date = date;
    }

    public Employee getEmployee (){
        return waiter;
    }

    public void setEmployee (Employee waiter){
        this.waiter = waiter;
    }

    public boolean addOrder (Order o){
        return orders.add(o);
    }

    public ListOrders getOrders (){
        return orders;
    }

    public Customer getCustomer (){
        return c;
    }
}
