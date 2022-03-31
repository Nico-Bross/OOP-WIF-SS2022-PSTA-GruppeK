package TheGoldenBucket;

public class Food {
    private String name;
    private int price;
    private Food nextFood;

    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setNextFood(Food nextFood) {
        this.nextFood = nextFood;
    }

    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public Food getNextFood() {
        return nextFood;
    }

    public Food(String name, int price){
        this.name = name;
        this.price = price;
        this.nextFood = null;
    }
}
