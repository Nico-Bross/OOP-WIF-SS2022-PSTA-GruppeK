package CreazyStation;

public class Car {
    private final int carID;
    private final Station start;
    private final Station target;

    public Car(int carID, Station start, Station target){
        this.carID = carID;
        this.start = start;
        this.target = target;
    }

    //public Car(){};

    public String toString (){
        return "CarID: " + carID + "\tStart: " + start.getName() +
                "\tTarget: " + target.getName();
    }

  public int getCarID (){ return carID; }

    public Station getStart () { return start; }

    public Station getTarget () { return target; }

}
