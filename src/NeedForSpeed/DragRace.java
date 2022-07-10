package NeedForSpeed;

public class DragRace extends Race {
    public DragRace(String name, int distance) {
        super(name, distance);
    }

    public DragRace(String name, double time) {
        super(name, time);
    }

    @Override
    public void start() {
        if (this.distance == 0) {
            for (Participent p : par) {
                if (p.dragDistance(this.time) == 0) {
                    System.out.println("Time to short for this " + getName());
                }
            }
        }else{
            for (Participent p : par) {
                if (p.dragTime(this.distance) == 0) {
                    System.out.println("Distance to short for this " + getName());
                }
            }

        }
    }
}
