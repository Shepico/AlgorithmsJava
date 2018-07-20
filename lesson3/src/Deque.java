public class Deque {
    private int[] dataDeq;
    private int leftMark;
    private int rightMark;

    public Deque (int size){
        this.dataDeq = new int[size];
        this.leftMark = -1;
        this.rightMark = -1;
    }

    public void insertLeftDeq (int value) {
        if (this.leftMark == -1 || this.rightMark == -1) {
            this.dataDeq[0] = value;
            this.leftMark++;
            this.rightMark++;
        }else {
            if (!isFull()) {
                for (int i = this.rightMark; i>=0; i--) {
                    this.dataDeq[i+1] = this.dataDeq[i];
                }
                this.dataDeq[0] = value;
                this.rightMark++;
            }else System.out.println("Очередь полная");
        }

    }

    public void removeLeftDeq() {
        if (!isEmpty()) {
            for (int i = 0; i < this.rightMark; i++) {
                this.dataDeq[i] = this.dataDeq[i + 1];
            }
            this.rightMark--;
            if (this.rightMark == -1) {
                this.leftMark = -1;
            }
        }else System.out.println("Очередь пустая");
    }

    public void insertRightDeq (int value) {
        if (this.leftMark == -1 || this.rightMark == -1) {
            this.dataDeq[0] = value;
            this.leftMark++;
            this.rightMark++;
        }else {
            if (!isFull()) {
                this.dataDeq[++this.rightMark] = value;
            }else System.out.println("Очередь полная");
        }

    }

    public void removeRightDeq() {
        if (!isEmpty()) {
            this.rightMark--;
        }else System.out.println("Очередь пустая");
    }

    public boolean isEmpty() {
        return leftMark == -1;
    }

    public boolean isFull(){
        return this.rightMark == this.dataDeq.length-1;
    }

    public int peekLeft(){
        return this.dataDeq[this.leftMark];
    }

    public int peekRight(){
        return this.dataDeq[this.rightMark];
    }


}
