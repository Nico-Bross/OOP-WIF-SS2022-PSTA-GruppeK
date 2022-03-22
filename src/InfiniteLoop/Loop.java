package InfiniteLoop;

public class Loop {
    private class LoopElement {
        private String s;
        private LoopElement left;
        private LoopElement right;

        public LoopElement(String s, LoopElement left, LoopElement right){
            this.s = s;
            this.left=left;
            this.right=right;
        }
    }

    private LoopElement cross;

    public void addData(String data){
        if(cross==null){
            cross = new LoopElement(data, null, null);
            cross.left=cross;
            cross.right=cross;
            return;
        }
        if(data.compareTo(cross.s)<0){
            LoopElement tmp = cross.left;
            cross.left=new LoopElement(data,tmp,cross);
            return;
        }
        if(data.compareTo(cross.s)>=0){
            LoopElement tmp = cross.right;
            cross.right=new LoopElement(data,cross,tmp);
            return;
        }
    }
    public String toString(){
        return leftToString(cross.left)+cross.s+rightToString(cross.right);
    }
    private String leftToString(LoopElement e){
        if(e==cross){
            return "";
        }
        return e.s+leftToString(e.left);
    }
    private String rightToString(LoopElement e){
        if(e==cross){
            return "";
        }
        return e.s+rightToString(e.right);
    }
}
