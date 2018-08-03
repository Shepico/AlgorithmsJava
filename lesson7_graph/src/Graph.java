import java.util.ArrayDeque;
import java.util.Queue;

public class Graph {
    private final int MAX_VERTS = 10;
    private Vertex[] graph;
    private int[][] adjVer;
    private int size;

    Graph() {
        graph = new Vertex[MAX_VERTS];
        adjVer = new int[MAX_VERTS][MAX_VERTS];
        size = 0;
        for (int i = 0; i < adjVer.length; i++) {
            for (int j = 0; j < adjVer.length; j++) {
                adjVer[i][j] = 0;
            }
        }
    }

    void addVertex(String label) {
        graph[size++] = new Vertex(label);
    }

    void addEdge (int start, int end) {
        adjVer[start][end] = 1;
        adjVer[end][start] = 1;
    }
//////////////////////////////////////////////////////////
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
    }
    public Vertex find(String label) {
        for (int i = 0; i < graph.length; i++) {
            if (graph[i] == null) {
                continue;
            }
            String vertexLabel = graph[i].getLabel();
            if (vertexLabel.equals(label)) {
                return graph[i];
            }
        }
        return null;
    }

    private Vertex getAdjUnvisitedVertex(Vertex vertex) {
        for (int i = 0; i < graph.length; i++) {
            Vertex currentVertex = graph[i];
            if (hasEdge(vertex, currentVertex) && !currentVertex.isWasVisited()) {
                return currentVertex;
            }
        }

        return null;
    }

    private boolean hasEdge(Vertex from, Vertex to) {
        return hasEdge(from.getLabel(), to.getLabel());
    }

    private boolean hasEdge(String fromLabel, String toLabel) {
        int from = indexOf(fromLabel);
        int to = indexOf(toLabel);
        if (from == -1 || to == -1)
            return false;

        return adjVer[from][to] == 1;
    }

    public int indexOf(String label) {
        for (int index = 0; index < graph.length; index++) {
            if (graph[index] == null) {
                continue;
            }
            String vertexLabel = graph[index].getLabel();
            if (vertexLabel.equals(label)) {
                return index;
            }
        }
        return -1;
    }

    private void visit(Vertex vertex, Queue<Vertex> queue) {
        display(vertex);
        vertex.setWasVisitet();
        queue.add(vertex);
    }

    private void display(Vertex vertex) {
        System.out.println(vertex);
    }
}
