import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Scanner inputData = new Scanner(System.in);
        // System.out.println("enter your age: ");
        // int age = inputData.nextInt();

        // if (age >= 18){
        //     System.out.println("welcome");
        // }else if (age >= 15){
        //     System.out.println("sorry you re not allowed");
        // }else {
        //     System.out.println("too small, go to school");
        // }

        //-------------------------------------------------------
        // Scanner enterName = new Scanner(System.in);
        // System.out.println("Введите Ваше имя");
        // String name = enterName.nextLine();
        // System.out.println("Привет" + name);

        //-------------------------------------------------------
        // int[] array = {1, 1, 0, 1, 1, 1};
        // int count = 0;
        // int maxCount = 0;
        // for (int i = 0; i < array.length; i++){
        //     if (array[i] == 1) count++;
        //     else if (count > maxCount){
        //         maxCount = count;
        //         count = 0;
        //     }

        // }if (count > maxCount) System.out.println(count);
        // else System.out.println(maxCount);

        //-------------------------------------------------------
        // int[] binaryArray = {1, 1, 0, 1, 1, 1,1};
        // int maxConsecutiveOnes = 0;
        // int currentCount = 0;

        // for (int num : binaryArray) {
        //     if (num == 1) {
        //         currentCount++;
        //         System.out.println(num);
        //         if (currentCount > maxConsecutiveOnes) {
        //             maxConsecutiveOnes = currentCount;
        //         }
        //     } else {
        //         currentCount = 0;
        //     }
        // }

        // System.out.println( + maxConsecutiveOnes);

        //--------------------------------------------------------
        /*int[] nums = {3, 2, 2, 4, 3, 5, 7, 4};
        int val = 3;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] == val){
                int tmp = nums[i];
                nums[i] = nums[nums.length - 1];
                nums[nums.length - 1] = tmp;
            }
        }
        System.out.println(Arrays.toString(nums));*/

        //--------------------------------------------------------
        // var array = new int[] {3, 2, 2, 3, 4,35,3,24,234,4,23,52,2,2,3,3,5,6565,3,55,3};
        // var val = 3;

        // boolean swap = true;
        // while (swap)
        // {
        //     swap = false;
        //     for (int i=0; i<array.length - 1; i++) {
        //         if (array[i] == 3 && array[i + 1] != 3){
        //             var temp = array[i + 1];
        //             array[i + 1] = array[i];
        //             array[i] = temp;
        //             swap = true;
        //         }
        //     }
        // }

        // System.out.println(Arrays.toString(array));

//        Напишите метод, который находит самую длинную строку общего префикса среди массива строк.
//        Если общего префикса нет, вернуть пустую строку "".

        Scanner scanner = new Scanner(System.in);
        String[] array = new String[3];
        System.out.println("Введите слова через Enter");
        array[0] = scanner.next();
        array[1] = scanner.next();
        array[2] = scanner.next();
//        System.out.println(Arrays.toString(array));
        String prefix = array[0];
        for (int i = 1; i < array.length; i++){ //перебираем строки в массиве, начиная со второй
            while (array[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length() - 1);  //на каждой итерации
                // ищем общую подстроку с текущим префиксом и текущей подстрокой из массива
                if (prefix == "")
                    System.out.println("");
            }
        }
        System.out.println("Общий префикс " + prefix);

//        Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.
//        String str = "Добро пожаловать на курс по Java";
//        //String reverse_str = new StringBuffer(str).reverse().toString();
//        //System.out.println(reverse_str);
//        String[] new_str = str.split(" ");
//        for (int i = new_str.length - 1; i >= 0; i--) {
//            System.out.print(new_str[i] + " ");
//        }

//        Реализовать функцию возведения числа а в степень b. a, b из Z.
//        Сводя количество выполняемых действий к минимуму.
//        Пример 1: а = 3, b = 2, ответ: 9
//        Пример 2: а = 2, b = -2, ответ: 0.25
//        Пример 3: а = 3, b = 0, ответ: 1

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите число: ");
//        Integer a = scanner.nextInt();
//        System.out.print("Введите степень: ");
//        Integer b = scanner.nextInt();
//        System.out.println(Math.pow(a, b));
    }
}
