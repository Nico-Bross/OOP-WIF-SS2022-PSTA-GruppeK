package NeedForSpeed;

public abstract class Motor extends Participent {

    private double tank;
    private final double mileage;
    private final double gasPrice;

    public Motor (String name, Handicap handicap, double vmax, double vavg, double acceleration, double operatingCosts, double tank, double mileage, double gasPrice){

        super(name, handicap, vmax, vavg, acceleration, operatingCosts);
        this.tank = tank * handicap.getTankLimitation();
        this.mileage = mileage;
        this.gasPrice = gasPrice;
        this.level = tank * handicap.getTankLimitation();
    }

    public int refuelNumber(double distance) {
        return (int) (level/mileage) + 1;
    }

    public void refuel() {
        this.level = tank;
    }

    public double range() {
        return level/mileage;
    }

    public double coast (double gasPrice){
        this.costs = getDistance() * mileage * gasPrice + distance * operatingCosts;
        return costs;
    }

    public void setHandicap (Handicap handicap) {
        super.setHandicap(handicap);
        this.tank = tank * handicap.getTankLimitation();
        this.level = tank * handicap.getTankLimitation();
    }
}
