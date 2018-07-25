 class ListItem {
    private int data;
    private ListItem next;

    ListItem (int value, ListItem next){
        this.data = value;
        this.next = next;
    }

    int getData () {
        return this.data;
    }

    ListItem getNextItem() {
        return this.next;
    }

    void setNextItem(ListItem link) {
        this.next = link;
    }

 }
