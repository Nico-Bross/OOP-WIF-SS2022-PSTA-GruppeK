package NeedForSpeed;

public class RaceFlyingStart extends Race{
    public RaceFlyingStart (String name, int distance){
        super(name, distance);
    }

    public RaceFlyingStart (String name, double time){
        super(name, time);
    }

    @Override
    public void start() {
        if (this.distance == 0) {
            for (Participent p : par) {
                p.driveTime(this.time);
            }
        } else {
            for (Participent p : par) {
                p.driveDistance(this.distance);
            }
        }
    }
}
