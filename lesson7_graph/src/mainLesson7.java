import Visible.DisplayGraph;

public class mainLesson7 {

    public static void main (String[] args){
        //Строим граф
        Graph graph = new Graph();
        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');
        graph.addVertex('E');
        graph.addVertex('F');
        graph.addVertex('G');
        graph.addVertex('H');
        graph.addVertex('I');
        graph.addVertex('J');
        graph.addVertex('K');
        graph.addVertex('L');

        //Строим ребра
        graph.addEdge(0,1,3,4,5);
        graph.addEdge(1,0,2);
        graph.addEdge(2,1);
        graph.addEdge(3,0,6);
        graph.addEdge(6,3,7);
        graph.addEdge(7,6);
        graph.addEdge(4,0);
        graph.addEdge(5,0,8);
        graph.addEdge(8,5,9,10);
        graph.addEdge(9,8,11);
        graph.addEdge(11,9);
        graph.addEdge(10,8);

        //вывод графа
        //graph.displayGraph();

        graph.bypassWidth();

        /*DisplayGraph w;
        w = new DisplayGraph("Graph");*/



        /*Vertex g1 = new Vertex('A');
        Vertex g2 = new Vertex('B');
        Vertex g3 = new Vertex('C');
        Vertex g4 = new Vertex('D');

        g1.addEdge(g2);
        g2.addEdge(g1,g3);
        g3.addEdge(g2,g4);
        g4.addEdge(g3);

        g1.displayVertex();
        g2.displayVertex();
        g3.displayVertex();
        g4.displayVertex();*/
    }
}
