package CrazyStation2;

import java.util.HashMap;
import java.util.LinkedList;

public class TrainRental {
    String name;

    public TrainRental (String name){
        this.name = name;
    }

    public HashMap<String, Train> lendTrain (int necessaryCap, Station station, CentralStation central){
        HashMap<String, Train> rental = new HashMap<String, Train>();
        int numberTrains = 0;
        if (necessaryCap % 3 != 0){
            numberTrains++;
        }
        numberTrains += (int)(necessaryCap/3);
        while (numberTrains>0){
            rental.put(station.getName(),new SteamLocomotive(station,central));
            numberTrains--;
        }
        return rental;
    }
}
