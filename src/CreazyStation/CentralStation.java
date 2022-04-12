package CreazyStation;

import java.util.*;


public class CentralStation{
    private LinkedList <Car> storage;
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

    public void addTrain (Train c) {
        trains.add(c);
    }

    /** M.Gohn: Implemented addCar **/
    public boolean addCar (Car c){
        return  storage.add(c);
    }

    public Car removeCar (){
        if(storage.size()<1)
            return null;
        Car tmp = storage.removeLast();
        return tmp;
    }

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
    */
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

    public Car[] getStorage (){return (Car[]) storage.toArray(); }

    public void setStorage (Car[] sorted){
        storage = (LinkedList<Car>) Arrays.stream(sorted).toList();
    }

    public LinkedList<Train> getTrains ()  { return trains; }

    public String getName() { return name; }

    public void distributeCars (){
        Car[] notDistributable = new Car[1];
        while (storage.size() != 0){
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
    }
}
