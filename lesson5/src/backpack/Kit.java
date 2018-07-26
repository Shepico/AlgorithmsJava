package backpack;

import java.util.ArrayList;

 class Kit {
    private ArrayList<Thing> set;

    Kit () {
        this.set = new ArrayList<>();
    }

    Kit getSet(){
        return this;
    }

    void setKit(Thing elem) {
        this.set.add(elem);
    }

    /*Kit selectionThing(Thing t...){

    }*/
}
