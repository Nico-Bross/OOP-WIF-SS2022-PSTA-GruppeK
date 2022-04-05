package TheGoldenBucket;

public class TheGoldenBucketRestaurant {
    public static void main(String[] args) {
        Customer max = new Customer("Maxwell Powers");

        Reservation maxReservation = new Reservation();
        maxReservation.c=max;
        maxReservation.date="31.03.2022";
        maxReservation.time="8pm";

        Employee peter = new Employee("Peter Griffin","Waiter");
        Employee lois = new Employee("Lois Griffin","Cook");

        maxReservation.waiter=peter;

        // Later that evening Maxwell Powers likes to order some food and drinks
        Order o = new Order();
        o.drinks = new Drink[2];
        o.addDrink(new Drink("Coke",395));
        o.addDrink(new Drink("Negroni Cocktail",578));


        o.addFood(new Food("Pizza Magherita",1050));
        o.addFood(new Food("Antipasti Selection",970));

        System.out.println( "Dear Guest "+
                            max.getName()+
                            " We thank you so much for yur Business. Tonight you had "+
                            o.number_of_drinks+
                            " Drinks and you ordered "+
                            o.number_of_foods+
                            " different variations of our food. ");
    }
}
