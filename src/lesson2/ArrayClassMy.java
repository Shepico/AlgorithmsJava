package lesson2;

public class ArrayClassMy {
    private int[] data;
    private int size;

    public ArrayClassMy (int size) {
        this.size = 0;
        this.data = new int[size];
    }

    public int getSize() {
        return this.size;
    }

    public int getElement(int index) {
        return this.data[index];
    }

    public void addElement (int elem){
        this.data[size] = elem;
        this.size++;
    }

    public void insertElement(int index, int elem) {
        for (int i=this.size; i>index; i--) {
            this.data[i] = this.data[i-1];
        }
        this.data[index] = elem;
        this.size++;
    }

    public void deleteElement(int index) {
        for (int i=index; i<this.size; i++) {
            this.data[i] = this.data[i+1];
        }
        this.size--;
    }

    public boolean linearSearch (int elem) {
        for (int i = 0; i < this.size ; i++) {
            if (this.data[i] == elem) {
                return true;
            }
        }
        return false;
    }

    public boolean binarySearch (int elem) {
        return false;
    }
}
