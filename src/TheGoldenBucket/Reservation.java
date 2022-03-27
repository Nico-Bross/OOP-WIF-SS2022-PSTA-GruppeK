package TheGoldenBucket;

public class Reservation {
    private Customer customer;
    private String time;
    private String date;
    private Employee waiter;
    private Order[] orders;

    public Reservation(){
        orders = new Order[0];
    }


    void addOrder(Order o){
        orders = Utilities.enlargeOrderArray(orders);
        orders[0]=o;
    }


    public void setTime(String time) {
        this.time = time;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setWaiter(Employee waiter) {
        this.waiter = waiter;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
