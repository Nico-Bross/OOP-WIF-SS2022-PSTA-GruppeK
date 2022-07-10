package CrazyStation2;

import java.util.*;

public class CentralStation extends Station {

    public CentralStation (String name){
        super (name);
    }

    public CentralStation (String name, Train train){
        super (name, train);
    }

    public CentralStation (String name, HashMap<String, Train> trains){
        super (name, trains);
    }

    public void sortCars (){
        int counter = 0;
        LinkedList<Car> sortedList = new LinkedList<Car>();
        LinkedList<Car> unsortedList = super.getStorage();
        Iterator<Car> iterator = unsortedList.iterator();
        while (iterator.hasNext()) {
            if(iterator.next().getPriority() == 3){
                counter++;
                sortedList.add(iterator.next());
            } else if (iterator.next().getPriority() == 2){
                sortedList.add(counter, iterator.next());
            } else{
                sortedList.addLast(iterator.next());
            }
            unsortedList.remove();
        }
    }

    public void distributeCars (){
        HashMap<String, Train> currentTrains = super.getTrains();
        LinkedList<Car> currentStorage = super.getStorage();
        Iterator<Car> iterator = currentStorage.iterator();
        while (iterator.hasNext()) {
            currentTrains.get(iterator.next().getTarget().getName()).addCar(iterator.next());
            super.removeCar();
        }
    }

    public boolean checkDistribution (Station station){
        LinkedList<Car> currentStorage = super.getStorage();
        if (!currentStorage.isEmpty()) {
            Iterator<Car> iterator = currentStorage.iterator();
            while (iterator.hasNext()) {
                if (iterator.next().getTarget().getName() == station.getName()) {
                    return false;
                }
            }
        }
        return true;
    }

    public void rentTrains (TrainRental trainRental, Station station) {
        int required = 0;
        LinkedList<Car> cars = super.getStorage();
        if (cars.isEmpty())
            return;
        for (Car c: cars){
            if (c.getTarget() == station) {
                required++;
            }
        }
        HashMap<String, Train> abc = trainRental.lendTrain(required,station,this);
        super.setRentals(abc);
        HashMap<String, Train> trains = super.getTrains();
        super.setTrains(super.getRentals());
        distributeCars();
        station.setRentals(super.getRentals());
        super.setTrains(trains);
    }
}
