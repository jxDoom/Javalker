import java.util.*;

public class Main {
    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static void main(String[] args) {
//LinkedList
//        LinkedList<Integer> ll = new LinkedList<Integer>();
//
//        ll.add(1);
//        ll.add(2);
//        ll.add(3);

//Queue
//        Queue<Integer> queue = new LinkedList<Integer>();
//        queue.add(1);
//        queue.add(2);
//        queue.add(3);
//        queue.add(15);
//        queue.add(144);
//        int item = queue.remove();  //[2, 3, 15, 144]
//        item = queue.remove();  //[3, 15, 144]
//        queue.add(4);   //[3, 15, 144, 4]
//        System.out.println(queue);

//        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
//        pq.add(123);
//        pq.add(444);
//        pq.add(12);
//        pq.add(23);
//        System.out.println(pq);
//        System.out.println(pq.poll());
//        System.out.println(pq.poll());
//        System.out.println(pq);

//        Deque<Integer> deque = new ArrayDeque<>();
//        Deque<Integer> deque = new ArrayDeque<>();
//        deque.addFirst(1);
//        deque.addLast(2);
//        deque.removeLast();
//        deque.removeLast();
//        deque.offerFirst(1);
//        deque.offerLast(2);
//        deque.pollFirst();
//        deque.pollLast();
//        deque.getFirst();
//        deque.getLast();
//        deque.peekFirst();
//        deque.peekLast();

//Вычислить значение выражения в постфиксной форме записи
        // (1+2*3*4)*(10/5) - 20
        // 1 2 3 * 4 * + 10 5 / * 20 -

        //var exp = "20 30 - 10 *".split(" "); // (20-30)*10
        //var exp = "1 2 + 3 *".split(" "); // (1 + 2) * 3

        var exp = "1 2 3 * +".split(" "); // 1 + 2 * 3
        int res = 0;
        System.out.println(Arrays.toString(exp));

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < exp.length; i++) {

            if (isDigit(exp[i])) {
                st.push(Integer.parseInt(exp[i]));
            } else {
                switch (exp[i]) {
                    case "+" -> {
                        res = st.pop() + st.pop();
                        st.push(res);
                        break;}
                    case "-" -> {
                        res = -st.pop() + st.pop();
                        st.push(res);
                        break;}
                    case "*" -> {
                        res = st.pop() * st.pop();
                        st.push(res);
                        break;}
                    case "/" -> {
                        res =  st.pop()/ st.pop();
                        st.push(res);
                        break;}
                    default -> {break;}
                }
            }
        }
        System.out.printf("%d\n", st.pop());
    }
}
