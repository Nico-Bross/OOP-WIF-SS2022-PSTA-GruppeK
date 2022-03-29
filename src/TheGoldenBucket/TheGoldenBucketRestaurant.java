package TheGoldenBucket;

public class TheGoldenBucketRestaurant {
    public static void main(String[] args) {
        Customer max = new Customer("Maxwell Powers"); //Neuen Customer erstellt und den Namen in den Paramter geschrieben



        Reservation r = new Reservation("max","8pm", "31.03.2022");
        //maxReservation.name =max;         //Reservation Class Customer name
        //maxReservation.date="31.03.2022";
        //maxReservation.time="8pm";

        Employee peter = new Employee("Peter Griffin", "Waiter");
       // peter.employee="Peter Griffin";
       // peter.title="Waiter";

        Employee lois = new Employee("Lois Griffin", "Cook");
        // lois.title="Cook";
       //  lois.employee ="Lois Griffin"; // ohne Parameter wäre lois.name falsch, da nicht erkannt werden kann, auf welchen Namen zugegriffen wird (abänderung in String employee)

        r.waiter=peter;

        // Later that evening Maxwell Powers likes to order some food and drinks
        Order o = new Order();
        //o.drinks=new Drink[2];
        //o.drinks[0]=new Drink("Coke",395);
        //o.drinks[0].drinkName="Coke";      //
        //o.drinks[0].drinkPrice=395;
        //o.drinks[1]=new Drink("Negroni Cocktail", 550 );
        //o.drinks[1].drinkName="Negroni Cocktail";
        //o.drinks[1].drinkPrice=550; // preis hat hier gefehlt !!!!

        o.addFood(new Food("Pizza Margherita",1050));
        o.addFood(new Food("Antipasti Selection",970));
        o.addDrink(new Drink("Coke",395));
        o.addDrink(new Drink("Negroni Cocktail", 550));

        // o.addFood(new Food());
        //o.foods[0].meal="Pizza Margherita";
        //o.foods[1].meal="Antipasti Selection";
        //o.foods[0].mealPrice=1050;
        //o.foods[1].mealPrice=970;

        System.out.println( "Dear Guest "+
                            max.name+                 //protected String name
                            " We thank you so much for yur Business. Tonight you had "+
                            o.number_of_drinks+
                            " Drinks and you ordered "+
                            o.number_of_foods+
                            " different variations of our food. ");
    }
}
