package TheGoldenBucket;

public class Drink {
    private String name;
    private int price;
    private Drink nextDrink;

    public void setName(String name) {
        this.name = name;
    }
    public void setNextDrink(Drink nextDrink) {
        this.nextDrink = nextDrink;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public Drink getNextDrink() {
        return nextDrink;
    }

    public Drink(String name, int price){
        this.name = name;
        this.price = price;
        this.nextDrink = null;
    }
}
