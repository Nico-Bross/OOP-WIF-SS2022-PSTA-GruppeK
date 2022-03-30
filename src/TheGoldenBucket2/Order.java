package TheGoldenBucket2;

import TheGoldenBucket2.Help.Customer;
import TheGoldenBucket2.Help.Drink;
import TheGoldenBucket2.Help.Food;
import TheGoldenBucket2.Inter.ListDrinks;
import TheGoldenBucket2.Inter.ListFoods;

public class Order {

    private int orderId;
    private Customer c;
    private Reservation r;
    private ListDrinks drinks;
    private ListFoods foods;

    public Order(int id){
        orderId = id;
        drinks = new ListDrinksImpl();
        foods = new ListFoodsImpl();
    }

    public int getFoodNumber (){
        return foods.size();
    }

    public int getDrinkNumber (){
        return drinks.size();
    }

    public int getOrderId() {
        return orderId;
    }

    public ListDrinks getDrinks() {
        return drinks;
    }

    public ListFoods getFoods() {
        return foods;
    }

    public void addFood (Food f){
        foods.add(f);
    }

    public void addDrink (Drink d){
        drinks.add(d);
    }
}
