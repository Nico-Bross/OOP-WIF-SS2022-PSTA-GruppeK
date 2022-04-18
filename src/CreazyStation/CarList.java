package CreazyStation;

public interface CarList {

    Car get(int i); // Gets the car which is in position i in list (list remains the same)
    boolean put(int i, Car car); // overwrites the car in to the element position i in list (list remains same length)

    boolean add(Car car); // Adds the car to the list at the last position (increases list length)
    boolean add(int i, Car car); // inserts  the car to the list at the position i (increases list length)
    Car remove(int i); // Removes the car from the list at the position i (decreases list length)

    Car remove(); //Removes the last car from the list (decreases list length)

}

