class Node {
    private int data;
    private Node leftChild;
    private Node rightChild;
    private int levelNode;

    Node(int data) {
        this.data = data;
        this.leftChild = null;
        this.rightChild = null;
        this.levelNode = 0;
    }

    void setData (int data){
        this.data = data;
    }

    void setLevel(int level) {
        this.levelNode = level;
    }

    int getLevel(){
        return this.levelNode;
    }

    int getData(){
       return this.data;
    }

    Node getChildLeft() {
        return this.leftChild;
    }


    Node getChildRight () {
        return this.rightChild;
    }

    void setChildLeft (Node node) {
        this.leftChild = node;
    }

    void setChildRight (Node node) {
        this.rightChild = node;
    }

    void display() {
        System.out.println("Node [data = "+ this.data + "/level=" +this.levelNode+"]");
    }

}


