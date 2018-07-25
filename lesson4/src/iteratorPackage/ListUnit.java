package iteratorPackage;

 class ListUnit {
    private Unit firstMark;

    ListUnit() {

        this.firstMark = null;
    }

    /*void insertUnit(String name, String surname){
        if (this.firstMark == null) {
            Unit newUnit = new Unit(name, surname, null, null);
            this.firstMark = newUnit;
        } else {
            Unit prevUnit = firstMark;
            Unit newUnit = new Unit(name, surname, this.firstMark, null);
            prevUnit.setLink(prevUnit.getNext(), newUnit);
            this.firstMark = newUnit;
        }

    }*/

    Unit getFirst(){
        return this.firstMark;
    }

    void setFirst (Unit first) {
        this.firstMark = first;
    }

    IteratorImpl getIterator(ListUnit list) {
        return new IteratorImpl(this);
    }

    boolean isEmpty() {
        return this.firstMark == null;
    }

    void display() {
        Unit current = this.firstMark;
        while (current != null) {
            current.display(current.toString());
            current = current.getNext();
        }
    }


}
