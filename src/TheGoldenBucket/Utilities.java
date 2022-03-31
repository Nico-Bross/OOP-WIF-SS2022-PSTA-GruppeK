package TheGoldenBucket;

public class Utilities {
    static Food[] enlargeFoodArray(Food[] t){
        Food[] returnArray = new Food[t.length+1];
        System.arraycopy(t,0,returnArray,0,t.length);
        return returnArray;
    }

    static Drink[] enlargeDrinkArray(Drink[] t){
        Drink[] returnArray = new Drink[t.length+1];
        System.arraycopy(t,0,returnArray,0,t.length);

        return returnArray;
    }

    static Order[] enlargeOrderArray(Order[] o){
        Order[] returnArray = new Order[o.length+1];
        System.arraycopy(o,0,returnArray,0,o.length);
        return returnArray;
    }
}
