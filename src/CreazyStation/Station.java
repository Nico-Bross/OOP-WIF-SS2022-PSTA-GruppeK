package CreazyStation;

public class Station {

    protected Element<Car> storage;
    protected Element<Train> trains;
    protected String name;

    public Station(String name) {
        this.name = name;
        this.storage = null;
        this.trains = null;
    }

    public void addTrain(Train c) {
        if (trains == null) {
            trains = new Element<>(c,null);
        } else {
            trains = new Element<>(c, trains);
        }
    }

    public void loadTrains() {
        Car c = removeCar();
        while (c != null) {
            Element<Train> el = trains;
            while (el != null) {
                while (c != null) {
                    if (el.value.addCar(c)) {
                        c = removeCar();
                    } else {
                        break;
                    }
                }
                el = el.next;
            }
            c = removeCar();
        }
        storage = null;
    }

    public void unloadTrains() {
        Element<Train> el = trains;
        while (el != null) {
            Car c = el.value.removeCar();
            while (c != null) {
                addCar(c);
                c = el.value.removeCar();
            }
            el = el.next;
        }
    }

    public boolean addCar(Car c) {
        if (storage == null) {
            storage = new Element<>(c,null);
        } else {
            Element<Car> el = storage;
            while (el.next != null) {
                el = el.next;
            }
            el.next = new Element<>(c,null);
        }
        return true;
    }

    public Car removeCar() {
        if (storage == null) {
            return null;
        }
        Car c = storage.value;
        storage = storage.next;
        return c;
    }

    public Element<Train> getTrains() {
        return trains;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        String s;
        s = name + ":\n";
        Element<Car> el = storage;
        while (el != null) {
            s += el.value.toString() + "\n";
            el = el.next;
        }
        return s;
    }
}
