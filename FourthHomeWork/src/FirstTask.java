import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Object> ll = new LinkedList<>();
        LinkedList<Object> arr = new LinkedList<>();
//        System.out.print("Введите количество элементов = ");
//        int k = scanner.nextInt();
//        for (int j = 0; j < k; j++) ll.add(scanner.next());
        ll.add(1);
        ll.add("One");
        ll.add(2);
        ll.add("Two");
        System.out.println(ll);
        for (int i = ll.toArray().length; i > 0; i--){
            arr.add(ll.pollLast());
        }
        System.out.println(arr.toString());
    }
}
