import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        Integer[] array = new Integer[10];
        Random random = new Random();
        for (int item = 0; item < array.length; item++) array[item] = random.nextInt(0, 100);
        System.out.println(Arrays.toString(array));

//Задача 1.
//Внутри класса MergeSort напишите метод mergeSort, который принимает массив целых чисел a
//и реализует алгоритм сортировки слиянием. Метод должен возвращать отсортированный массив.
//        int[] array = new int[10];
//        Random random = new Random();
//        for (int item = 0; item < array.length; item++) array[item] = random.nextInt(0, 100);
//        System.out.println(Arrays.toString(array));
//        int[] res = mergeSort(array);
//        System.out.println(Arrays.toString(res));

//Задача 2.
//Напишите функцию removeEvenNumbers, которая принимала бы произвольный список целых чисел,
//удаляла бы из него четные числа и выводила список без четных чисел.
//Напишите свой код в методе removeEvenNumbers класса Answer.
//Метод removeEvenNumbers принимает на вход один параметр:
//Integer[] arr - список целых чисел
//        removeEvenNumbers(array);

//Задача 3.Напишите функцию analyzeNumbers, которая принимает на вход целочисленный список arr и:
//Сортирует его по возрастанию и выводит на экран
//Находит минимальное значение в списке и выводит на экран - Minimum is {число}
//Находит максимальное значение в списке и выводит на экран - Maximum is {число}
//Находит среднее арифметическое значений списка и выводит на экран - Average is =  {число}
//Напишите свой код в методе analyzeNumbers класса Answer.
//Метод analyzeNumbers принимает на вход один параметр:
//Integer[] arr - список целых чисел
        analyzeNumbers(array);
    }

    public static int[] mergeSort(int[] arr) {
        int[] buffer1 = Arrays.copyOf(arr, arr.length);
        int[] buffer2 = new int[arr.length];
        return mergeSorted(buffer1, buffer2, 0, arr.length);
    }

    public static int[] mergeSorted(int[] buffer1, int[] buffer2, int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }
        //уже отсортирован
        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] leftSorted = mergeSorted(buffer1, buffer2, startIndex, middle);
        int[] rightSorted = mergeSorted(buffer1, buffer2, middle, endIndex);

        //слияние
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = leftSorted == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = leftSorted[index1] < rightSorted[index2]
                    ? leftSorted[index1++] : rightSorted[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = leftSorted[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = rightSorted[index2++];
        }
        return result;
    }

    public static void removeEvenNumbers(Integer[] arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int item = 0; item < arr.length; item++) {
            if (arr[item] % 2 != 0) arrayList.add(arr[item]);
        }
        System.out.println(arrayList.toString());
    }

    public static void analyzeNumbers(Integer[] arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        quickSort(arr, 0, arr.length-1);
        arrayList.addAll(Arrays.asList(arr));
        System.out.println(arrayList.toString());
        System.out.printf("Minimum is %d\n", arr[0]);
        System.out.printf("Maximum is %d\n", arr[arr.length - 1]);
        int res = 0;
        for (int i = 0; i < arr.length; i++) res += arrayList.get(i);
        System.out.printf("Average is = %d\n", res/arrayList.size());
    }
    public static void quickSort(Integer[] arr, int low, int high){
        //завершить,если массив пуст или уже нечего делить
        if (arr.length == 0 || low >= high) return;

        //выбираем опорный элемент
        int middle = low + (high - low)/2;
        int border = arr[middle];

        //разделяем на подмассивы и меняем местами
        int i = low; int j = high;
        while (i <= j){
            while (arr[i] < border) i++;
            while (arr[j] > border) j--;
            if (i <= j){
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        }
        //рекурсия для сортировки левой и правой части
        if (low < j) quickSort(arr, low, j);
        if (high > i) quickSort(arr, i, high);
    }
}
