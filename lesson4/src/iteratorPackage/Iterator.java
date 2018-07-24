package iteratorPackage;

public interface Iterator {
    void reset();
    void nextLink();
    void prevLink();
    Unit getCurrent();
    boolean atEnd();
    void insertAfter(String one, String two);
    void insertBefore(String one, String two);
    String deleteCurrent();
}
