package CrazyStation;

public class CentralStation extends Station {

    public CentralStation (String name){
        super (name);
    }

    public CentralStation (String name, Train train){
        super (name, train);
    }

    public CentralStation (String name, Train [] trains){
        super (name, trains);
    }

    public void sortCars (){
        boolean run = true;
        Car bigger;
        Car smaller;

        Car [] sorted = super.getStorage();
        for (int i = 0; i < sorted.length && run; i++) {
            run = false;

            for (int y = 0; y < sorted.length-1; y++) {
                if(sorted[y].compareTo(sorted[y + 1])==1) {
                    bigger = sorted[y];
                    smaller = sorted[y + 1];
                    sorted[y] = smaller;
                    sorted[y + 1] = bigger;
                    run = true;
                }
            }

        }
        super.setStorage(sorted);
    }

    public void distributeCars (){
        Car [] notDistributable = new Car[1];
        while (super.getStorage().length != 0){
            Car c = super.removeCar();
            for (Train t: super.getTrains()){
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
        Car[] newArray = new Car[notDistributable.length];
        for (int i = 0; i < notDistributable.length; i++) {
            newArray[i] = notDistributable[i];
        }
        super.setStorage(newArray);
    }
}
