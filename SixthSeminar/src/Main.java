import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Set<Integer> hashSet = new HashSet<>(List.of(1,2,3,2,4,5,6,3));
//        Set<Integer> treeSet = new TreeSet<>(List.of(1,2,3,2,4,5,6,3));
//        Set<Integer> linkedHashSet = new LinkedHashSet<>(List.of(1,2,3,2,4,5,6,3));
//
//        System.out.println(hashSet);
//        System.out.println(linkedHashSet);
//        System.out.println(treeSet);

        /*
        1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.

        2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите
        процент уникальных значений в данном массиве и верните его в виде числа с плавающей запятой.

        Для вычисления процента используйте формулу:
        процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
         */

//        int[] arr = new int[50];
//        Random random = new Random();
//        for(int i = 0; i < arr.length; i++){
//            arr[i] = random.nextInt(0, 25);
//        }
////        System.out.println(Arrays.toString(arr));
//        System.out.println(getNumSet(arr));

//        Dog dog = new Dog("bobik", new ArrayList<>(List.of("beshenstvo")));
//        System.out.println(dog.toString());
//    }
//
//    public static float getNumSet(int[] array){
//    Set<Integer> numSet = new TreeSet<Integer>();
//    for(int i = 0; i < array.length; i++){
//        numSet.add(array[i]);
//    }
//    System.out.println(numSet);
//    return (float) (numSet.size() * 100) / array.length;

        Dog dog1 = new Dog("Bob", "Mops", 10, new Date(1202324800), 5, true);
        Dog dog2 = new Dog("Pirat", "Ovcharka", 7, new Date(8082016), 12, true);
        Dog dog3 = new Dog("Guffi", "Doberman", 5, new Date(1311208), 8, false);

        DogClinic clinic = new DogClinic();
//        clinic.checkDog(dog1);
        clinic.checkDog(dog2);
        clinic.checkDog(dog3);
    }
}
