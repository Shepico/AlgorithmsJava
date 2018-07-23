package iteratorPackage;

class Unit{
    private String name;
    private String surname;
    private Unit next;
    private Unit prev;

    Unit(String name, String surname, Unit next, Unit prev) {
        this.name = name;
        this.surname = surname;
        this.prev = prev;
        this.next = next;
    }

    String getData(){
        return (this.surname + " " + this.name);
    }

    Unit getNext() {
        return (this.next);
    }

    Unit getPrev() {
        return (this.prev);
    }

    void setLink(Unit next, Unit prev) {
        this.next = next;
        this.prev = prev;
    }

    @Override
    public String toString(){
        return ("UNIT [name-" + this.name
                + ",surname-" + this.surname
                + ",null"
                + ",null]");
    }
}
