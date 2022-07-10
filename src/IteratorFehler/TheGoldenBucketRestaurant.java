package IteratorFehler;

import java.util.Iterator;

public class TheGoldenBucketRestaurant {
    public static void main(String[] args) {

        Customer max = new Customer("Maxwell Powers");
        Employee peter = new Employee("Peter Griffin","Waiter");
        Reservation maxReservation = new Reservation(max,"8pm", "31.03.2022", peter);
        Employee lois = new Employee("Lois Griffin","Cook");

        // Later that evening Maxwell Powers likes to order some food and drinks
        Order o1 = new Order(1);
        Order o2 = new Order(2);
        Drink coke = new Drink("Coke",395);
        Drink cocktail  = new Drink("Negroni Cocktail",870);
        Food magherita = new Food ("Pizza Magherita", 1050);
        Food antipasti = new Food ("Antipasti Selection", 970);
        Food salami = new Food ("Pizza Salami", 1130);
        o1.addDrink(coke);
        o1.addFood(magherita);
        o2.addDrink(cocktail);
        o2.addFood(antipasti);
        o2.addFood(salami);
        maxReservation.addOrder(o1);
        maxReservation.addOrder(o2);



        System.out.println( "Dear Guest "+
                maxReservation.getCustomer().getName()+
                " We thank you so much for yur Business. Tonight you had "+
                maxReservation.getOrders().size()+
                " Orders, which contain ");
        System.out.println();

        GenericImpl<Order> orderList = maxReservation.getOrders();

        int price = 0;
        int TotalNumberOfFoods = 0;
        int TotalNumberOfDrinks = 0;

        Iterator<Order> iteratorOrder = orderList.iterator();

        while (iteratorOrder.hasNext()){
            TotalNumberOfDrinks += iteratorOrder.next().getDrinkNumber();
            TotalNumberOfFoods += iteratorOrder.next().getFoodNumber();
            System.out.println("OrderId: "+iteratorOrder.next().orderId);
            System.out.println();
            System.out.println("Drinks:");
            Iterator<Drink> iteratorDrink = iteratorOrder.next().drinks.iterator();
            while (iteratorDrink.hasNext()){
                Drink currentDrink = iteratorDrink.next();
                System.out.println("\t"+currentDrink.getName()+"\t\t\t"+currentDrink.getPrice());
                price += currentDrink.getPrice();
            }

            System.out.println("Foods:");
            Iterator<Food> iteratorFood = iteratorOrder.next().foods.iterator();
            while (iteratorFood.hasNext()){
                Food currentFood = iteratorFood.next();
                System.out.println("\t"+currentFood.getName()+"\t\t\t"+currentFood.getPrice());
                price += currentFood.getPrice();
            }
        }

        System.out.println("Total Number of Drinks: "+ TotalNumberOfDrinks);
        System.out.println("Total Number of Foods: "+ TotalNumberOfFoods);
        System.out.println("Total Price: "+ price);
        System.out.println();
        System.out.println("Your waiter was "+maxReservation.getEmployee().getName());
    }
}
