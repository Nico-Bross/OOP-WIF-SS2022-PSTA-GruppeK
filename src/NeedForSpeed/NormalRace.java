package NeedForSpeed;

import java.util.LinkedList;

public class NormalRace extends Race{

    public NormalRace (String name, int distance){
        super(name, distance);
    }

    public NormalRace (String name, double time){
        super(name, time);
    }

    @Override
    public void start() {
        if (this.distance == 0) {
            for (Participent p : par) {
                p.distance(this.time);
            }
        } else {
            for (Participent p : par) {
                p.time(this.distance);
            }
        }
    }

}
