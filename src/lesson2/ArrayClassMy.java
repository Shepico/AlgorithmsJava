package lesson2;

import java.util.Arrays;
import java.util.Random;

public class ArrayClassMy {
    private int[] data;
    private int size;

    public ArrayClassMy (int size) {
        this.size = 0;
        this.data = new int[size];
    }

    public ArrayClassMy (int[] arr, int size) {
       //ошибка см. result
        /*this.size=0;
        Arrays.copyOf(arr, arr.length);
        this.data = arr;*/
        //
        this.size=size;
        this.data = Arrays.copyOf(arr, arr.length);

    }

    public int[] getArray() {
        return this.data;
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

    public void fillArray(int size) {
        Random  rand = new Random();
        for (int i=0; i<size; i++) {
            addElement(rand.nextInt(999));
        }
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
        int low=0;
        int high = this.size-1;
        int mid;
        while (low<this.size) {
            mid  = (low+high)/2;
            if (elem == this.data[mid]) {
                return true;
            } else {
                if (elem<this.data[mid]) {
                    high=mid;
                }else low=mid+1;
            }
        }
        return false;
    }

    //Sort
    public void sortBubble() {
        for (int i=this.size-1; i>=1; i--) {
            for (int j=0; j<i; j++) {
                if (this.data[j]>this.data[j+1]){
                    change(j,j+1);
                }
            }
        }
    }

    public void sortSelect(){
        int mark;
        for (int i=0; i < this.size; i++) {
            mark = i;
            for (int j=i+1; j < this.size; j++) {
                if (this.data[j]<this.data[mark]){
                    mark = j;
                }
            }
            change (i, mark);
        }
    }

    public void sortInsert(){
        for (int i=1; i<this.size; i++) {
            int tmp = this.data[i];
            int j=i;
            while (j>0 && this.data[j-1]>=tmp) {
                this.data[j] = this.data[j-1];
                j--;
            }
            this.data[j]=tmp;
        }
    }

    private void change (int idx1, int idx2) {
        int tmp = this.data[idx1];
        this.data[idx1] = this.data[idx2];
        this.data[idx2] = tmp;
    }
}
