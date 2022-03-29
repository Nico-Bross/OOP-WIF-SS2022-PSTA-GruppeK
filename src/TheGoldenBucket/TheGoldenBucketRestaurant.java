package TheGoldenBucket;

public class TheGoldenBucketRestaurant {                    // Google Doc Zusammenfassung : https://docs.google.com/document/d/19vavwyNiWq5Gjsp6yDYno27N8gOGPilP4jhZd0b3CcI/edit
    public static void main(String[] args) {
        Customer max = new Customer("Maxwell Powers");

        Reservation maxReservation = new Reservation(max, "8pm", "31.03.2022");

        Employee peter = new Employee("Peter Griffin", "Waiter");
        Employee lois = new Employee("Lois Griffin", "Cook");

        maxReservation.waiter = peter;

        // Later that evening Maxwell Powers likes to order some food and drinks
        Order o = new Order();
        o.addDrink(new Drink("Coke", 395));
        o.addDrink(new Drink("Negroni Cocktail", 550));


        o.addFood(new Food("Pizza Magherita", 1050));
        o.addFood(new Food("Antipasti Selection", 970));

        System.out.printf("Dear guest %s we thank you so much for your visit. Tonight you " +
                        "had %d drinks %s and you ordered these %d different dishes %s with a total cost of: %.2f € %n ",
                max.getName(), o.number_of_drinks, o.getAllDrinkNames(), o.number_of_foods, o.getAllFoodNames(), o.calulateTotalPrice());

    }
}

/**
 * Mögliche weitere Verbesserungen:*
 * // Google Doc Zusammenfassung : https://docs.google.com/document/d/19vavwyNiWq5Gjsp6yDYno27N8gOGPilP4jhZd0b3CcI/edit
 * - Implementierung des Reservierungsmaximum unter Beachtung unterschiedlicher Tischgrößen
 * - Zuordnung von Bestellungen zu den Reservierungen(Mithilfe von KundenNR)
 * - Auflistung der Preise auf der Rechnung/Beleg
 * - Implementierung einer Speisekarte mit spezifischen Preisen
 */
