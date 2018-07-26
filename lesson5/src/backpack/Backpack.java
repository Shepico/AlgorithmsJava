package backpack;

import java.util.ArrayList;

class Backpack {
    private int capacity;
    ArrayList<Thing> set;

    Backpack (int capacity) {
        this.capacity = capacity;
        set = new ArrayList();
    }

    Backpack () {
        this.capacity = 20;
    }

    int getCapacity() {
        return this.capacity;
    }

    void addThing(Thing current){
        set.add(current);
    }

    void removeThing(Thing current) {
        set.remove(current);
    }

    @Override
    public String toString() {
        String str = "Backpack [";
        for (int i = 0; i<set.size(); i++){
            str = str + set.get(i) + ",";
        }
        str = str + "]";
        return (str);
    }
}
