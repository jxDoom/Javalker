import java.util.Scanner;
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
//        int i = 123; double d = i;
//        System.out.println(i); // 123
//        System.out.println(d); // 123.0
//        d = 3.1415; i = (int)d;
//        System.out.println(d); // 3.1415
//        System.out.println(i); // 3
//        d = 3.9415; i = (int)d;
//        System.out.println(d); // 3.9415
//        System.out.println(i); // 3
//        byte b = Byte.parseByte("123");
//        System.out.println(b); // 123
//        b = Byte.parseByte("1234");    //Byte - класс-обертка, хранит значения от 0 до 255
//        System.out.println(b); // NumberFormatException: Value out of range

//        int[] a = new int[10];
//        double[] d = a; // ИЗУЧАЕМ инвариантные типы, ковариантность и контравариантность

//Получение данных из терминала
//        Scanner iScanner = new Scanner(System.in);
//        System.out.printf("name: ");
//        String name = iScanner.nextLine();
//        System.out.printf("Привет, %s!", name);
//        iScanner.close();

        /*Scanner iScanner = new Scanner(System.in);
        System.out.printf("int a: ");
        boolean flag = iScanner.hasNextInt();    //проверка на тип того, что ввели: true or false
        System.out.println(flag);
        int i = iScanner.nextInt();
        System.out.println(i);
        iScanner.close();*/

//Форматированный вывод
        /*String s = "qwe";
        int a = 123;
        String q = s + a;
        System.out.println(q);  //данный вывод содержит в себе 4 строки:
// 1-я строка s, 2-я строка a (неявное преобразование integer к string),
// s + a будет резмещено где то в памяти на время - 3-я строка,
// и из временной памяти значение будет положено на q - это 4-я строка*/

//        int a = 1, b = 2;
//        int c = a + b;
//        String res = String.format("%d + %d = %d \n", a, b, c);
//        System.out.printf("%d + %d = %d \n", a, b, c);
//        System.out.println(res);

        /*float pi = 3.1415f;
        System.out.printf("%f\n", pi); // 3,141500
        System.out.printf("%.2f\n", pi); // 3,14
        System.out.printf("%.3f\n", pi); // 3,141
        System.out.printf("%e\n", pi); // 3,141500e+00
        System.out.printf("%.2e\n", pi); // 3,14e+00
        System.out.printf("%.3e\n", pi); // 3,141e+00*/

//Область видимости переменных
//        int b = 111;
//        {
//            int a = 321;
//            System.out.println((a + b));
//        }int a = 222;
//        System.out.println(a);

//Функции и методы
//        sayHi();
//        Lib.sayHi();

//Управляющие конструкции
        //Тернарный оператор
        /*int a = 1;
        int b = 2;
        int min = a < b ? a : b;    //если условие выполняется, ВОЗВРАЩАЕТСЯ(return) a, если нет то возвращается b
        System.out.println(min);*/
        //В тернарном операторе не получится записать вывод(sout), т.к. значения должны возвращаться

//Оператор вывода

    }
    static String getType(Object o) {
        return o.getClass().getSimpleName();
    }
//    static public void sayHi(){
//        System.out.println("hi");
    }
}