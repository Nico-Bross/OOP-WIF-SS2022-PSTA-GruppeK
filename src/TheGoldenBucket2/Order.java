package TheGoldenBucket2;

public class Order {
    int orderId;
    Customer c;
    Reservation r;
    ListGeneric<Drink> drinks;
    ListGeneric<Food> foods;

    public Order(int id){
        orderId = id;
        drinks= new GenericImpl<Drink>();
        foods = new GenericImpl<Food>();
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
