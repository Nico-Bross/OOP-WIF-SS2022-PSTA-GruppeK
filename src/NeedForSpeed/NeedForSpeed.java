package NeedForSpeed;

public class NeedForSpeed {
    public static void main (String[] args){
        Handicap c = new Handicap(1,1,1,1,0,0);
        Car audi = new Car ("Audi", c, 48,24, 5, 0.2, 50, 10, 2.01);

        Handicap t = new Handicap(1,1,1,10,0,0);
        Truck man = new Truck ("MAN", t, 34,19, 3, 0.4, 150, 26,1.90);

        Handicap m = new Handicap(1,1,1,10,0,0);
        Motorcycle bmw = new Motorcycle ("BMW", m, 50,26, 6, 0.1, 50,  7, 2.30);

        Handicap ca = new Handicap(1,1,1,1,0,0);
        Cavalier werth = new Cavalier ("Isabell Werth", ca, 20,8, 7, 0.008, 100, 100, 25);

        Handicap cy = new Handicap(1,1,1,1,0,0);
        Cyclist lance = new Cyclist ("lance", cy , 17,11, 5, 0.01, 100, 100, 15);

        DragRace r = new DragRace ("DragRace on distance", 20);
        r.addParticipant(audi);
        r.addParticipant(man);
        r.addParticipant(bmw);
        r.addParticipant(werth);
        r.addParticipant(lance);

        r.start();
        System.out.println(r.toString());
        r.reset();

        DragRace r1 = new DragRace ("DragRace on time", 2.5);
        r1.addParticipant(audi);
        r1.addParticipant(man);
        r1.addParticipant(bmw);
        r1.addParticipant(werth);
        r1.addParticipant(lance);

        r1.start();
        System.out.println(r1.toString());
        r1.reset();

        RaceFlyingStart r2 = new RaceFlyingStart ("Race with flying start on distance",  800000);
        r2.addParticipant(audi);
        r2.addParticipant(man);
        r2.addParticipant(bmw);
        r2.addParticipant(werth);
        r2.addParticipant(lance);

        r2.start();
        System.out.println(r2.toString());
        r2.reset();

        RaceFlyingStart r3 = new RaceFlyingStart ("Race with flying start on time", 3600.0);
        r3.addParticipant(audi);
        r3.addParticipant(man);
        r3.addParticipant(bmw);
        r3.addParticipant(werth);
        r3.addParticipant(lance);

        r3.start();
        System.out.println(r3.toString());
        r3.reset();

        NormalRace r4 = new NormalRace ("Normal Race on distance", 800000);
        r4.addParticipant(audi);
        r4.addParticipant(man);
        r4.addParticipant(bmw);
        r4.addParticipant(werth);
        r4.addParticipant(lance);

        r4.start();
        System.out.println(r4.toString());
        r4.reset();

        NormalRace r5 = new NormalRace ("Normal Race on Time", 3600.0);
        r5.addParticipant(audi);
        r5.addParticipant(man);
        r5.addParticipant(bmw);
        r5.addParticipant(werth);
        r5.addParticipant(lance);

        r5.start();
        System.out.println(r5.toString());
        r5.reset();

        Handicap carAndTruck = new Handicap(0.5,1,0.7,1,0,0);
        Handicap cyclistAndCavalier = new Handicap(1,1,1,0.8,36000,0);

        lance.setHandicap(cyclistAndCavalier);
        werth.setHandicap(cyclistAndCavalier);
        audi.setHandicap(carAndTruck);
        man.setHandicap(carAndTruck);

        r4.start();
        System.out.println(r4.toString());
    }
}
