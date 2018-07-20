
public class Main {
    public static void main (String[] args) {
        //Стек тестовый пример
        /*int elem;
        Stack st = new StackImp(5);
        System.out.println("is empty - " + st.isEmpty());
        /*elem = st.peek(); //получить значение из пустого стека
        System.out.println(elem);*/
        /*st.push(2);
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
       //Стек конец*/
       //
        //Очередь тестовый пример
        /*Stack que = new QueueImp(5);
        //System.out.println("out - " + que.peek()); // пустая очередь
        System.out.println("is empty - " + que.isEmpty());
        que.push(5);
        que.push(3);
        que.push(7);
        System.out.println("out - " + que.peek());
        que.pop();
        System.out.println("out - " + que.peek());
        que.push(2);
        que.push(4);
        System.out.println("is full - " + que.isFull());
        que.push(6);
        System.out.println("is empty - " + que.isEmpty());
        System.out.println("is full - " + que.isFull());
        //que.push(6); // превышение размера очереди
        //Очередь конец */
        //
        //Очередь приоритет
        Stack que = new QueueImp(5);
        ((QueueImp) que).insertPriority(5);
        ((QueueImp) que).insertPriority(3);
        ((QueueImp) que).insertPriority(7);
        System.out.println("out - " + que.peek());
        que.pop();
        System.out.println("out - " + que.peek());
        ((QueueImp) que).insertPriority(2);
        ((QueueImp) que).insertPriority(4);
        ((QueueImp) que).insertPriority(6);
        System.out.println("out - " + que.peek());
        //Очередь приоритет конец

        /*Deque dq = new Deque(5);
        dq.insertLeftDeq(2);
        dq.insertLeftDeq(1);
        dq.insertLeftDeq(3);
        dq.insertRightDeq(4);
        dq.insertRightDeq(6);
        dq.insertRightDeq(5); // переполнение очереди
        dq.removeLeftDeq();
        dq.removeRightDeq();
        System.out.println(dq.peekLeft());
        System.out.println(dq.peekRight());*/
    }
}
