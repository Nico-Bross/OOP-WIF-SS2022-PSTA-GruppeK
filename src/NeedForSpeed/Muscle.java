package NeedForSpeed;

public abstract class Muscle extends Participent{

    private double endurance;
    private final double effort;

    public Muscle (String name, Handicap handicap, double vmax, double vavg, double acceleration, double operatingCosts, double endurance, double level, double effort){
        super(name, handicap, vmax, vavg, acceleration, operatingCosts);
        this.endurance = endurance * handicap.getEndurance();
        this.level = level;
        this.effort = effort/100000;
    }

    public int refuelNumber (double distance) {
        return (int)(level / effort)+1;
    }

    public double range (){
        return level/effort;
    }

    public void rest() {
        this.level = endurance;
    }

    public void reset (){
        super.reset();
        if (handicap.getEndurance() == 0){
            rest();
        } else {
            this.level = endurance * handicap.getEndurance();
        }
    }

    public void setHandicap (Handicap handicap) {
        super.setHandicap(handicap);
        this.endurance = endurance * handicap.getEndurance();
        this.level = endurance * handicap.getEndurance();
    }
}
