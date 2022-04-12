package CreazyStation;

import java.util.Objects;

public class CentralStation extends Station {

    public CentralStation(String name) {
        super(name);
    }

    public void distributeCars() {
        Element<Car> notDistributable = null;
        while (storage != null) {
            Car c = removeCar();
            Element<Train> el = getTrains();
            while (el != null) {
                if (Objects.equals(el.value.getStation().getName(), c.getTarget().getName())) {
                    if (el.value.addCar(c)) {
                        break;
                    } else {
                        if (c != null) {
                            if (notDistributable == null) {
                                notDistributable = new Element<>(c,null);
                            } else {
                                notDistributable = new Element<>(c,notDistributable);
                            }
                        }
                    }
                }
                el = el.next;
            }
        }
        storage = null;
    }
}
