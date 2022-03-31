package TheGoldenBucket;

public class TheGoldenBucketRestaurant {
    public static void main(String[] args) {
        Customer max = new Customer("Maxwell Powers");

        //Konstruktor einbauen + private setzen und getter/setter Methoden

        Employee peter = new Employee("Peter Griffin", "Waiter");

        Employee lois = new Employee("Lois Griffin", "Cook");

        Reservation maxReservation = new Reservation(max, "8pm", "31.03.2022", peter);


        // Later that evening Maxwell Powers likes to order some food and drinks
        Order o = new Order(max);
        o.addDrink(new Drink("Coke", 395));
        o.addDrink(new Drink ("Negroni Cocktail", 0));

        o.addFood(new Food("Pizza Magerita", 1050));
        o.addFood(new Food("Antipasti Selection", 970));


        System.out.println( "Dear Guest "+
                            max.getName()+
                            " We thank you so much for yur Business. Tonight you had "+
                            o.getNumber_of_drinks()+
                            " Drinks and you ordered "+
                            o.getNumber_of_foods()+
                            " different variations of our food. ");
    }
}
