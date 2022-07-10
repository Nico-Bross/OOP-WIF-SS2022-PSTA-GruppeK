package NeedForSpeed;

public class Cavalier extends Muscle{

    public Cavalier(String name, Handicap handicap, double vmax, double vavg, double acceleration, double operatingCosts, double endurance, double level, double effort){
        super(name, handicap, vmax, vavg, acceleration, operatingCosts, endurance, level, effort);
    }

    public String toString (){
        return "Cavaliername: " + super.toString();
    }
}
