package TheGoldenBucket;

public class Drink {
    String name;
    float price;

    public Drink(){}

    public Drink(String name, float price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public void setDrinks(String name, float price) {
        this.price = price;
        this.name = name;
    }