import java.util.LinkedList;
import java.util.Scanner;

public class DoubleMain {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите команду: ");
            String input = scanner.nextLine();

            if (input.startsWith("text~")) {

                String[] parts = input.split("~");
                if (parts.length == 2) {
                    int num = Integer.parseInt(parts[1]);
                    linkedList.add(num, parts[0]);
                }
            } else if (input.startsWith("print~")) {

                String[] parts = input.split("~");
                if (parts.length == 2) {
                    int num = Integer.parseInt(parts[1]);
                    if (num < linkedList.size()) {
                        System.out.println(linkedList.get(num));
                        linkedList.remove(num);
                    } else {
                        System.out.println("Позиция " + num + " не существует в списке.");
                    }
                }
            } else {
                System.out.println("Неверный формат команды.");
            }
        }
    }
}