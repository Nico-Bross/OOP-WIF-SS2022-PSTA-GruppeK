package TheGoldenBucket;

public class Order {

    private Customer c;
    private Reservation r;
    private Drink[] drinks;
    private Food[] foods;
    private int number_of_drinks;
    private int number_of_foods;

    public Order(Customer c, Reservation r, Drink[] drinks, Food[] foods) {
        this.c = c;
        this.r = r;
        this.drinks = drinks;
        this.foods = foods;
        this.number_of_drinks = 0;
        this.number_of_foods = 0;
    }

    public void addDrink(Drink d) {
        drinks = Utilities.enlargeDrinkArray(drinks);
        drinks[drinks.length-1] = d;
        number_of_drinks++;
    }

    public void addFood(Food f) {
        foods = Utilities.enlargeFoodArray(foods);
        foods[foods.length-1] = f;
        number_of_foods++;
    }

    public int getNumber_of_drinks() {
        return number_of_drinks;
    }

    public int getNumber_of_foods() {
        return number_of_foods;
    }
}
