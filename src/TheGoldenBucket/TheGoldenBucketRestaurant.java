package TheGoldenBucket;

public class TheGoldenBucketRestaurant {

    public static void main(String[] args) {

        Customer max = new Customer("Maxwell Powers");
        Employee[] employees = new Employee[] { new Employee("Peter Griffin","Waiter"),
                                                new Employee("Lois Griffin","Cook") };
        Reservation maxReservation = new Reservation(max,"8pm","31.03.2022", employees);

        // Later that evening Maxwell Powers likes to order some food and drinks
        Drink[] drinks = new Drink[] { new Drink("Coke",395),
                                       new Drink("Negroni Cocktail", 900) };
        Food[] foods = new Food[] { new Food("Pizza Magherita",1050),
                                    new Food("Antipasti Selection",970) };

        // Creating, filling and adding Order
        Order o = new Order();
        for (Drink d : drinks) {
            o.addDrink(d);
        }
        for (Food f : foods) {
            o.addFood(f);
        }
        maxReservation.addOrder(o);

        System.out.println( "Dear Guest " +
                            max.getName() +
                            ". We thank you so much for your Business.\n" +
                            "Tonight you had " +
                            o.getNumber_of_drinks() +
                            " Drinks and you ordered " +
                            o.getNumber_of_foods() +
                            " different variations of our food.\n" +
                            maxReservation );
    }
}
