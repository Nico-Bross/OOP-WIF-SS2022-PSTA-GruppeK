package CreazyStation;

import java.util.*; //Fragen ob diese Variante effizient ist oder ob man java.util.Arrays hernehmen soll

public class LinkedListTrain implements TrainLinkedList{

    private Station station;
    private CentralStation central;
    private Car[] cars;

    public LinkedListTrain(Station station, CentralStation central){
        this.central = central;
        this.station = station;
        this.cars = new Car[1];
    }

    public CentralStation getCentral () {
        return central;
    }


    public Station getStation (){
        return station;
    }

    private int[] zug;

    public LinkedListTrain(){
        zug = new int[10];
    }

    @Override
    public int get(int i) {

        return zug[i];
    }

    @Override
    public void put(int i, int v) {
        zug[i] = v;
    }

    @Override
    public void add(int v) {
        int[] neuZug = new int [zug.length + 1];
        System.arraycopy(zug,0,neuZug,0,zug.length);
        neuZug[zug.length] = v;
        zug = neuZug;
    }

    @Override
    public int remove(int i) {
        int s = zug[i];
        int[] neuerZug = new int [zug.length - 1];
        for(int j = 0 , k = 0 ; j < zug.length; j++){
            neuerZug[k++] = zug[j];
        }
        zug = neuerZug;
        return s;
    }

    @Override
    public int length() {
        return zug.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(zug);
    }
}
