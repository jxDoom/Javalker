import java.util.Arrays;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for (int item = 0; item < array.length; item++) array[item] = random.nextInt(0, 100);
        System.out.println(Arrays.toString(array));

//Задача 1.
//Внутри класса MergeSort напишите метод mergeSort, который принимает массив целых чисел a
//и реализует алгоритм сортировки слиянием. Метод должен возвращать отсортированный массив.
        int[] res = mergeSort(array);
        System.out.println(Arrays.toString(res));

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

}
