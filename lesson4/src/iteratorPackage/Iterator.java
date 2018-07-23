package iteratorPackage;

public interface Iterator {
    void reset();
    Unit nextLink();
    Unit getCurrent();
    boolean atEnd();
    void insertAfter();
    void inserBefore();
    Unit deleteCurren();
}
