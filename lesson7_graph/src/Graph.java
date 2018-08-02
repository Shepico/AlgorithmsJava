import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Graph {

    List<Vertex> vertexList;
    List<Vertex> adjMat;

    Graph() {
        vertexList = new ArrayList<>();
        adjMat = new LinkedList<>();
    }

    void addVertex(char label){
        vertexList.add(new Vertex(label));
    }

}
