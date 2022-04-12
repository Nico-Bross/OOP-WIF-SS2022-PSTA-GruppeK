package CreazyStation;


public class Train {
    private Station station;
    private CentralStation central;
    private Car[] cars;
    private Car nextCar;

    public Train(){};

    public Train(Station station, CentralStation central){
        this.central = central;
        this.station = station;
        this.cars = new Car[1];
        this.nextCar = null;    }

    public Station getStation (){
        return station;
    }

    public void setNextCar(Car nextCar) {
        this.nextCar = nextCar;
    }

    public CentralStation getCentral () {
        return central;
    }

    public boolean addCar (Car c){
        if (nextCar == null){
            nextCar = c;
            return true;
        }
        Car it = nextCar;
        while (it != null){
            if (it.getNextCar() == null){
                it.setNextCar(c);
                return true;
            }
            else{
                it = it.getNextCar();
            }
        }
        return false;
    }

    public Car removeCar (){
        if (nextCar == null){
            return null;
        }
        if (nextCar != null){
            Car it = nextCar;
            Car perviousCar = null;
            while(it != null){
                if (it.getNextCar() != null){
                    perviousCar = it;
                    it.setNextCar(it.getNextCar());
                }
                else {
                    perviousCar.setNextCar(null);
                    return it;
                }

            }
        }
        return null;
    }
        /*if (cars.length == 0){
            return null;
        }
        Car car = cars[cars.length-1];
        Car[] newArray = new Car[cars.length-1];
        for (int i = 0; i < cars.length-1; i++ ){
            newArray[i] = cars[i];
        }
        cars = newArray;
        return car;
    }*/
}
