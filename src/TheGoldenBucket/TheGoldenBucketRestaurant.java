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
        order1.drinks=new Drink[2];
        order1.drinks[0]=new Drink("Coke",395);
        order1.drinks[1]=new Drink("Negroni Cocktail",500);


        o.addFood(new Food());
        o.addFood(new Food());
        o.addFood(new Food());//foods[2] fehlt
        o.foods[0].name="Pizza Magherita";
        o.foods[1].name="Antipasti Selection";
        o.foods[0].price=1050;
        o.foods[1].price=970;

        System.out.println( "Dear Guest "+
                            max.name+
                            " We thank you so much for yur Business. Tonight you had "+
                            o.number_of_drinks+
                            " Drinks and you ordered "+
                            o.number_of_foods+
                            " different variations of our food. ");
    }
}
