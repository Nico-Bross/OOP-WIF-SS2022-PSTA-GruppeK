package TheGoldenBucket;

public class TheGoldenBucketRestaurant {
    public static void main(String[] args) {
        Customer max = new Customer("Maxwell Powers");


        Reservation maxReservation = new Reservation();
        maxReservation.setCustomer(max);
        maxReservation.setDate("31.03.2022");
        maxReservation.setTime("8pm");

        Employee peter = new Employee("Peter Griffin","Waiter");

        Employee lois = new Employee("Lois","Cook");

        maxReservation.setWaiter(peter);

        // Later that evening Maxwell Powers likes to order some food and drinks
        Order order1 = new Order();
        maxReservation.addOrder(order1);
        order1.addDrink(new Drink("Coke", 395));
        order1.addDrink(new Drink("Negroni Cocktail",500));


        order1.addFood(new Food("Pizza Magharita" , 1050));
        order1.addFood(new Food("Antipasti Selection" , 970));


        System.out.println( "Dear Guest "+
                            max.getName()+
                            " We thank you so much for yur Business. Tonight you had "+
                            order1.getNumber_of_drinks()+
                            " Drinks and you ordered "+
                            order1.getNumber_of_foods()+
                            " different variations of our food. ");
    }
}
