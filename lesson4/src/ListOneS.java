import java.util.Iterator;

public class ListOneS implements List, Iterable <Integer> {

    ListItem first;

    public ListOneS() {
        first = null;
    }

    @Override
    public void insertFirst(int value) {
        ListItem newItem = new ListItem(value, this.first);
        this.first = newItem;
    }

    @Override
    public int deleteFirst() {
        int deleteItem = this.first.getData();
        this.first = this.first.getNextItem();
        return (deleteItem);
    }

    @Override
    public void display() {
        ListItem link;
        if (!isEmpty()) {
            link = this.first;
            while (link != null) {
                System.out.println(link.getData());
                link = link.getNextItem();
            }
        }else System.out.println("List is empty");
    }

    @Override
    public boolean isEmpty() {
        return this.first == null ? true: false;
    }

    @Override
    public int findValue(int value) {
        ListItem link;
        if (isEmpty()) {
            System.out.println("List is empty");
            return 0;
        }else {
            link = this.first;
            while (link != null) {
                if (link.getData() == value) {
                    return link.getData();
                }
                link = link.getNextItem();
            }
            return 0;
        }
    }

    @Override
    public int deleteValue(int value) {
        // не стал делать через Delete, чтобы не усложнять тот метод
        ListItem link;
        ListItem nextLink;
        ListItem prevLink;
        if (isEmpty()) {
            System.out.println("List is empty");
            return 0;
        }else {
            link = this.first;
            prevLink = link;
            while (link != null) {
                if (link.getData() == value) {
                   if (link == first) {
                       deleteFirst();
                   }else {
                       prevLink.setNextItem(link.getNextItem());
                       return (link.getData());
                   }

                }
                //prevLink = link;
                link = link.getNextItem();
            }
            return 0;
        }
    }

    @Override
    public void insertLast(int value) {
        System.out.println("The method is not implemented");
    }

    @Override
    public int deleteLast() {
        System.out.println("The method is not implemented");
        return 0;
    }

    public ListItem getFirst() {
        return this.first;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new ListIterator(this);
    }
}
