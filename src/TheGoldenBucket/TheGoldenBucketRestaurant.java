package TheGoldenBucket;

public class TheGoldenBucketRestaurant {
    public static void main(String[] args) {
        Customer max = new Customer("Maxwell Powers");


        Reservation maxReservation = new Reservation(max,"8pm","31.03.2022",
                new Employee("Peter Griffin","Waiter"));


        Employee lois = new Employee("Lois Griffin","Cook");


        // Later that evening Maxwell Powers likes to order some food and drinks
        Order o = new Order();
        o.drinks=new Drink[2];
        o.drinks[0]=new Drink("Coke",395);
        o.drinks[1]=new Drink("Negroni Cocktail",750);


        o.addFood(new Food("Pizza Magherita",1050));
        o.addFood(new Food("Antipasti Selection",970));


        System.out.println( "Dear Guest "+
                            max.getName()+
                            " We thank you so much for yur Business. Tonight you had "+
                            o.drinks.length+
                            " Drinks and you ordered "+
                            o.foods.length+
                            " different variations of our food. ");
    }
}
