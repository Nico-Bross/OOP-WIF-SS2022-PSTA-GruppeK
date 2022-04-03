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
        ListOrders lo = new ListOrdersImpl();

        // Later that evening Maxwell Powers likes to order some food and drinks
        Drink[] drinks = { new Drink ("Coke            ",395),
                           new Drink ("Negroni Cocktail",870) };
        Food[] foods = { new Food ("Pizza Magherita    ", 1050),
                         new Food ("Antipasti Selection", 970),
                         new Food ("Pizza Salami       ", 1130) };
        for (Drink d: drinks) {
            ld.add(d);
        }
        for (Food f: foods) {
            lf.add(f);
        }

        Order[] orders = { new Order (1, ld, lf),
                           new Order (2, ld, lf) };
        for (Order o: orders) {
            lo.add(o);
        }
        for (Order o: orders) {
            maxReservation.addOrder(o);
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
            TotalNumberOfDrinks += currentOrder.o.getDrinkNumber();
            TotalNumberOfFoods += currentOrder.o.getFoodNumber();
            System.out.println();
            System.out.println("OrderId: "+ currentOrder.o.getOrderId());

            System.out.println("Drinks:");
            ListDrinksImpl.ListElement currentDrink = currentOrder.o.getDrinks().getFirst();
            while (currentDrink != null) {
                System.out.println("\t"+currentDrink.d.getName()+"\t\t\t"+currentDrink.d.getPrice());
                price += currentDrink.d.getPrice();
                currentDrink = currentDrink.next;
            }

            System.out.println("Foods:");
            ListFoodsImpl.ListElement currentFood = currentOrder.o.getFoods().getFirst();
            while (currentFood != null) {
                System.out.println("\t"+currentFood.f.getName()+"\t\t\t"+currentFood.f.getPrice());
                price += currentFood.f.getPrice();
                currentFood = currentFood.next;
            }

            currentOrder = currentOrder.next;
        }

        System.out.println("\nTotal Number of Drinks: "+ TotalNumberOfDrinks);
        System.out.println("Total Number of Foods: "+ TotalNumberOfFoods);
        System.out.println("Total Price: "+ price +"\n");
        System.out.println("Your waiter was "+ maxReservation.getEmployee().getName());
        System.out.println("The Date was "+ maxReservation.getDate()+" at "+maxReservation.getTime());
    }
}
