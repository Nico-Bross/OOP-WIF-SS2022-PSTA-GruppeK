package CreazyStation;


public class Utilities <TypParameter>{
    static TypParameter enlargeFood(TypParameter head, TypParameter t){
        if (head==null){
            return t;
        }
        else{
            TypParameter it = head;
            while (it != null){
                it= it.getNextFood();
            }
            it.setNextFood(t);
            return head;
        }
    }

}
