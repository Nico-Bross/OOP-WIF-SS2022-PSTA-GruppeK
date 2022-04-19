package CreazyStation;

public class testCarLinkedList {

    public static void main(String[] args) {
        CarLinkedList testList = new CarLinkedList();
        Station hamburg = new Station ("Hamburg");
        Station berlin = new Station ("Berlin");
        Station cologne = new Station ("Cologne");
        Station munich = new Station ("Munich");
        Car testItem;


        Car c1 = new Car(1, hamburg, cologne);
        Car c2 = new Car(2, hamburg, cologne);
        Car c3 = new Car(3, hamburg, munich);
        Car c4 = new Car(4, hamburg, munich);
        Car c5 = new Car(5, munich, cologne);
        Car c6 = new Car(6, berlin, munich);
        Car c7 = new Car(7, berlin, hamburg);
        Car c8 = new Car(8, cologne, munich);
        Car c9 = new Car(9, munich, cologne);
        Car c10 = new Car(10, munich, berlin);
        Car c11 = new Car(11, cologne, berlin);
        Car c12 = new Car(12, berlin, munich);
        Car c13 = new Car(13, berlin, hamburg);
        Car c14 = new Car(14, berlin, munich);

        testList.add(c1);
        testList.add(c2);
        testList.add(c3);
        testList.add(c4);
        testList.add(c5);
        System.out.println(testList.toString());
        System.out.println(testList.get(1).getTarget());
//        testList.remove(0);
//        testItem = testList.remove();
//        if (testItem!= null)  System.out.println(testItem.toString());
//        testItem = testList.remove(3);
//        if (testItem!= null)  System.out.println(testItem.toString());
//        System.out.println(testList.toString());
//        testItem = testList.remove(3);
//        if (testItem!= null)  System.out.println(testItem.toString());
//        System.out.println(testList.toString());
//        testItem = testList.remove();
//        if (testItem!= null)  System.out.println(testItem.toString());
//        testList.add(c6);
//        testList.add(c7);
//        testItem = testList.remove();
//        if (testItem!= null)  System.out.println(testItem.toString());
//        testItem = testList.remove();
//        if (testItem!= null)  System.out.println(testItem.toString());
//        Car myTestCar;
//        myTestCar = testList.get(0);
//        if (myTestCar!= null)  System.out.println(myTestCar.toString());
//        myTestCar = testList.get(1);
//        if (myTestCar!= null)  System.out.println(myTestCar.toString());
//        myTestCar = testList.get(2);
//        if (myTestCar!= null) System.out.println(myTestCar.toString());
//        myTestCar = testList.get(3);
//        if (myTestCar!= null) System.out.println(myTestCar.toString());
//        myTestCar = testList.get(4);
//        if (myTestCar!= null) System.out.println(myTestCar.toString());
//        myTestCar = testList.get(5);
//        if (myTestCar!= null) System.out.println(myTestCar.toString());

//        System.out.println(testList.get(1).getStart());


    }
}
