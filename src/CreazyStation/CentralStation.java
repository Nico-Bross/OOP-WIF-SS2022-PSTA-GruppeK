package CreazyStation;

public class CentralStation extends Station {

    public CentralStation(String name) {
        super(name);
    }

    public void distributeCars() {
        Car[] notDistributable = new Car[1];
        while (storage.length != 0) {
            Car c = removeCar();
            for (Train t: getTrains()) {
                if (t.getStation().getName() == c.getTarget().getName()) {
                    if (t.addCar(c)) {
                        break;
                    } else {
                        if (c != null) {
                            if (notDistributable[0] == null) {
                                notDistributable[0] = c;
                            } else {
                                Car[] newArray = new Car[notDistributable.length+1];
                                System.arraycopy(notDistributable, 0, newArray, 0, notDistributable.length);
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
}
