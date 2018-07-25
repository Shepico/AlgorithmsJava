package backpack;

 class Thing {
    private int cost;
    private int weight;
    private String name;


    Thing(String name, int cost, int weight){
        this.name = name;
        this.cost = cost;
        this.weight = weight;

    }

    @Override
    public String toString() {
        return (this.name + " [" + "Weight=" + this.weight + " Cost=" + this.cost + "]");
    }


}
