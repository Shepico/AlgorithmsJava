import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class GraphMatrix {

        private final int MAX_VERTS = 12 ;
        private Vertex[] vertexList;
        private int[][] adjMat;
        private int size;


        GraphMatrix() {
            Stack<Integer> stack = new Stack<>();
            vertexList = new Vertex[MAX_VERTS];
            adjMat = new int[MAX_VERTS][MAX_VERTS];
            size = 0;
            for (int i = 0; i < MAX_VERTS; i++) {
                for (int j = 0; j < MAX_VERTS; j++) {
                    adjMat[i][j] = 0;
                }
            }
        }

        void addVertex(char label){
            vertexList[size++] = new Vertex(label);
        }

        void addEdge(int start, int end) {
            adjMat[start][end] = 1;
            adjMat[end][start] = 1;
        }

        void displayVertex(int vertex){
            System.out.println(vertexList[vertex]);
        }

    private int getAdjUnvisitedVertex(int ver) {
            for (int i=0; i<size; i++) {
                if (adjMat[ver][i] == 1 && vertexList[i].getWasVisted() == false) {
                    return i;
                }
            }
            return -1;
    }

    private void resetVertexStates() {
        for (int i = 0; i < vertexList.length; i++) {
            vertexList[i].resetWasVisited();
        }
    }

   /* @Override
    public void display() {
        for (int i = 0; i < vertexList.length; i++) {
            if (vertexList[i] == null) {
                continue;
            }
            String out = vertexList[i].toString();
            for (int j = 0; j < vertexList.length; j++) {
                if (adjMat[i][j] == 1) {
                    out += " -> " + vertexList[j];
                }
            }
            System.out.println(out);
        }
    }*/

    private void visit(Vertex vertex, Queue<Vertex> queue) {
        display(vertex);
        vertex.changeWasVisited();
        queue.add(vertex);
    }

    private Vertex getAdjUnvisitedVertex(Vertex vertex) {
        for (int i = 0; i < vertexList.length; i++) {
            Vertex currentVertex = vertexList[i];
            if (hasEdge(vertex, currentVertex) && !currentVertex.getWasVisted()) {
                return currentVertex;
            }
        }

        return null;
    }

    private boolean hasEdge(String fromLabel, String toLabel) {
        int from = indexOf(fromLabel);
        int to = indexOf(toLabel);
        if (from == -1 || to == -1)
            return false;

        return adjMat[from][to] == 1;
    }

    private boolean hasEdge(Vertex from, Vertex to) {
        return hasEdge(from.getLabel(), to.getLabel());
    }

    public int indexOf(String label) {
        for (int index = 0; index < vertexList.length; index++) {
            if (vertexList[index] == null) {
                continue;
            }
            String vertexLabel = vertexList[index].getLabel();
            if (vertexLabel.equals(label)) {
                return index;
            }
        }
        return -1;
    }

    public void bfs(String startVertexLabel) {
        Vertex vertex = find(startVertexLabel);
        if (vertex == null) {
            return;
        }

        Queue<Vertex> queue = new ArrayDeque();
        visit(vertex, queue);

        while (!queue.isEmpty()) {
            vertex = queue.remove();
            Vertex currentVertex = null;
            while ((currentVertex = getAdjUnvisitedVertex(vertex)) != null) {
                visit(currentVertex, queue);
            }
        }

        resetVertexStates();
    }

    public Vertex find(String label) {
        for (int i = 0; i < vertexList.length; i++) {
            if (vertexList[i] == null) {
                continue;
            }
            String vertexLabel = vertexList[i].getLabel();
            if (vertexLabel.equals(label)) {
                return vertexList[i];
            }
        }
        return null;
    }

    private void display(Vertex vertex) {
        System.out.println(vertex);
    }
}
