public class StackImp implements Stack {
    private int sizeStack;
    private int[] dataStack;
    private int top;

    public StackImp(int size) {
        this.sizeStack = size;
        this.dataStack = new int[size];
        this.top = -1;
    }
    public int getSizeStack(){
        return this.sizeStack;
    }


    @Override
    public void push(int value) {
        try {
            this.dataStack[++top] = value;
        }catch(IndexOutOfBoundsException e){
            throw new IllegalArgumentException("Превышен максимальный размер стека " + this.sizeStack, e);
        }
    }

    @Override
    public void pop() {
        if (top > -1) {
            top--;
        }

    }

    @Override
    public int peek() {
        try {
            return this.dataStack[this.top];
        }
        catch (IndexOutOfBoundsException e){
            throw new IllegalArgumentException("Cтек пустой " + this.top, e);
        }
    }

    @Override
    public boolean isEmpty() {
        return this.top == -1;
    }

    @Override
    public boolean isFull() {
        return this.top == this.sizeStack-1;
    }
}
