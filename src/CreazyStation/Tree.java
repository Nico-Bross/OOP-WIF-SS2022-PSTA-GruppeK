package CreazyStation;

public class Tree {

    public Node root;

    public Tree(){
        root = null;
    }

    public void insert(Train train){
        if (root == null){
            root = new Node(train);
        }
        else{
            insert(root, train);
        }
    }

    public void insert(Node parent, Train train){
        if(parent.train.getStation().getName().compareTo(train.getStation().getName()) != 0){
            if(parent.left == null){
                parent.left = new Node(train);
            }
            else{
                insert(parent.left, train);
            }
        }else{
            if(parent.right == null){
                parent.right = new Node(train);
            }
            else{
                insert(parent.right, train);
            }
        }
    }

    @Override
    public String toString() {
        return "Tree{" +
                "root=" + root +
                '}';
    }
}
