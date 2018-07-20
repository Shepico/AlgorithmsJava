package coupString;

public class CharStringStack {
    private char[] strChar;
    private int mark;

    public CharStringStack(String str) {
        strChar = new char[str.length()];
        mark=-1;
        for (int i=0; i<str.length(); i++){
            push(str.charAt(i));
        }

    }

    public void coup (){
        while (mark > -1) {
            System.out.print(pop());
        }
    }

    private void push(char ch) {
        strChar[++mark] = ch;
    }

    private char pop() {
        return strChar[mark--];
    }
}
