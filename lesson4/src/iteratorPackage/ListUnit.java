package iteratorPackage;

 class ListUnit {
    Unit firstMark;

    ListUnit() {
        this.firstMark = null;
    }

    void insertUnit(String name, String surname){
        if (this.firstMark == null) {
            Unit newUnit = new Unit(name, surname, null, null);
            this.firstMark = newUnit;
        } else {
            Unit prevUnit = firstMark;
            Unit newUnit = new Unit(name, surname, this.firstMark, null);
            prevUnit.setLink(prevUnit.getNext(), newUnit);
            this.firstMark = newUnit;
        }

    }

}
