package TheGoldenBucket;

public class Food {
    private String name;
    private int price;

    public Food(String n, int p) {
        this.name = n;
        this.price = p;
    }

    public void setName(String name) {
        this.name = name;
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


}
