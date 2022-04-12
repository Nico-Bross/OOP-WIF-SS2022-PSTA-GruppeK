package CreazyStation;


public class Train {
    private Station station;
    private CentralStation central;
    private Car cars;

    public Train(){};

    public Train(Station station, CentralStation central){
        this.central = central;
        this.station = station;
      //  this.cars = new Car[1];
    }

    public Station getStation (){
        return station;
    }

    public CentralStation getCentral () {
        return central;
    }

    public boolean addCar (Car c){
        Car temp = cars;              //Kopf abspeichern, nicht der er verloren geht
        if (cars == null){
            cars  = c;
            return true;
        } else {
            while (cars.getNextCar() != null){
                cars = cars.getNextCar();
            }
            cars.setNextCar(c);
            cars = temp;
            return true;
        }
    }

    public Car removeCar (){
        Car temp = cars;
        Car car;
        if (cars == null){
            return null;
        }
        while (cars.getNextCar() != null){
            cars = cars.getNextCar();
        }
        car = cars.getNextCar();
        car.setNextCar(null);
        cars = temp;
        return car;
    }
}
