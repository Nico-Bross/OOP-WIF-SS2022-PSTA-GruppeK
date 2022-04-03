package TheGoldenBucket2;

import TheGoldenBucket2.Help.*;
import TheGoldenBucket2.Inter.*;

public class Order {

    private int orderId;
    private ListDrinks drinks;
    private ListFoods foods;

    public Order(int id, ListDrinks ld, ListFoods lf) {
        orderId = id;
        drinks = ld;
        foods = lf;
    }

    public int getFoodNumber() {
        return foods.size();
    }

    public int getDrinkNumber() {
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

    public void addFood(Food f) {
        foods.add(f);
    }

    public void addDrink(Drink d) {
        drinks.add(d);
    }
}
