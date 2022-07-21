package binarysearchtree;

public class TreeNode <T extends Comparable>{
    private Node root;

    public TreeNode() {
        this.root = null;
    }

    public void add(T obj) {
        if(this.root == null) {
            this.root = new Node(obj);
        }
        else {
            this.root.add(obj);
        }
    }
}
