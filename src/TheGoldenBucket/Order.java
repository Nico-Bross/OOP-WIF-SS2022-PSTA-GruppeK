package TheGoldenBucket;

import java.util.Arrays;

public class Order {

    private Drink[] drinks;
    private Food[] foods;
    private int number_of_drinks;
    private int number_of_foods;

    public Order() {
        this.drinks = new Drink[0];
        this.foods = new Food[0];
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

    @Override
    public String toString() {
        return "Drinks:" + Arrays.toString(drinks) + ",\nFoods:" + Arrays.toString(foods);
    }
}
