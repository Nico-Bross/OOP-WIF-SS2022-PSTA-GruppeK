package CreazyStation;

public class Station {

    protected Car[] storage;
    protected Train[] trains;
    protected String name;

    public Station(String name) {
        this.name = name;
        storage = new Car[1];
        trains = new Train[1];
    }

    public void addTrain(Train c) {
        if (trains[0] == null) {
            trains[0] = c;
        } else {
            Train[] newArray = new Train[trains.length+1];
            System.arraycopy(trains, 0, newArray, 0, trains.length);
            newArray[trains.length] = c;
            trains = newArray;
        }
    }

    public void loadTrains() {
        Car c = removeCar();
        while (c != null) {
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

    public void unloadTrains() {
        for (Train t: trains) {
            Car c = t.removeCar();
            while (c != null) {
                addCar(c);
                c = t.removeCar();
            }
        }
    }

    public boolean addCar(Car c) {
        if (storage[0] == null) {
            storage[0] = c;
        } else {
            Car[] newArray = new Car[storage.length+1];
            System.arraycopy(storage, 0, newArray, 0, storage.length);
            newArray[storage.length] = c;
            storage = newArray;
        }
        return true;
    }

    public Car removeCar() {
        if (storage.length == 0) {
            return null;
        }
        Car car = storage[storage.length-1];
        Car[] newArray = new Car[storage.length-1];
        System.arraycopy(storage, 0, newArray, 0, storage.length-1);
        storage = newArray;
        return car;
    }

    public Train[] getTrains() {
        return trains;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        String s;
        s = name + ":\n";
        for (Car c: storage) {
            s += c.toString() + "\n";
        }
        return s;
    }
}
