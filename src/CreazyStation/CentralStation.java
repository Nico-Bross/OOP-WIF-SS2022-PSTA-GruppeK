package CreazyStation;

import java.util.*;


public class CentralStation{
    private final LinkedList <Car> storage;
    private final LinkedList <Train> trains;
    private final String name;


    public CentralStation(String name){
        this.name = name;
        storage = new LinkedList <Car>();
        trains = new LinkedList <Train>();
    }

    public CentralStation(String name, Train train){
        this.name = name;
        storage = new LinkedList<Car>();
        trains = new LinkedList<Train>();
        trains.set(0, train);
    }

    public CentralStation(String name, LinkedList <Train> trains){
        this.name = name;
        storage = new LinkedList <Car>();
        this.trains = trains;
    }

    /*public void addTrain (Train c) {
        if (trains.get(0) == null) {
            trains.set(0, c);
        } else {
            Train[] newArray = new Train[trains.size() + 1];
            System.arraycopy(trains, 0, newArray, 0, trains.length);
            newArray[trains.length] = c;
            trains = newArray;
        }
    }*/

   /* public boolean addCar (Car c){
        if (storage[0] == null){
            storage [0] = c;
            return true;
        } else {
            Car[] newArray = new Car[storage.length+1];
            System.arraycopy(storage, 0, newArray, 0, storage.length);
            newArray [storage.length] = c;
            storage = newArray;
            return true;
        }
    }*/

   /* public Car removeCar (){
        if (storage.length == 0){
            return null;
        }
        Car car = storage[storage.length-1];
        Car[] newArray = new Car[storage.length-1];
        System.arraycopy(storage, 0, newArray, 0, storage.length - 1);
        storage = newArray;
        return car;
    }*/

    /*public void loadTrains (){
        Car c = storage.pollFirst();
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
        storage = new Car[1];
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

    public Car[] getStorage (){return storage; }

    public void setStorage (Car[] sorted){
        storage = sorted;
    }*/

    public LinkedList<Train> getTrains ()  { return trains; }

    public String getName() { return name; }

   /* public void distributeCars (){
        Car[] notDistributable = new Car[1];
        while (storage.length != 0){
            Car c = removeCar();
            for (Train t: getTrains()){
                if (Objects.equals(t.getStation().getName(), c.getTarget().getName())){
                    if (t.addCar(c)){
                        break;
                    } else {
                        if (notDistributable[0] == null) {
                            notDistributable[0] = c;
                        } else {
                            Car[] newArray = new Car[notDistributable.length + 1];
                            System.arraycopy(notDistributable, 0, newArray, 0, notDistributable.length);
                            newArray[notDistributable.length] = c;
                            notDistributable = newArray;
                        }
                    }
                }
            }
        }
        storage = new LinkedList<Car>();
    }*/
}
