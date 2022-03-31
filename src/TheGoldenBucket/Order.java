package TheGoldenBucket;

public class Order {
    private Customer c;
    private Reservation r;
    private Drink[] drinks;
    private Food[] foods;
    private int number_of_drinks;
    private int number_of_foods;

    public void setC(Customer c) {
        this.c = c;
    }
    public void setR(TheGoldenBucket.Reservation r) {
        this.r = r;
    }
    public void setDrinks(Drink[] drinks) {
        this.drinks = drinks;
    }
    public void setFoods(Food[] foods) {
        this.foods = foods;
    }
    public void setNumber_of_drinks(int number_of_drinks) {
        this.number_of_drinks = number_of_drinks;
    }
    public void setNumber_of_foods(int number_of_foods) {
        this.number_of_foods = number_of_foods;
    }

    public Customer getC() {
        return c;
    }
    public TheGoldenBucket.Reservation getR() {
        return r;
    }
    public Drink[] getDrinks() {
        return drinks;
    }
    public Food[] getFoods() {
        return foods;
    }
    public int getNumber_of_drinks() {
        return number_of_drinks;
    }
    public int getNumber_of_foods() {
        return number_of_foods;
    }

    public Order(){
        drinks= new Drink[0];
        foods = new Food[0];
        number_of_drinks=0;
        number_of_drinks=0;
    }

    void addDrink(Drink d){
        Utilities.enlargeDrinkArray(drinks);
        drinks[drinks.length]=d;
        number_of_drinks++;
    }

    void addFood(Food f){
        this.foods=Utilities.enlargeFoodArray(foods);
        foods[foods.length-1]=f;
        number_of_foods++;
    }
}
