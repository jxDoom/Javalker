import java.lang.reflect.Array;
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
        int[] nums = {3, 2, 2, 4, 3, 5, 7, 4};
        int val = 3;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] == val){
                int tmp = nums[i];
                nums[i] = nums[nums.length - 1];
                nums[nums.length - 1] = tmp;
            }
        }
        System.out.println(Arrays.toString(nums));

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
    }
}
