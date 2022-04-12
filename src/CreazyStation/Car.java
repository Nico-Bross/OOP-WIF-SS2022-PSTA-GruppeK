package CreazyStation;

public class Car {
    private int carID;
    private Station start;
    private Station target;
    private Car nextCar;

    public Car(int carID, Station start, Station target){
        this.carID = carID;
        this.start = start;
        this.target = target;
    }

  //  public Car(){};

    public String toString (){
        return "CarID: " + carID + "\tStart: " + start.getName() +
                "\tTarget: " + target.getName();
    }

    public int getCarID (){ return carID; }

    public Station getStart () { return start; }

    public Station getTarget () { return target; }

    public Car getNextCar() {
        return nextCar;
    }

    public void setNextCar(Car nextCar) {
        this.nextCar = nextCar;
    }

    public void setCarID(int carID) {
        this.carID = carID;
    }
}
