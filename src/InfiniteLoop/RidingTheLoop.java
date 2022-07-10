package InfiniteLoop;

public class RidingTheLoop {
    public static void main(String[] args) {
        Loop l = new Loop();
        l.addData("l");
        l.addData("a");
        l.addData("b");
        l.addData("c");
        l.addData("m");
        l.addData("n");
        l.addData("o");
        l.addData("p");

        System.out.println(l.toString());
    }
}
