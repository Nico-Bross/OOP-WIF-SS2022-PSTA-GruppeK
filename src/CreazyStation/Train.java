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
    /*public boolean addCar (Car c){
        if (cars == null){
            cars = new Car[1];
            cars [0] = c;
            return true;
        } else if (cars.length == 1 && cars[0] == null){
            cars [0] = c;
            return true;
        } else {
            Car[] newArray = new Car[cars.length+1];
            System.arraycopy(cars, 0, newArray, 0, cars.length);
            newArray [cars.length] = c;
            cars = newArray;
            return true;
        }
    }

    public Car removeCar (){
        if (cars.length == 0){
            return null;
        }
        Car car = cars[cars.length-1];
        Car[] newArray = new Car[cars.length-1];
        System.arraycopy(cars, 0, newArray, 0, cars.length - 1);
        cars = newArray;
        return car;
    }*/
}
