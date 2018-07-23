import java.util.Iterator;


public class ListIterator implements Iterator <Integer> {
    private ListOneS list;
    private boolean firstIterate = true;
    private ListItem current;

    public ListIterator (ListOneS list){
        this.list = list;
       // this.current = list.getFirst();

    }

    @Override
    public void remove() {
        this.list.deleteValue(this.current.getData());
    }

    @Override
    public boolean hasNext() {
        if (this.firstIterate) {
            this.firstIterate = false;
            return this.list.getFirst() != null;
        }else {
            return this.current.getNextItem() != null;
        }
    }

    @Override
    public Integer next() {
        if (this.current == null) {
            this.current = list.getFirst();
        }else {
            this.current = current.getNextItem();
        }

        return this.current.getData();
    }
}
