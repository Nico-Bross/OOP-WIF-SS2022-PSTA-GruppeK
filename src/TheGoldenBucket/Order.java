package TheGoldenBucket;

import javax.swing.event.MouseInputListener;

public class Order {
    private Customer c;
    private Reservation r;
    private Drink headDrink;
    private Food headFood;
    private int number_of_drinks;
    private int number_of_foods;
    private Order nextOrder;

    public void setC(Customer c) {
        this.c = c;
    }
    public void setR(TheGoldenBucket.Reservation r) {
        this.r = r;
    }
    public void setDrinks(Drink drinks) {
        this.headDrink = drinks;
    }
    public void setFoods(Food foods) {
        this.headFood = foods;
    }
    public void setNumber_of_drinks(int number_of_drinks) {
        this.number_of_drinks = number_of_drinks;
    }
    public void setNumber_of_foods(int number_of_foods) {
        this.number_of_foods = number_of_foods;
    }
    public void setNextOrder(Order nextOrder) {this.nextOrder = nextOrder;}

    public Customer getC() {
        return c;
    }
    public TheGoldenBucket.Reservation getR() {
        return r;
    }
    public Drink getDrinks() {
        return headDrink;
    }
    public Food getFoods() {
        return headFood;
    }
    public int getNumber_of_drinks() {
        return number_of_drinks;
    }
    public int getNumber_of_foods() {
        return number_of_foods;
    }

    public Order getNextOrder() {
        return nextOrder;
    }

    public Order(Customer customer){

        headDrink = null ;
        headFood = null;
        number_of_drinks=0;
        number_of_drinks=0;
        this.c = customer;
    }

    void addDrink(Drink d){
        headDrink = Utilities.enlargeDrink(this.headDrink, d);
        number_of_drinks++;
    }

    void addFood(Food f){
        headFood = Utilities.enlargeFood(this.headFood, f);
        number_of_foods++;
    }
}
