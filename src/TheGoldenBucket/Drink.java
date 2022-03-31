package TheGoldenBucket;

public class Drink {
    private String name;
    private int price;
    private Drink nextDrink;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }



    public Drink(String name, int price){
        this.name = name;
        this.price = price;
        this.nextDrink = null;
    }
}
