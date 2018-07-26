class Stack extends ListOneS {

    public Stack(){
        super();
    }

    public void pop(int value) {
        this.insertFirst(value);
    }

    public int push(){
        return this.deleteFirst();
    }
}
