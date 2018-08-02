public class mainLesson7 {

    public void main (String[] args){
        Vertex g1 = new Vertex('A');
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
        g4.displayVertex();
    }
}
