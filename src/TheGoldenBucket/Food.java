package TheGoldenBucket;

public class Food {

    private String name;
    private int price;

    public Food(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " for " + price/100.0 + "€";
    }
}
