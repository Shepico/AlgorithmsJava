public class ListTwoS extends ListOneS {
    private ListItem last;

    public ListTwoS() {
        super();
        this.last = null;
    }

    @Override
    public void insertFirst(int value) {
        ListItem newItem = new ListItem(value, this.first);
        this.first = newItem;
        if (this.last == null) {
            this.last = newItem;
        }
    }

    @Override
    public void insertLast(int value) {
        ListItem newItem = new ListItem (value, null);
        if (this.last == null) {
            this.last = newItem;
            this.first = this.last;
        } else {
            this.last.setNextItem(newItem);
            this.last = newItem;
        }
    }

    @Override
    public int deleteLast() {
        ListItem link;
        if (isEmpty()) {
            System.out.println("List is empty");
            return 0;
        } else {
            if ( this.first == this.last) {
                int data = this.last.getData();
                this.last = null;
                this.first = null;
                return data;
            }else {
                link = this.first;
                while (link.getNextItem() != this.last) {
                    link = link.getNextItem();
                }
                int data = this.last.getData();
                link.setNextItem(null);
                this.last = link;
                return data;
            }
        }
    }
}
