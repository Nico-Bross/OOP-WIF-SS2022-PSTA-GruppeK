package TheGoldenBucket;

public class TheGoldenBucketRestaurant {
    public static void main(String[] args) {
        Customer max = new Customer();
        max.name="Maxwell Powers";

        Reservation maxReservation = new Reservation(max,"31.03.2022","8pm");

        Employee peter = new Employee();
        peter.setEmployee("Peter", "Waiter");

        Employee lois = new Employee();
        lois.setEmployee("Lois", "Cook");


        maxReservation.waiter=peter;

        // Later that evening Maxwell Powers likes to order some food and drinks



        Order o = new Order();
        o.addDrink(new Drink("Coke", 395));
        o.addDrink(new Drink("Negroni Cocktail", 0));

        o.addFood(new Food("Pizza Magherita", 1050));
        o.addFood(new Food("Antipasti Selection", 970));

        float gesamt = 0;

        for (int i = 0; i<=o.number_of_drinks-1; i++){
            gesamt = gesamt +  o.drinks[i].getPrice();
        }
        for (int j = 0; j<=o.number_of_foods-1; j++){
            gesamt = gesamt + o.foods[j].getPrice();
        }


        System.out.println( "Dear Guest "+
                max.name+
                " we thank you so much for your Business. Tonight you had "+
                o.number_of_drinks+
                " Drinks" + '\n' +o.drinks[0].getName() + ", " +  o.drinks[1].getName() + '\n' + "and you ordered "+
                o.number_of_foods+
                " different variations of our food" + '\n' +o.foods[0].getName() + ", " +  o.foods[1].getName() + '\n' + "Total: " + gesamt + " €");
    }
}
