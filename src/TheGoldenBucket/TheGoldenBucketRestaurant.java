package TheGoldenBucket;

import java.util.Scanner;

public class TheGoldenBucketRestaurant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*String OrderNumber = null;
        scan.nextLine(OrderNumber);*/
        Customer max = new Customer();
        max.name="Maxwell Powers";

        Reservation maxReservation = new Reservation();
        maxReservation.c=max;
        maxReservation.date="31.03.2022";
        maxReservation.time="8pm";



        Employee peter = new Employee();
        peter.setEmployee("Peter", "Waiter");

        Employee lois = new Employee();
        lois.setEmployee("Lois", "Cook");


        maxReservation.waiter=peter;

        // Later that evening Maxwell Powers likes to order some food and drinks



        Order o = new Order();
        o.addDrink(new Drink());
        o.addDrink(new Drink());
        o.drinks[0].setDrinks("Coke", 395);
        o.drinks[1].setDrinks("Negroni Cocktail", 0);

        o.addFood(new Food());
        o.addFood(new Food());
        o.foods[0].setFood("Pizza Magherita", 1050);
        o.foods[1].setFood("Antipasti Selection", 970);

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
