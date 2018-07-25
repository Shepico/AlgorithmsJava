package backpack;

class Backpack {
    int capacity;
    Kit kitMax;

    Backpack (int capacity) {
        this.capacity = capacity;
        this.kitMax = new Kit();
    }

    Backpack () {
        this.capacity = 20;
        this.kitMax = new Kit();
    }
}
