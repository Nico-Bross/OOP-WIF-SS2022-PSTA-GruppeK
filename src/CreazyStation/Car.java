package CreazyStation;

public class Car {
    private int carID;
    private Station start;
    private Station destination;

    public Car(int carID, Station start, Station destination){
        this.carID = carID;
        this.start = start;
        this.destination = destination;
    }

    public Car(){}
   @Override
    public String toString (){
        return "CarID: " + carID + "\tStart: " + start.getName() +
                "\tTarget: " + destination.getName();
    }

    public int getCarID (){ return carID; }

    public Station getStart () { return start; }

    public Station getDestination () { return destination; }

}
