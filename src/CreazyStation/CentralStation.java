package CreazyStation;

public class CentralStation{

    private LinkedList storage;
    private Tree trains;
    private String name;

    public CentralStation(String name){
        this.name = name;
        storage = new LinkedList();
        trains = new Tree();
    }

    public CentralStation(String name, Train train){
        this.name = name;
        storage = new LinkedList();
        trains = new Tree();
        trains.insert(train);
    }

    public CentralStation(String name, Tree trains){
        this.name = name;
        storage = new LinkedList();
        this.trains = trains;
    }

    public void addTrain (Train train) {
        trains.insert(train);
    }

    public void addCar (Car c){
        storage.insertLast(c);
    }

    public Car removeCar (){
        return storage.deleteFirst();
    }

    public void loadTrains (){
        Car currentCar = storage.deleteFirst();
        Train tr = trains.root.train;
        while (currentCar != null) {
            String destination = currentCar.getDestination().getName();
            if(tr.getStation().getName().compareTo(destination) != 0){
                getDestinationTrain(trains.root, currentCar);
            } else {
                tr.addCar(currentCar);
            }
            currentCar = storage.deleteFirst();
        }
//        if (storage.head != null){
//            ListElement current = storage.head;
//            while(current != null){
//                Train tr = trains.root.train;
//                String destination = current.car.getDestination().getName();
//                if(tr.getStation().getName().compareTo(destination) != 0){
//                    getDestinationTrain(trains.root, current.car);
//                }else{
//                    tr.addCar(current.car);
//                }
//                current = current.next;
//            }
//        }
    }

    public void getDestinationTrain(Node parent, Car c){
        if(parent.left != null){
            if(parent.left.train.getStation().getName().compareTo(c.getDestination().getName()) != 0){
                getDestinationTrain(parent.left, c);
            }else{
                parent.left.train.addCar(c);
            }
        }
        if(parent.right != null){
            if(parent.right.train.getStation().getName().compareTo(c.getDestination().getName()) != 0){
                getDestinationTrain(parent.right, c);
            }else{
                parent.right.train.addCar(c);
            }
        }
    }

    public void unloadTrains() {
        if (trains.root != null){
            unloadTrain(trains.root.train);
            unloadTrains(trains.root);
        }
    }

    public void unloadTrains(Node parent){
        if(parent.left != null){
            unloadTrain(parent.left.train);
            unloadTrains(parent.left);
        }
        if(parent.right != null){
            unloadTrain(parent.right.train);
            unloadTrains(parent.right);
        }
    }

    public void unloadTrain (Train t) {
        Car c = t.removeCar();
        while (c != null){
            addCar(c);
            c = t.removeCar();
        }
    }

    public String toString () {
        String s;
        s = "Central station =" + name + ":\n" + "Carstorage = " + storage.toString();
        return s;
    }

    public String toStringDetailed () {
        String s;
        s = "Central station =" + name + ":\n";
        s += "car storage ="  + ":\n" + storage.toString();
        s += "trains =" + ":\n" + trains.toString();
        return s;

    }

    public LinkedList getStorage (){return storage; }

    public void setStorage (LinkedList sorted){
        storage = sorted;
    }

    public Tree getTrains ()  { return trains; }

    public String getName() { return name; }

}
