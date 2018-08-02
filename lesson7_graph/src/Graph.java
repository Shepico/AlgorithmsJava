import java.util.*;
import java.util.LinkedHashSet;

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
        v.addEdge(this.getVertexArray(end));
    }

    Vertex[] getVertexArray (int ... index){
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

    void bypassDeph() {
        Vertex firstVertex = vertexList.get(0); //Взяли первую вершину
        if (firstVertex == null) {
            System.out.println("Граф пустой");
        }else {

            Stack<Vertex> stack = new Stack();
            stack.push(firstVertex);
            firstVertex.changeWasVisited();

        }
    }

    void bypassWidth() {
        Vertex currentV = vertexList.get(0); //Взяли первую вершину
        //LinkedHashSet currentEdge = currentV.getEdge();
        currentV.changeWasVisited();
        currentV.displayVertex();
        Queue<Vertex> queue = new ArrayDeque<>();
        queue.add(currentV);

        while (!queue.isEmpty()) {
            /*System.out.println(((ArrayDeque<Vertex>) queue).getFirst());
            ((ArrayDeque<Vertex>) queue).removeFirst();*/
            currentV = queue.remove();
            Vertex current = null;
          /*  while ((current = getAdjUnvisitedVertex(currentV)) != null) {
                    visit(current, queue);
                }
            }

            resetVertexStates();*/
        }




    }



}
