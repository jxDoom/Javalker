import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
public class Main {
//    public static void main(String[] args) {
//        Object o = 1; GetType(o); // java.lang.Integer
//        o = 1.2; GetType(o); // java.lang.Double
//    }
//    static void GetType(Object obj) {
//        System.out.println(obj.getClass().getName());
//    }

//    public static void main(String[] args) {
//        System.out.println(Sum(1, 2));
//        System.out.println(Sum(1.0, 2));
//        System.out.println(Sum(1, 2.0));
//        System.out.println(Sum(1.2, 2.1));
//    }
//    static Object Sum(Object a, Object b) {
//        if (a instanceof Double && b instanceof Double) {   //принадлежит ли переменная к типу (true||false)
//            return (Object)((Double) a + (Double) b);
//        } else if(a instanceof Integer && b instanceof Integer) {
//            return (Object)((Integer) a + (Integer) b);
//        } else return 0;
//    }
//Коллекция List
//    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<Integer>();    //Save Type
//        list.add(2809);
//
//        for (Object o: list){
//            System.out.println(o);
//        }
//    }
//    public static void main(String[] args) {
//        List list = new ArrayList();    //Пример с "сырыми" типами (Row type)
//        list.add(2809);
//        list.add("string line");
//        for (Object o : list) {
//            System.out.println(o);
//            // Проблема извлечения данных
//        }
//    }

//    public static void main(String[] args) {
//        StringBuilder day = new StringBuilder("28");
//        StringBuilder month = new StringBuilder("9");
//        StringBuilder year = new StringBuilder("1990");
//        StringBuilder[] date = { day, month, year };
//        List<StringBuilder> d = Arrays.asList(date);
//        System.out.println(d);  //[28, 9, 1990]
//        date[1] = new StringBuilder("09");
//        System.out.println(d);  //[28, 09, 1990]
//    }

//    public static void main(String[] args) {
//        Character value = null;
//        List<Character> list1 = List.of('S', 'e', 'r', 'g', 'e', 'y');  //неизменяемый список (как кортеж в питоне)
//        System.out.println(list1);
////        list1.remove(1); // java.lang.UnsupportedOperationException   //ошибка
//        List<Character> list2 = List.copyOf(list1); // not null, immutable
//        list2.remove(1);
//        System.out.println(list2);
//    }

//Итератор
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 12, 123, 1234, 12345);

        for (int item : list) { //foreach в Java
            System.out.println(item);
        } Iterator<Integer> col = list.iterator();

        while (col.hasNext()) {
            System.out.println(col.next());
//            col.next();
//            col.remove(); //77 и 78 строчки - так делать нельзя

        }
    }
}