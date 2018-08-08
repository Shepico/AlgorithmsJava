public class Item {
    private String wear;
    private int size;
    //private int key;

    Item (String wear, int size) {
        this.wear = wear;
        this.size = size;
    }

    /*int getKey() {
        return this.key;
    }*/

    int getSize() {
        return this.size;
    }

    String getWear() {
        return this.wear;
    }

    @Override
    public String toString(){
        return ("Wear - " + this.wear + "[size=" + this.size + "]");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        if (this.wear.equals(((Item) obj).getWear()) && this.size == ((Item) obj).getSize()) {
            return true;
        }

        return false;
    }

    @Override
    public int hashCode(){
        int result = 0;
        for (int i=0; i < this.wear.length(); i++) {
            result = result + i;
        }
        result = result + this.size;
        return result % 10;
    }
}
