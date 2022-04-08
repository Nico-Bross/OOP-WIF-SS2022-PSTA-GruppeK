package TheGoldenBucket;

public class Order {
    Customer c ;           //Referenzen zu dem Customer - evtl. ne Liste erstellen
    Reservation r;
    Drink[] drinks;         // Drinks Liste erstellen, um Getränke hinzuzufügen oder entfernen
    Food[] foods;

    public int getNumber_of_drinks() {
        return number_of_drinks;
    }

    public void setNumber_of_drinks(int number_of_drinks) {
        this.number_of_drinks = number_of_drinks;
    }

    public int getNumber_of_foods() {
        return number_of_foods;
    }

    public void setNumber_of_foods(int number_of_foods) {
        this.number_of_foods = number_of_foods;
    }

    private int number_of_drinks;
    private int number_of_foods;


    public Order(){
        drinks= new Drink[0];
        foods = new Food[0];
        number_of_drinks=0;
    }

    void addDrink(Drink d){
        Utilities.enlargeDrinkArray(drinks);
        drinks[drinks.length-1]=d;
        number_of_drinks++;
    }

    void addFood(Food f){
        this.foods=Utilities.enlargeFoodArray(foods);
        foods[foods.length-1]=f;
        number_of_foods++;
    }
}
