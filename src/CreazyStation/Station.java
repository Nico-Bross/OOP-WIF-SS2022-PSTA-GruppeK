package CreazyStation;

public class Station {
    private Car storage;
    private Train[] trains;
    private String name;

    public Station(String name){
        this.name = name;
     //   storage = new Car;        //Schmeißt toString fehler
        trains = new Train[1];
    }

    public Station(String name, Train train){
        this.name = name;
    //    storage = new Car;
        trains = new Train[1];
        trains [1] = train;
    }

    public Station(String name, Train[] trains){
        this.name = name;
    //    storage = new Car[1];
        this.trains = trains;
    }

    public void addTrain (Train c) {
        if (trains[0] == null) {
            trains[0] = c;
        } else {
            Train[] newArray = new Train[trains.length + 1];
            for (int i = 0; i < trains.length; i++) {
                newArray[i] = trains[i];
            }
            newArray[trains.length] = c;
            trains = newArray;
        }
    }

    public boolean addCar (Car c){
           Car temp = storage;              //Kopf abspeichern, nicht der er verloren geht
        if (storage == null){
            storage  = c;
            return true;
        } else {
            while (storage.getNextCar() != null){
                storage = storage.getNextCar();
            }
            storage.setNextCar(c);
            storage = temp;
            return true;
        }
    }

    public Car removeCar (){
        Car temp = storage;
        Car car;
        if (storage == null){
            return null;
        }
        while (storage.getNextCar().getNextCar() != null){
            storage = storage.getNextCar();
        }
        car = storage.getNextCar();
        storage.setNextCar(null);
        storage = temp;
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
        storage = null;
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
        Car temp = storage;
        String s;
        s = name + ":\n";
        while (storage != null) {
            s += storage.toString() + "\n";
            storage = storage.getNextCar();
        }
        storage = temp;
        return s;
    }

    public Car getStorage (){return storage; }

    public void setStorage (Car sorted){
        storage = sorted;
    }

    public Train[] getTrains ()  { return trains; }

    public String getName() { return name; }
}
