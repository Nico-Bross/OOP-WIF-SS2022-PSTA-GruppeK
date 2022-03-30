package TheGoldenBucket;

public class Drink {

   protected String drinkName;  // String name kann nicht benutzt werden, da in der Main Methode sonst nicht erkennt wird ob es Customer Namen oder Drinks handelt.
   protected int drinkPrice;     //deklarartion drinkPrice damit man weiß, dass es beim Preis um Drinks handelt

      public  Drink(String drinkName, int price){
         this.drinkName = drinkName;
         this.drinkPrice = price;



     }


}
