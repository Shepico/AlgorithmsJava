import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Graph {

    List<Vertex> vertexList;

    Graph() {
        vertexList = new ArrayList<>();
    }

    void addVertex(char label){
        vertexList.add(new Vertex(label));
    }

    void addEdge(int start, int ... end) {
        Vertex v = this.vertexList.get(start);
        v.addEdge(this.getVertex(end));
    }

    Vertex[] getVertex (int ... index){
        Vertex[] vert = new Vertex[index.length];
        for (int i=0; i<index.length; i++){
            vert[i] = this.vertexList.get(index[i]);
        }
        return vert;
    }

    void displayGraph(){
        for (int i=0; i<this.vertexList.size(); i++){
            vertexList.get(i).displayVertex();
        }
    }

}
