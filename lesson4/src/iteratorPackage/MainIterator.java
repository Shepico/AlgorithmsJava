package iteratorPackage;

public class MainIterator {

    public static void main (String[] args) {
        ListUnit list = new ListUnit();
        IteratorImpl itr = new IteratorImpl(list);

        itr.insertAfter("Василий", "Васильев");
        itr.insertBefore("Петр", "Петров");
        itr.insertAfter("Иван", "Иванов");
        itr.insertBefore("Ольга", "Сидорова");
        itr.insertAfter("Наталья", "Богатова");
        itr.insertBefore("Анна", "Торупова");
        itr.insertAfter("Елена", "Расказова");

        list.display();
        System.out.println("Current unit - " + itr.getCurrent());
        itr.nextLink();
        itr.nextLink();
        itr.nextLink();
        System.out.println("iterator at end - " + itr.atEnd());
        itr.reset(); // сбросили итератор
        System.out.println("Current unit (reset) - " + itr.getCurrent());
        System.out.println("iterator at end - " + itr.atEnd());
        itr.nextLink();
        System.out.println("Delete current - " + itr.deleteCurrent());
        System.out.println("Current unit (nextLink and delete) - " + itr.getCurrent());
        itr.prevLink();
        System.out.println("Current unit (prevLink) - " + itr.getCurrent());
    }
}
