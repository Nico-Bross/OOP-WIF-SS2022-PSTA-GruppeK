package TheGoldenBucket;

public class Utilities {
    static Food enlargeFood(Food head,Food t){
        if (head==null){
            return t;
        }
        else{
        Food it = head;
        while (it.getNextFood() != null){
            it= it.getNextFood();
        }
        it.setNextFood(t);
        return head;
        }
    }

    static Drink enlargeDrink(Drink head, Drink t){
        if (head==null){
            return t;
        }
        else{
            Drink it = head;

        while (it.getNextDrink() != null){
            it= it.getNextDrink();
        }
        it.setNextDrink(t);
        return head;}
    }

    static Order enlargeOrder(Order head, Order o){
        if (head==null){
            return o;
        }
        else{
        Order it = head;
        while (it.getNextOrder() != null){
            it= it.getNextOrder();
        }
        it.setNextOrder(o);
        return head;}
    }
}
