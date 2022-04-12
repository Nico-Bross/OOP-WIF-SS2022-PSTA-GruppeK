package CreazyStation;

public class CentralStation{

    public CentralStation(String name){
        this.name = name;
    //    storage = new Car[1];
        trains = new Train[1];
    }

    public CentralStation(String name, Train train){
        this.name = name;
      //  storage = new Car[1];
        trains = new Train[1];
        trains [1] = train;
    }

    public CentralStation(String name, Train[] trains){
        this.name = name;
     //   storage = new Car[1];
        this.trains = trains;
    }

    private Car storage;
    private Train[] trains;
    private String name;

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
/*      //Wird später realisiert //LM
    public void distributeCars (){
        Car[] notDistributable = new Car[1];
        while (storage.length != 0){
            Car c = removeCar();
            for (Train t: getTrains()){
                if (t.getStation().getName() == c.getTarget().getName()){
                    if (t.addCar(c)){
                        break;
                    } else {
                        if (c != null){
                            if (notDistributable[0] == null) {
                                notDistributable[0] = c;
                            } else {
                                Car[] newArray = new Car[notDistributable.length + 1];
                                for (int i = 0; i < notDistributable.length; i++) {
                                    newArray[i] = notDistributable[i];
                                }
                                newArray[notDistributable.length] = c;
                                notDistributable = newArray;
                            }
                        }
                    }
                }
            }
        }
        storage = new Car[1];
    }

 */
}
