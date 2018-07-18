public class Main {
    public static void main (String[] args) {
        //Стек тестовый пример
        int elem;
        Stack st = new StackImp(5);
        System.out.println("is empty - " + st.isEmpty());
        /*elem = st.peek(); //получить значение из пустого стека
        System.out.println(elem);*/
        st.push(2);
        st.push(1);
        st.push(3);
        elem = st.peek();
        System.out.println(elem);
        st.pop();
        st.push(5);
        st.push(7);
        st.push(9);
        elem = st.peek();
        System.out.println(elem);
        System.out.println("is empty - " + st.isEmpty());
        System.out.println("is full - " + st.isFull());
       // st.push(6); //вставка 6 элемента
        //Стек конец

    }
}
