package TheGoldenBucket2;

public class Drink {
    private String name;
    private int price;

    public Drink (String name, int price){
        this.name = String.format("%-" + 20 + "s", name); //Siehe Comment bei Food "LM
        this.price = price;
    }

    public int getPrice (){
        return price;
    }

    public String getName (){
        return name;
    }
}
