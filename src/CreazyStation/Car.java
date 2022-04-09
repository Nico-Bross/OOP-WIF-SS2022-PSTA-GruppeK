package CreazyStation;

public class Car {

    private int carID;
    private Station start;
    private Station target;

    public Car(int carID, Station start, Station target) {
        this.carID = carID;
        this.start = start;
        this.target = target;
    }

    public Car() {}

    public Station getStart() {
        return start;
    }

    public Station getTarget() {
        return target;
    }

    @Override
    public String toString() {
        return "CarID: " + carID + "\tStart: " + start.getName() +
                "\tTarget: " + target.getName();
    }
}
