package binarysearchtree;

class Node <T extends Comparable> implements Comparable<Node> {
    private T obj;
    private Node leftChild;
    private Node rightChild;

    Node(T obj) {
        this.obj = obj;
        this.leftChild = null;
        this.rightChild = null;
    }

    protected void add(T obj) {
        if(obj.compareTo(this.obj) < 0) {
            if(this.leftChild == null) {
                this.leftChild = new Node(obj);
            }
            else {
                this.leftChild.add(obj);
            }
        }
        else if(obj.compareTo(this.obj) >= 0) {
            if(this.rightChild == null) {
                this.rightChild = new Node(obj);
            }
            else {
                this.rightChild.add(obj);
            }
        }
    }

    private T getObj() {
        return obj;
    }

    @Override
    public int compareTo(Node node) {
        return getObj().compareTo(node);
    }
}
