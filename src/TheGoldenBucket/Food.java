package TheGoldenBucket;

public class Food {
    String name;
    float price;

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public Food(){}

    public Food(String name, float price){
        this.name = name;
        this.price = price;
    }

    public void setFood(String name, float price) {
        this.name = name;
        this.price = price;
    }

}