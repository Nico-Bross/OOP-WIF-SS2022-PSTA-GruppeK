package NeedForSpeed;

public class Motorcycle extends Motor {

    public Motorcycle (String name, Handicap handicap, double vmax, double vavg, double acceleration, double operatingCosts, double tank, double mileage, double gasPrice) {
        super(name, handicap, vmax, vavg, acceleration, operatingCosts, tank, mileage, gasPrice);
    }

    public String toString (){
        return "Motorcylename: " + super.toString();
    }
}
