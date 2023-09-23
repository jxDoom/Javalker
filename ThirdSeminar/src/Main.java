import java.util.*;

public class Main {
    public static void main(String[] args) {
////Collection ArrayList
//        ArrayList<String> arrayList = new ArrayList<>();
//        arrayList.add("I ");
//        arrayList.add("love ");
//        arrayList.add("MK1");
//        System.out.println(arrayList.toString()); //[I , love , MK1]
////Collection LinkedList - выведится так же как и ArrayList, разница в хранении данных, в скорости
////В основе ArrayList лежит массив, а у LinkedList лежит цепочка объектов

////Collection Set
////        Set<String> arrayList = new TreeSet<>();
//        Set<String> arrayList = new LinkedHashSet<>();
//        arrayList.add("I ");
//        arrayList.add("love ");
//        arrayList.add("MK1");
//        System.out.println(arrayList.toString());   //[I , MK1, love ] - TreeSet<>()
//                                                    //[I , love , MK1] - LinkedHashSet<>()

////Map
//        Map<String, Integer> arrayList = new HashMap<>();
//        arrayList.put("Alexey", 54619480);
//        arrayList.put("Nikolai", 4566846);
//        System.out.println(arrayList.toString());   //{Alexey=54619480, Nikolai=4566846}
//        System.out.println(arrayList.get("Alexey"));    //54619480
//        System.out.println(arrayList.entrySet());   //[Alexey=54619480, Nikolai=4566846]

//        String s1 = "hello";
//        String s2 = "hello";
//        String s3 = s1;
//        String s4 = "h" + "e" + "l" + "l" + "o";
//        String s5 = new String("hello");
//        String s6 = new String(new char[]{'h','e','l','l','o'});
//
//        System.out.println(s1 == s2);   //true
//        System.out.println(s1 == s3);   //true
//        System.out.println(s1 == s4);   //true
//        System.out.println(s1 == s5);   //false
//        System.out.println(s1 == s6);   //false
//        System.out.println(s1.equals(s5));  //true
//        System.out.println(s1.equals(s6));  //true

//        Random random = new Random();
//        System.out.println(random.nextInt(0,100));

//Задача 1. Заполнить список 10 случайными числами.
//Отсортировать список методом sort() и вывести его на экран.
//        System.out.println(randomNumbers(10).toString());

//Задача 2. Заполнить список названиями планет Солнечной системы
//в произвольном порядке с повторениями.
//Вывести название каждой планеты и количество его повторений в списке.
//        System.out.println(solarSystem(10));

//Задача 3. Создать список типа ArrayList<Object>.
//Поместить в него как строки, так и целые числа.
//Пройти по списку, найти и удалить целые числа.

//        System.out.println(deleteInts());

//Задача 4./*
//        Каталог товаров книжного магазина сохранен в виде
//        двумерного списка List<ArrayList<String>> так, что на 0й
//        позиции каждого внутреннего списка содержится название
//        жанра, а на остальных позициях - названия книг. Напишите
//        метод для заполнения данной структуры.
//         */

        list2d();

    }

//    public static ArrayList<Integer> randomNumbers(int N) {
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        Random random = new Random();
//        for (int i = 0; i < N; i++) {
//            arrayList.add(random.nextInt(0, 100));
//        }
//        Collections.sort(arrayList);
//        return arrayList;
//    }

//    public static ArrayList<String> solarSystem(int N) {
//        ArrayList<String> tempArrayList = new ArrayList<>();
//        Random random = new Random();
//        String[] planets = {"Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Uranus"};
//        for (int i = 0; i < N; i++) {
//            tempArrayList.add(planets[random.nextInt(0, planets.length)]);
//        }
//        Map<String, Integer> repeats = new HashMap<>();
//        for (int i = 0; i < planets.length; i++) {
//            repeats.put(planets[i], 0);
//        }
//        for (int i = 0; i < repeats.size(); i++) {
//            for (int j = 0; j < tempArrayList.size(); j++) {
//                if (repeats.get(i).equals(tempArrayList.get(j))) {  //???
//                    repeats.computeIfPresent(tempArrayList.get(j), (k, v) -> v + 1);
//                }
//            }
//        }
//        return tempArrayList;
//    }

//    public static ArrayList deleteInts() {
//        ArrayList<Object> ls = new ArrayList<>();
//        ls.add(6);
//        ls.add("tetx");
//        ls.add("8");
//        ls.add(3);
//        ls.add(true);
//        ls.add(100);
//        for (int i = 0; i < ls.size(); i++) {
//            if (ls.get(i) instanceof Integer) {
//                ls.remove(i);
//            }
//        }
//        return ls;
//    }

    public static void list2d() {
        List<ArrayList<String>> library = new ArrayList<>();
        ArrayList<String> aL1 = new ArrayList<>(List.of("Проза"));
        aL1.add("Война и мир");
        aL1.add("12 Стульев");
        ArrayList<String> aL2 = new ArrayList<>(List.of("Поэзия"));
        aL2.add("Бородино");
        ArrayList<String> aL3 = new ArrayList<>(List.of("Документальные"));
        library.add(aL1);
        library.add(aL2);
        library.add(aL3);
        for (ArrayList<String> strings : library) {
            System.out.println(strings);
        }

        int rows = library.size();
        for (ArrayList<String> strings : library) {
            int columns = strings.size();
            for (int j = 0; j < columns; j++) {
                System.out.print(strings.get(j) + "\n");
            }
        }
    }
}
