package CreazyStation;

public class Node {

    public Node left;
    public Node right;
    public Train train;

    public Node(Train train){
        this.train = train;
    }

    @Override
    public String toString() {
        return "Node{" +
                "left=" + left +
                ", right=" + right +
                ", train=" + train +
                '}';
    }
}
