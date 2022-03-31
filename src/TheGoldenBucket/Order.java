package TheGoldenBucket;

public class Order {
    private Customer c;
    private Reservation r;
    private Drink[] drinks;
    private Food[] foods;
    private int number_of_drinks;
    private int number_of_foods;

    public Order(Customer c, Reservation r){
        this.c = c;
        this.r = r;
        drinks= new Drink[0];
        foods = new Food[0];
        number_of_drinks=0;
        number_of_drinks=0;
    }

    void addDrink(Drink d){
        this.drinks = Utilities.enlargeDrinkArray(drinks);
        drinks[drinks.length-1]=d;
        number_of_drinks++;
    }

    void addFood(Food f){
        this.foods=Utilities.enlargeFoodArray(foods);
        foods[foods.length-1]=f;
        number_of_foods++;
    }

    public int getNumber_of_drinks(){
        return number_of_drinks;
    }
    public int getNumber_of_foods(){
        return number_of_foods;
    }
    public Customer getC(){
        return c;
    }
}
