package CreazyStation;

public interface TrainList {

    Train get(int i); // Gets the train which is in position i in list (list remains the same)
    boolean put(int i, Train train); // overwrites the train in to the element position i in list (list remains same length)

    boolean add(Train train); // Adds the train to the list at the last position (increases list length)
    boolean add(int i, Train train); // inserts  the train to the list at the position i (increases list length)
    Train remove(int i); // Removes the train from the list at the position i (decreases list length)

    Train remove(); //Removes the last train from the list (decreases list length)



}
