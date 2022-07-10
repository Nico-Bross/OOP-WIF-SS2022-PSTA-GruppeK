package NeedForSpeed;

public class Car extends Motor {

    public Car (String name, Handicap handicap, double vmax, double vavg, double acceleration, double operatingCosts, double tank, double mileage, double gasPrice) {
        super(name, handicap, vmax, vavg, acceleration, operatingCosts, tank, mileage, gasPrice);
    }

    public String toString (){
        return "Carname: " + super.toString();
    }
}
