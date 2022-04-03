package TheGoldenBucket2;

public class Food {
    private String name;
    private int price;

    public Food (String name, int price){
        this.name = String.format("%-" + 20 + "s", name);   //Fügt dem String Leerzeichen hinzu damit er 20 Stellen lang
        this.price = price;                                 //wird um eine ordentliche Konsolen ausgabe zu bekommen
    }

    public int getPrice (){
        return price;
    }

    public String getName(){
        return name;
    }
}
