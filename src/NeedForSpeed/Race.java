package NeedForSpeed;

import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public abstract class Race {
    private String name;
    protected int distance;
    protected double time;
    protected List<Participent> par;


    public Race (String name, int distance){
        this.name = name;
        this.distance = distance;
        this.time = 0;
        par = new LinkedList<Participent>();
    }

    public Race (String name, double time){
        this.name = name;
        this.distance = 0;
        this.time = time;
        par = new LinkedList<Participent>();
    }

    public String getName() {
        return name;
    }

    public void addParticipant (Participent participant){
        par.add(participant);
    }

    public abstract void start();

    // implement the method placement
    public void placement () {};

    public String toString () {
        StringBuilder s = new StringBuilder();
        String string;
        if (this.distance == 0){
            string = " Race for the time: "+ time + " s\n";
        } else
            string = " Race of the distance: "+ distance + " m\n";

        s.append("Racename: " + name + "\t" + string);
        for (Participent p : par){
            s.append(p.toString());
        }
        return s.toString();
    }

    public void reset (){
        for (Participent p : par) {
            p.reset();
        }
    }
}
