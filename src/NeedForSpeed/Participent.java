package NeedForSpeed;

public abstract class Participent {
    private final String name;
    protected Handicap handicap;
    private double vavg;
    private final double vmax;
    private double acceleration;
    protected final double operatingCosts;
    protected double time;
    protected double distance;
    protected double costs;
    protected double level;

    public Participent (String name, Handicap handicap, double vmax, double vavg, double acceleration, double operatingCosts){
        this.name = name;
        this.handicap = handicap;
        if (vavg > 200){
            this.vavg = 200;
        } else {
            this.vavg = vavg * handicap.getvLimitation();
        }
        this.vmax = vmax;
        if (acceleration > 28){
            this.acceleration = 28;
        } else {
            this.acceleration = acceleration * handicap.getAccelerationLimitation();
        }
        this.operatingCosts = operatingCosts/1000;
        this.level = level;
        this.time = 0;
        this.distance = handicap.getLead();
    }

    public double accelerationDistance (){
        double time = vavg/acceleration;
        return time * time * 0.5 * acceleration;
    }

    public double accelerationTime (){
        return vavg/acceleration;
    }

    public double accelerationVmaxDistance (){
        double time = vmax/acceleration;
        return time * time * 0.5 * acceleration;
    }

    public double accelerationVmaxTime (){
        return vmax/acceleration;
    }

    public double rangeTime (double time){ // Weg der bei voller Fahrt auf die restliche Strecke zustande kommt
        return vavg * time;
    }

    public abstract double range();

    public double driveDistance (double distance){
        double range = range();
        while (distance > 0){
            if (distance > range) {
                this.distance += range;
                this.time += range / vavg;
                distance -= range;
                rest();
                this.time += 3600;
            } else {
                this.distance += distance;
                this.time += distance / vavg;
                break;
            }
            time += accelerationTime();
            distance -= accelerationDistance();
            this.distance += accelerationDistance();
        }
        this.time -= handicap.getStartDelay();
        return time;
    }

    public double driveTime (double time){
        double rangetime = 0;
        double range = 0;
        while (time != 0){
            rangetime = rangeTime(time);
            range = range();
            if (rangetime > range) {
                this.distance += range;
                this.time += range / vavg;
                rest();
                this.time += 3600;
            } else {
                this.time += time;
                this.distance += time * vavg;
                break;
            }
            this.distance += accelerationDistance();
            this.time += accelerationTime();
            time -= accelerationTime();
        }
        this.distance += handicap.getLead();
        return distance;
    }

    public double distance (double time){
        double rangetime = 0;
        double range = 0;
        while (time != 0){
            this.distance += accelerationDistance();
            this.time += accelerationTime();
            time -= accelerationTime();
            rangetime = rangeTime(time);
            range = range();
            if (rangetime > range) {
                this.distance += range;
                this.time += range / vavg;
                rest();
                this.time += 3600;
            } else {
                this.time += time;
                this.distance += time * vavg;
                break;
            }
        }
        this.distance += handicap.getLead();
        return distance;
    }

    public double time (double distance){
        double range = range();
        while (distance > 0){
            time += accelerationTime();
            distance -= accelerationDistance();
            this.distance += accelerationDistance();
            if (distance > range) {
                this.distance += range;
                this.time += range / vavg;
                distance -= range;
                rest();
                this.time += 3600;
            } else {
                this.distance += distance;
                this.time += distance / vavg;
                break;
            }
        }
        this.time -= handicap.getStartDelay();
        return this.time;
    }

    public double dragDistance (double time) { // DragRace time if realisic else 0
        if (accelerationVmaxTime()<time){
            return 0;
        } else {
            this.time = time;
            double distance = 0.5 * acceleration * time * time;
            this.distance += distance;
        }
        return distance;
    }

    public double dragTime (double distance) { // DragRace distance if realisic else 0
        if (accelerationVmaxDistance()<distance){
            return 0;
        } else {
            this.distance = distance;
            this.time = Math.sqrt((2 * distance) / acceleration) - handicap.getStartDelay();
            return time;
        }
    }

    public void rest(){};

    public double costs (){
        this.costs = distance * operatingCosts;
        return costs;
    }

    public void reset (){
        this.time = 0;
        this.distance = 0;
        this.costs = 0;
    };

    public double getTime (){
        return time - handicap.getStartDelay();
    }

    public double getDistance () {return distance;}

    public String getName () { return  name;}

    public String celebration (){return "Yeah I be beat the machines!!!";}

    public String disappointment () {return "It is impossible to compete with machines.";}

    public void setHandicap (Handicap handicap) {
        this.handicap = handicap;
        this.vavg = vavg * handicap.getvLimitation();
        this.acceleration = acceleration * handicap.getAccelerationLimitation();
    }
    public String toString (){
        int hours = 0;
        int minutes = 0;
        double sec = 0;
        String time;
        if (this.time > 3600){
            sec = this.time % 3600;
            hours = (int)(this.time / 3600);
            minutes = (int)(sec / 60);
            sec = sec % 60;
            time = hours + " h " + minutes + " min " + sec + " s ";
        } else {
            minutes = (int)(this.time / 60);
            sec = getTime() % 60;
            time = minutes + " min " + sec + " s ";
        }
        String distance;
        if (this.distance > 1000){
            distance = this.distance/1000 + " km ";
        } else {
            distance = this.distance + " m ";
        }

        return name + "\nTime: "+ time +"\tDistance: "+ distance + "\tCosts: " + costs() + " Euro"+"\n\n";
    }

}
