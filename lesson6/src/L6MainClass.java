import java.util.ArrayList;
import java.util.List;

public class L6MainClass {

    public static void main(String[] args) {
        int QUANTITY_TREE = 20;
        List<Three> arrTree = new ArrayList<Three>();
        int balanced=0;
        int nobalanced = 0;


        for (int i = 0; i < QUANTITY_TREE; i++) {
            Three tree = new Three();
            tree.generateTree();
            arrTree.add(tree);
        }

        for (Three tree : arrTree) {
            tree.printTree(tree.getRoot(), 0);
            System.out.println("---------------------");
            if (tree.isBalanced(tree.getRoot())) {
                balanced += 1;
            } else nobalanced += 1;

        }
        System.out.println("Не сбалансированных - "+ (nobalanced / (balanced + nobalanced) * 100)+"%");



        /*Three tree = new Three();
        tree.generateTree();
        tree.printTree(tree.getRoot(),0);
        System.out.println(tree.isBalanced(tree.getRoot()));*/
    }

}


