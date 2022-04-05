package TheGoldenBucket2;

import TheGoldenBucket2.Help.*;
import TheGoldenBucket2.Inter.*;

public class TheGoldenBucketRestaurant {

    public static void main(String[] args) {

        Customer max = new Customer("Maxwell Powers");
        Employee peter = new Employee("Peter Griffin","Waiter");

        Reservation maxReservation = new Reservation(max,"8pm", "31.03.2022", peter);

        ListDrinks ld = new ListDrinksImpl();
        ListFoods lf = new ListFoodsImpl();

        // Later that evening Maxwell Powers likes to order some food and drinks
        Drink[][] drinks = { new Drink[] { new Drink("Coke            ",395) },
                             new Drink[] { new Drink("Negroni Cocktail",870) } };
        Food[][] foods = { new Food[] { new Food("Pizza Magherita    ", 1050) },
                           new Food[] { new Food("Antipasti Selection", 970),
                                        new Food("Pizza Salami       ", 1130) } };

        // Filling the Drinks/Foods Lists and adding a new Order to the Reservation
        int i = 0;
        while (i < drinks.length) {
            for (Drink d : drinks[i]) {
                ld.add(d);
            }
            for (Food f : foods[i]) {
                lf.add(f);
            }
            i++;
            maxReservation.addOrder(new Order(i, ld, lf));
            ld = new ListDrinksImpl();
            lf = new ListFoodsImpl();
        }



        System.out.println( "Dear Guest "+
                            maxReservation.getCustomer().getName()+
                            ". We thank you so much for your Business.\nTonight you had "+
                            maxReservation.getOrders().size()+
                            " Orders, which contain: " );

        ListOrdersImpl.ListElement currentOrder = maxReservation.getOrders().getFirst();
        int price = 0;
        int TotalNumberOfFoods = 0;
        int TotalNumberOfDrinks = 0;

        while (currentOrder != null) {
            System.out.println();
            System.out.println("OrderId: "+ currentOrder.getO().getOrderId());

            System.out.println("Drinks:");
            ListDrinksImpl.ListElement currentDrink = currentOrder.getO().getDrinks().getFirst();
            while (currentDrink != null) {
                System.out.println("\t"+currentDrink.getD().getName()+"\t\t\t"+currentDrink.getD().getPrice());
                price += currentDrink.getD().getPrice();
                currentDrink = currentDrink.getNext();
            }

            System.out.println("Foods:");
            ListFoodsImpl.ListElement currentFood = currentOrder.getO().getFoods().getFirst();
            while (currentFood != null) {
                System.out.println("\t"+currentFood.getF().getName()+"\t\t\t"+currentFood.getF().getPrice());
                price += currentFood.getF().getPrice();
                currentFood = currentFood.getNext();
            }

            TotalNumberOfFoods += currentOrder.getO().getFoodNumber();
            TotalNumberOfDrinks += currentOrder.getO().getDrinkNumber();
            currentOrder = currentOrder.getNext();
        }

        System.out.println("\nTotal Number of Drinks: "+ TotalNumberOfDrinks);
        System.out.println("Total Number of Foods: "+ TotalNumberOfFoods);
        System.out.println("Total Price: "+ price +"\n");
        System.out.println("Your waiter was "+ maxReservation.getEmployee().getName());
        System.out.println("The Date was "+ maxReservation.getDate()+" at "+maxReservation.getTime());
    }
}
