package coupString;

public class CharString {
    private char[] dataChar;

    public CharString (String str){
        this.dataChar = new char[str.length()];
        for (int i=0; i<str.length(); i++) {
            this.dataChar[i] = str.charAt(i);
        }
    }

    public String coup (){
        String result="";
        for (int i = this.dataChar.length-1; i>=0  ; i--) {
            result = result + this.dataChar[i];
        }

        return result;
    }
}
