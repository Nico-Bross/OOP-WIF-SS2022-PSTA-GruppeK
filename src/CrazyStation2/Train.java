package CrazyStation2;

import java.util.LinkedList;

public abstract class Train {
    private Station station;
    private CentralStation central;
    private int carNumber;
    private LinkedList<Car> cars;

    public Train (){};

    public Train (Station station, CentralStation central, int carNumber){
        this.central = central;
        this.station = station;
        this.carNumber = carNumber;
        this.cars = new LinkedList<Car>();
    }

    public Station getStation (){
        return station;
    }

    public CentralStation getCentral () {
        return central;
    }

    public int getCarNumber () {return carNumber;}

    public boolean addCar (Car c){
        if (cars == null){
            cars = new LinkedList<Car>();
            return cars.add(c);
        } else if (cars.size() < carNumber){
            return cars.add(c);
        } else{
            return false;
        }
    }

    public Car removeCar (){
        if (cars.size() == 0){
            return null;
        }
        return cars.removeLast();
    }

    public boolean maxCarAttached (){
        if (carNumber == cars.size()){
            return true;
        } else
            return false;
    }

    public boolean isFull(){
        if (cars.size() < carNumber){
            return false;
        }
        return true;
    }

    public boolean isEmpty(){
        if (cars.size() != 0){
            return false;
        }
        return true;
    }
}
