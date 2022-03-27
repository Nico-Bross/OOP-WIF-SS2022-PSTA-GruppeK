package TheGoldenBucket;

public class Order {
    private Customer customer;
    Reservation reservation;
    Drink[] drinks;
    Food[] foods;
    private int number_of_drinks;
    private int number_of_foods;

    public Order(){
        drinks= new Drink[0];
        foods = new Food[0];
        number_of_drinks=0;
        number_of_foods=0;
    }

    void addDrink(Drink d){
        drinks = Utilities.enlargeDrinkArray(drinks);
        drinks[0]=d;
        number_of_drinks++;
    }

    void addFood(Food f){
        this.foods=Utilities.enlargeFoodArray(foods);
        foods[foods.length-1]=f;
        number_of_foods++;
    }

    public int getNumber_of_drinks() {
        return number_of_drinks;
    }

    public int getNumber_of_foods() {
        return number_of_foods;
    }
}
