package TheGoldenBucket;

public class Order {
    Customer c;
    Reservation r;
    Drink[] drinks;
    Food[] foods;
    int number_of_drinks;
    int number_of_foods;

    public Order(){
        drinks= new Drink[0];
        foods = new Food[0];
        number_of_foods=0;
        number_of_drinks=0;
    }

    void addDrink(Drink d){
       this.drinks=Utilities.enlargeDrinkArray(drinks);
        drinks[drinks.length-1]=d;
        number_of_drinks++;
    }

    void addFood(Food f){
        this.foods=Utilities.enlargeFoodArray(foods);
        foods[foods.length-1]=f;
        number_of_foods++;
    }

    String getAllFoodNames(){
        return "";
    }
    String getAllDrinkNames(){
        return "";
    }

    double calulateTotalPrice(){
        int totalPrice = 0;
        for (Drink d : drinks){
            totalPrice += d.getPrice();
        }
        for (Food f : foods){
            totalPrice += f.getPrice();

        }
        return totalPrice/100D;
    }

}
