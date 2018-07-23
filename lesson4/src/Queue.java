public class Queue extends ListTwoS{

    public Queue () {
        super();
    }

    public void pop (int value) {
        this.insertFirst(value);
    }

    public int push(){
        return this.deleteLast();
    }

}
