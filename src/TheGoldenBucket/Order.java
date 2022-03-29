package TheGoldenBucket;

public class Order {
   public Customer c;
    public Reservation r;
    public Drink[] drinks;
    public Food[] foods;
    public int number_of_drinks;
    public int number_of_foods;

    public Order(){
        drinks= new Drink[0];
        foods = new Food[0];
        number_of_drinks=0;
        number_of_drinks=0;
    }

    public void addDrink(Drink d){
        Utilities.enlargeDrinkArray(drinks);
        drinks[drinks.length-1]=d;
        number_of_drinks++;
    }

    public void addFood(Food f){
        this.foods=Utilities.enlargeFoodArray(foods);
        foods[foods.length-1]=f;
        number_of_foods++;
    }
}
