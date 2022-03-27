package TheGoldenBucket;

public class TheGoldenBucketRestaurant {

    public static void main(String[] args) {

        Customer max = new Customer("Maxwell Powers");
        Reservation maxReservation = new Reservation(max,"8pm","31.03.2022");

        Employee peter = new Employee("Peter Griffin","Waiter");
        Employee lois = new Employee("Lois Griffin","Cook");

        maxReservation.setWaiter(peter);

        // Later that evening Maxwell Powers likes to order some food and drinks
        Drink[] drinks = new Drink[] { new Drink("Coke",395),
                                       new Drink("Negroni Cocktail", 900) };
        Food[] foods = new Food[] { new Food("Pizza Magherita",1050),
                                    new Food("Antipasti Selection",970) };

        Order o = new Order(max, maxReservation, drinks, foods);


        System.out.println( "Dear Guest " +
                            max.getName() +
                            ". We thank you so much for yur Business.\nTonight you had "+
                            o.getNumber_of_drinks() +
                            " Drinks and you ordered " +
                            o.getNumber_of_foods() +
                            " different variations of our food." );
    }
}
