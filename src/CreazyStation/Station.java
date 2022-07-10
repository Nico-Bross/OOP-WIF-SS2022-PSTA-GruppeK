package CreazyStation;

public class Station {
    private LinkedList storage;
    private Train train;
    private String name;

    public Station(String name){
        this.name = name;
        storage = new LinkedList();
    }

    public Station(String name, Train train){
        this.name = name;
        storage = new LinkedList();
        this.train = train;
    }

    public void addTrain (Train train) {
        this.train = train;
    }

    public void addCar (Car c){
        storage.insertLast(c);
    }

    public Car removeCar (){
        return storage.deleteFirst();
    }

    public void loadTrain (){
        Car c = removeCar();
        while (c != null){
            train.addCar(c);
            c = removeCar();
        }
    }

    public void unloadTrain () {
        if (CrazyStation.debugMode) System.out.println("current list length: " + storage.getListLength());
        Car c = train.removeCar();
        while (c != null){
            storage.insertLast(c);
            c = train.removeCar();
        }
        if (CrazyStation.debugMode) System.out.println("after unloadTrain list length: " + storage.getListLength());
    }

    public String toString () {
        String s;
        s = "Station = " + name + ":\n" + "Carstorage = " + storage.toString();
        return s;
    }
    public String toStringDetailed () {
        String s;
        s = "station = " + name + ":\n" ;
        s+= "storage = " + storage.toString()+ " (end of storage)\n";
        s+= "train = " + train.toString();
        return s;
    }

    public LinkedList getStorage (){return storage; }

    public void setStorage (LinkedList sorted){
        storage = sorted;
    }

    public Train getTrains ()  { return train; }

    public String getName() { return name; }
}
