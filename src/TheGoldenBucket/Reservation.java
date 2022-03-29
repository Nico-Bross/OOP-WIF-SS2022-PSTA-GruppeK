package TheGoldenBucket;

public class Reservation {
    //protected Customer c;
    protected Customer name;

   protected String time;
   protected String date;
   protected Employee waiter;
   protected Order[] orders;

   public Reservation(String name, String time, String Date){

   }





    void addOrder(Order o){
        Utilities.enlargeOrderArray(orders);
        orders[orders.length]=o;
    }
}
