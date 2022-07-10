package CrazyStation2;

import java.util.HashMap;
import java.util.LinkedList;

public class Station {
    private LinkedList<Car> storage;
    private HashMap<String, Train> trains;
    private String name;
    private HashMap<String, Train> rentals;


    public Station (String name){
        this.name = name;
        storage = new LinkedList<Car>();
        trains = new HashMap<String, Train>();
    }

    public Station (String name, Train train){
        this.name = name;
        storage = new LinkedList<Car>();
        trains = new HashMap<String, Train>();
        trains.put(name,train);
    }

    public Station (String name, HashMap<String, Train> trains){
        this.name = name;
        storage = new LinkedList<Car>();
        this.trains = trains;
    }

    public void addTrain (Train c) {
        trains.put(name,c);
    }

    public boolean addCar (Car c){
        return storage.add(c);
    }

    public Car removeCar (){
        if (storage.size() == 0){
            return null;
        }
        return storage.removeFirst();
    }

    public void loadTrains (){
        for (String i : trains.keySet()){
            while(!trains.get(i).isFull()){
                if (removeCar() != null) {
                    trains.get(i).addCar(removeCar());
                } else {
                    break;
                }
            }
        }
    }

    public void unloadTrains () {
        for (String i : trains.keySet()){
            while(trains.get(i).isEmpty()){
                storage.add(trains.get(i).removeCar());
            }
        }
    }

    public String toString () {
        String s;
        s = name + ":\n";
        if (storage.isEmpty()){
            s += "---";
        } else {
            for (Car c : storage) {
                s += c.toString() + "\n";
            }
        }
        return s;
    }

    public LinkedList<Car> getStorage (){return storage; }

    public void setStorage (LinkedList<Car> sorted){
        storage = sorted;
    }

    public HashMap<String, Train> getTrains ()  { return trains; }

    public String getName() { return name; }

    public void setTrains (HashMap<String, Train> trains) {this.trains = trains;}

    public void setRentals (HashMap<String, Train> rentals) {this.rentals = rentals; }

    public HashMap<String, Train> getRentals () {return rentals;}

    public void unloadRentals () {
        for (String i : rentals.keySet()){
            while(rentals.get(i).isEmpty()){
                storage.add(rentals.get(i).removeCar());
            }
        }
    }
}
