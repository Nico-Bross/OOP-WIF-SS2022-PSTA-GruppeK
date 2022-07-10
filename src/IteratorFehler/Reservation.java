package IteratorFehler;

public class Reservation {
    private Customer c;
    private String time;
    private String date;
    private Employee waiter;
    private GenericImpl<Order> orders;

    Reservation (Customer c, String time, String date, Employee waiter){
        this.c = c;
        this.time = time;
        this.date = date;
        this.waiter = waiter;
        orders = new GenericImpl();
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

    public GenericImpl<Order> getOrders (){
        return orders;
    }

    public Customer getCustomer (){
        return c;
    }
}
