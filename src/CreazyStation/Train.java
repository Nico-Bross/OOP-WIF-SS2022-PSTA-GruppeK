package CreazyStation;

public class Train {
    private Station station;
    private CentralStation central;
    private LinkedList cars;

    public Train(){};

    public Train(Station station, CentralStation central){
        this.central = central;
        this.station = station;
        this.cars = new LinkedList();
    }

    public Station getStation (){
        return station;
    }

    public CentralStation getCentral () {
        return central;
    }

    public void addCar (Car c){
        cars.insertLast(c);
    }

    public Car removeCar (){
        return cars.deleteFirst();
    }

    public LinkedList getCars(){return cars;}

    @Override
    public String toString() {
        return "Train{" +
                "station=" + station.getName() +
                ", central=" + central.getName() +
                ", cars=" + cars.toString() +
                '}';
    }
}
