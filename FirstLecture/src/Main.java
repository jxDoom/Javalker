public class Main {
    public static void main(String[] args) {
//        System.out.println("bye world");

//        float a = 123.45f;
//        double b = 123.45;

        /*char ch = '1';
        System.out.println(Character.isDigit(ch));  //true
        ch = 'a';   //неявное преобразование
        System.out.println(Character.isDigit(ch));  //false*/

        /*boolean flag1 = 123 <= 234;
        System.out.println(flag1); // true
        boolean flag2 = 123 >= 234 || flag1;    //операции &&, ||, &, | - последние 2 побитовые операции
        System.out.println(flag2); // true
        boolean flag3 = flag1 ^ flag2;          //^ - разделительная дизъюнкция(строго 1 значение истинно)
        System.out.println(flag3); // false*/

//        var i = 123;
//        var j = 123.456;
//        System.out.println(getType(i));
//        System.out.println(getType(j));

//        String s = "qwert";
//        s.length();
//        System.out.println(s.charAt(1));    //w

//        int a = 123;
//        a = a-- - --a;  //2
//        System.out.println(a);

//        int a = 5;  //101
//        a = a << 1;
//        System.out.println(a);  //1010 или 10

//        int a = 2;  //010
//        int b = 5;  //101
//                    //111 - если |
//                    //000 - если &
//        System.out.println(a | b);  //7
//        System.out.println(a & b);  //0
//        int a = 4;  //100
//        int b = 7;  //111
//                    //011 - если ^
//        System.out.println(a ^ b);
//Побитовая операция (&, | и т.д.) будет проверять все условия, тогда как
//обычные логические операции (&&, || и т.д.) встретив первый false(амперсанд, или true - параллель)
//сразу выводит его, не проверяя остальные условия

//        int[] arr = new int[10];
//        int[] arr = new int[] {1, 2, 3, 4};
//        arr[3] = 15;
//        System.out.println(arr[3]);

//Многомерные массивы
        /*int[] arr[] = new int[3][5];
        for (int[] line : arr) {
            for (int item : line) {
                System.out.printf("%d ", item);
            }System.out.println();
        }*/

        /*int[][] arr = new int[3][5];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%d ", arr[i][j]);
            }System.out.println();
        }*/

//Преобразования

    }
    static String getType(Object o) {
        return o.getClass().getSimpleName();
    }
}