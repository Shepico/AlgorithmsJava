public class Vertex {

    private String label;
    private boolean wasVisited;
    private Vertex prev;

    Vertex (String label) {
        this.label = label;
        wasVisited = false;
        prev = null;
    }

    void setWasVisitet() {
        this.wasVisited = true;
    }

    void resetWasVisited() {
        this.wasVisited = false;
    }

    public String getLabel() {
        return label;
    }

    public boolean isWasVisited() {
        return wasVisited;
    }

    @Override
    public String toString(){
        return this.label;
    }

    void setPrevVertex(Vertex prev){
        this.prev = prev;
    }

    Vertex getPrevVertex(){
        return this.prev;
    }
}
