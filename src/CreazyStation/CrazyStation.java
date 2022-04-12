package CreazyStation;

public class CrazyStation {

    public static void main(String[] args) {

        // Setup
        Station hamburg = new Station ("Hamburg");
        Station berlin = new Station ("Berlin");
        Station cologne = new Station ("Cologne");
        Station munich = new Station ("Munich");

        CentralStation frankfurt = new CentralStation("Frankfurt");

        Train[] zug =new Train[]{,
        new Train(berlin, frankfurt),
        new Train(hamburg, frankfurt),
        new Train(cologne, frankfurt)};

        hamburg.addTrain(zug[]);
        munich.addTrain(zug[;
        cologne.addTrain(cologne_frankfurt);
        berlin.addTrain(berlin_frankfurt);
        frankfurt.addTrain(hamburg_frankfurt);
        frankfurt.addTrain(munich_frankfurt);
        frankfurt.addTrain(cologne_frankfurt);
        frankfurt.addTrain(berlin_frankfurt);


        Car[] cars =new Car[]{new Car(1, hamburg, cologne),
        new Car(2, hamburg, cologne),
        new Car(3, hamburg, munich),
        new Car(4, hamburg, munich),
        new Car(5, munich, cologne),
        new Car(6, berlin, munich),
        new Car(7, berlin, hamburg),
        new Car(8, cologne, munich),
        new Car(9, munich, cologne),
        new Car(10, munich, berlin),
        new Car(11, cologne, berlin),
        new Car(12, berlin, munich),
        new Car(13, berlin, hamburg),
        new Car(14, berlin, munich)};


       for (Car c:cars)
       {if (c.getStart()==hamburg)
            hamburg.addCar(c);
          else if (c.getStart()==munich)
        munich.addCar(c);
          else if (c.getStart()==berlin)
        berlin.addCar(c);
          else if (c.getStart()==cologne)
        cologne.addCar(c);
       }

        System.out.println("__________________Situation at the beginning of the day__________________");
        System.out.println(hamburg);
        System.out.println(berlin);
        System.out.println(munich);
        System.out.println(cologne);

        // Cars get attached to the available trains on those routes
        hamburg.loadTrains();
        cologne.loadTrains();
        munich.loadTrains();
        berlin.loadTrains();

        // Cars get transported from Stations to CentralStation Frankfurt
        frankfurt.unloadTrains();
        System.out.println("_________________Cars transported to the Central Station_________________");
        System.out.println(frankfurt);
        frankfurt.distributeCars();

        // Trains drive with the new attached cars back to the stations
        hamburg.unloadTrains();
        berlin.unloadTrains();
        munich.unloadTrains();
        cologne.unloadTrains();

        // Let's check if all possible cars are at the right station
        System.out.println("____________________________Transported Cars____________________________");
        System.out.println(hamburg);
        System.out.println(berlin);
        System.out.println(munich);
        System.out.println(cologne);
    }
}
