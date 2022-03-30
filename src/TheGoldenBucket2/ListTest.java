package TheGoldenBucket2;

import TheGoldenBucket2.Help.Drink;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class ListTest {
    @Test
    public void listTestMethod() {
        ListDrinksImpl impl = new ListDrinksImpl();
        Drink a = new Drink ("a", 1);
        Drink b = new Drink ("b", 2);
        Drink c = new Drink ("c", 3);
        Drink d = new Drink ("d", 4);
        Drink e = new Drink ("e", 5);

        impl.add(a);
        impl.add(b);
        impl.add(c);
        impl.add(d);

        System.out.println("Alle Drinks eingefügt also sollte size 4 sein");
        assertEquals(4, impl.size());

        assertTrue(impl.contains(a));
        assertTrue(impl.contains(b));
        assertFalse(impl.contains(e));

        impl.remove(a);
        impl.remove(b);
        assertEquals(2, impl.size());

        assertFalse(impl.contains(a));
        assertFalse(impl.contains(b));
        assertTrue(impl.contains(c));
    }

}
