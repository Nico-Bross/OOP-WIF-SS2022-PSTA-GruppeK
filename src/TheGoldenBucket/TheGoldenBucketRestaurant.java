package TheGoldenBucket;

public class TheGoldenBucketRestaurant {
    public static void main(String[] args) {
        Customer max = new Customer("Maxwell Powers");


        Reservation maxReservation = new Reservation(max,"8pm","31.03.2022",new Employee("Peter Griffin","Waiter"));


        Employee lois = new Employee("Lois Griffen", "Cook");


        // Later that evening Maxwell Powers likes to order some food and drinks
        Order o = new Order(max,maxReservation);
        o.addDrink(new Drink("Coke",395));
        o.addDrink(new Drink("Negroni Cocktail",495));


        o.addFood(new Food("Pizza Magherita",1050));
        o.addFood(new Food("Antipasti Selection",970));

        //TEST TEST TEST
        System.out.println( "Dear Guest "+
                            o.getC().getName()+
                            " We thank you so much for yur Business. Tonight you had "+
                            o.getNumber_of_drinks()+
                            " Drinks and you ordered "+
                            o.getNumber_of_foods()+
                            " different variations of our food. ");
    }
}
