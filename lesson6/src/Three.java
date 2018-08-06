import java.util.Random;

class Three {
    private Node root;
    private Random rand = new Random();
    private boolean isFullTree = false;

    void insert (int data) {
        Node node = new Node(data);

        if (isEmpty()) {
            this.root = node; //если новое дерево
        }else {
            Node current = root;
            Node parent = null;
            int levelIns = 0;
            while (true) {
                parent = current;
                /*levelIns++;
                if (levelIns == 4) {
                    isFullTree = true;
                }*/
                if (node.getData() < current.getData()){
                    current = current.getChildLeft();

                    if (current == null) {
                        parent.setChildLeft(node);
                        node.setLevel(parent.getLevel()+1);
                        if ((parent.getLevel()+1) == 4) {
                            isFullTree = true;
                        }
                        return;
                    }
                }else if (node.getData() > current.getData()) {
                    current = current.getChildRight();

                    if (current == null) {
                        parent.setChildRight(node);
                        node.setLevel(parent.getLevel() + 1);
                        if ((parent.getLevel() + 1) == 4) {
                            isFullTree = true;
                        }
                        return;
                    }
                }else return;
            }
        }
    }

    boolean isEmpty() {
        return this.root == null;
    }


    void printTree (Node node, int indent) {
        if (node != null) {
            node.display();
            printTree(node.getChildLeft(), indent +2);
            printTree(node.getChildRight(), indent +2);
        }
    }

    Node getRoot(){
        return this.root;
    }

    void generateTree(){
        while (!isFullTree) {
            this.insert(rand.nextInt(41)-20);
        }
    }

    boolean isBalanced(Node node) {
        return (node == null) ||
                isBalanced(node.getChildLeft()) &&
                        isBalanced(node.getChildRight()) &&
                        Math.abs(height(node.getChildLeft()) - height(node.getChildRight())) <= 1;
    }

    private static int height(Node node) {
        return node == null ? 0 : 1 + Math.max(height(node.getChildLeft()), height(node.getChildRight()));
    }
}
