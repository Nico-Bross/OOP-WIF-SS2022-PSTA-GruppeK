package CreazyStation;

import javax.swing.text.Element;
import java.util.*;

public class Train {
    private final Station station;
    private final CentralStation central;
    private LinkedList <Car> cars;

    //public Train(){};

    public Train(Station station, CentralStation central){
        this.central = central;
        this.station = station;
        this.cars = new LinkedList<Car>();
    }
    public Train (Station station, CentralStation central, LinkedList <Car> cars){
        this.central= central;
        this.station= station;
        this.cars = cars;
    }

    public Station getStation (){
        return station;
    }

    public CentralStation getCentral () {
        return central;
    }

    public LinkedList<Car> getCars() {
        return cars;
    }
    public boolean addCar (Car c){
        return cars.add(c);
    }

    public Car removeCar (){
        if(cars.size()<1)
            return null;
        Car tmp = cars.getLast();
        cars.remove(tmp);
        return tmp;
    }
}
