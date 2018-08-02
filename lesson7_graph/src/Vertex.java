import java.util.LinkedHashSet;

import java.util.Set;
class Vertex {

    private char label;
    private LinkedHashSet<Vertex> edge; //не будет дубликатов
    private boolean wasVisited;

    Vertex(char label){
        this.label = label;
        this.wasVisited = false;
        this.edge = new LinkedHashSet<>();
    }

    void changeWasVisited(){
        this.wasVisited = !this.wasVisited;
    }

    void resetWasVisited() {
        this.wasVisited = false;
    }

    void addEdge(Vertex ... vertex) {  //т.к. не понятно со сколькими вершинами есть связь
        for (int i=0; i<vertex.length; i++){
            this.edge.add(vertex[i]);
        }
    }

    void removeEdge(Vertex vertex) {
        this.edge.remove(vertex);
    }

    void displayVertex(){
        System.out.println(this.label);
        System.out.println(this.edge);
        /*for (int i=0; i<this.edge.size(); i++){
            System.out.print(this.edge);
        }*/
    }

    LinkedHashSet getEdge() {
        return(this.edge);
    }

    @Override
    public String toString(){
        return ("" +this.label);
    }



}
