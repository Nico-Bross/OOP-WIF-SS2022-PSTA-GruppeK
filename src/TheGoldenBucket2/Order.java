package TheGoldenBucket2;

import TheGoldenBucket2.Customer;
import TheGoldenBucket2.Drink;

public class Order {
    int orderId;
    Customer c;
    Reservation r;
    ListDrinks drinks;
    ListFoods foods;

    public Order(int id){
        orderId = id;
        drinks= new ListDrinksImpl();
        foods = new ListFoodsImpl();
    }

    public int getFoodNumber (){
        return foods.size();
    }

    public int getDrinkNumber (){
        return drinks.size();
    }

    public void addFood (Food f){
        foods.add(f);
    }

    public void addDrink (Drink d){
        drinks.add(d);
    }
}
