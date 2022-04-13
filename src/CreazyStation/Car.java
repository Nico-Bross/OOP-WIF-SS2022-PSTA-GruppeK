package CreazyStation;

public class Car implements LinkedListCars{
    private int carID;
    private Station start;
    private Station target;

    public Car(int carID, Station start, Station target){
        this.carID = carID;
        this.start = start;
        this.target = target;

    }
    private int [] zs;

    public Car(){
        zs = new int[]{};
    }

    public String toString (){
        return "CarID: " + carID + "\tStart: " + start.getName() +
                "\tTarget: " + target.getName();
    }

    public int getCarID (){ return carID; }

    public Station getStart () { return start; }

    public Station getTarget () { return target; }

    @Override
    public int get(int i) {
        return zs[i];
    }

    @Override
    public void put(int i, int v) {
        zs[i]=carID;

    }

    @Override
    public boolean addCar(Car c) {
        int[] neu = new int[zs.length+1];
        System.arraycopy(zs,0,neu,0, zs.length);
        neu[zs.length] = carID;
        zs = neu;

    }
}
