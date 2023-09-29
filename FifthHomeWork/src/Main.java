import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//Задание. Реализуйте структуру телефонной книги с помощью HashMap.
//Программа также должна учитывать, что во входной структуре будут повторяющиеся имена
//с разными телефонами, их необходимо считать, как одного человека с разными телефонами.
//Вывод должен быть отсортирован по убыванию числа телефонов.
        String[] names = new String[]{
                "Кирилл", "Геннадий", "Геннадий", "Александр", "Алексей", "Руслан", "Алексей",
                "Денис", "Светлана", "Ирина", "Ирина", "Александр", "Ольга", "Артур", "Алексей"};
        Integer[] numbers = new Integer[]{
                111, 222, 333, 444, 555, 666, 777, 888,
                999, 123, 456, 789, 987, 654, 321};
        // переопределяем метод toString для красивого вывода
        Map<String, ArrayList<Integer>> phoneBook = new HashMap<>() {
            @Override
            public String toString() {
                StringBuilder sb = new StringBuilder();
                forEach((key, value) -> sb.append(String.format("%30s ",key)).append(" ").append(value).append("\n"));
                return sb.toString();
            }
        };
        // заполняем с учетом разных номеров у человека
        for (int i = 0; i < names.length; i++) {
            ArrayList<Integer> tmp = new ArrayList<>(1);
            if (phoneBook.containsKey(names[i])) {
                phoneBook.get(names[i]).add(numbers[i]);
            }else{
                tmp.add(numbers[i]);
                phoneBook.put(names[i],tmp);
            }
        }
//        System.out.println(phoneBook);
        System.out.println("=".repeat(120));
        // Сортируем по значению и выводим в потоке
        StringBuilder sb = new StringBuilder();
        phoneBook.entrySet().stream().sorted(Map.Entry.comparingByValue((o1, o2) -> o2.size() - o1.size())).forEach(System.out::println);
    }
}
