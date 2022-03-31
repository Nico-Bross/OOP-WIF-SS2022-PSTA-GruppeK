package TheGoldenBucket2;

public class Order {
    private int orderId;
    private Customer c;
    private Reservation r;
    private ListDrinks drinks;
    private ListFoods foods;
    private static int orderCounter = 0;


    public Order(){
        orderCounter++;
        orderId = orderCounter;
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

    public ListFoods getListFoods(){return foods;}

    public ListDrinks getListDrinks(){return drinks;}

    public int getOrderId(){return orderId;};
}
