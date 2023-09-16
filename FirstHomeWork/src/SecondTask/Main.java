package SecondTask;

import static java.lang.Math.sqrt;

public class Main {
    public void printPrimeNums(){
        System.out.println(2);
        int i;
        int n = 3;
        while (n < 1000) {
            boolean simple = false;
            for (i = 2; i <= sqrt(n); i++){
                simple = (n % i == 0);
                if (simple)
                    break;
            }
            if (!simple)
                System.out.println(n);
            n+=2;
        }
    }
}
