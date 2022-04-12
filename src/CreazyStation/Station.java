package CreazyStation;

import java.util.LinkedList;

public class Station {
    private LinkedList<Car> storage;
    private LinkedList<Train> trains;
    private final String name;

    public Station(String name) {
        this.name = name;
        storage = new LinkedList<Car>();
        trains = new LinkedList<Train>();
    }

    public Station(String name, Train train) {
        this.name = name;
        storage = new LinkedList<Car>();
        trains = new LinkedList<Train>();
        trains.set(0, train);
    }

    public Station(String name, LinkedList<Train> trains, LinkedList<Car> storage) {
        this.name = name;
        storage = new LinkedList<Car>();
        this.trains = trains;
    }


    public void addTrain (Train c) {
        trains.add(c);
    }

    public boolean addCar (Car c){
        return storage.add(c);
    }

   public Car removeCar (){
        if(storage.size()<1)
            return null;
        Car car = storage.getLast();
        storage.remove(car);
        return car;
    }

  public void loadTrains (){
        Car c = removeCar();
        while (c != null){
            for (Train t: trains) {
                while (c != null) {
                    if (t.addCar(c)) {
                        c = removeCar();
                    } else {
                        break;
                    }
                }
            }
            c = removeCar();
        }
        storage = new LinkedList<Car>();
    }

   public void unloadTrains () {

        for (Train t: trains){
            Car c = t.removeCar();
            while (c!=null){
                addCar(c);
                c = t.removeCar();
            }
        }
    }

    public String toString () {
         StringBuilder s;
         s = new StringBuilder(name + ":\n");
         for (Car c: storage){
             s.append(c.toString()).append("\n");
         }
         return s.toString();
     }
    /*
     public Car[] getStorage (){return storage; }

     public void setStorage (Car[] sorted){
         storage = sorted;
     }*/

    public boolean sortCars() {

        LinkedList<Car> cars = new LinkedList<Car>();

        if (storage.isEmpty()) { return false; }

        for (Car cars1 : storage) {
            if (storage.contains(name)) {
                cars.add(cars1);
            }
        }

        return true;
    }

        public LinkedList<Train> getTrains () { return trains; }

        public String getName () { return name; }

}

