package FirstTask;

import FirstTask.FirstTask;

public class Printer{
    public static void main(String[] args) {
        int n;

        if (args.length == 0) {
            n = 8;
        }
        else{
            n = Integer.parseInt(args[0]);
        }

        FirstTask ans = new FirstTask();
        int it_resume_res = ans.countNTriangle(n);
        System.out.println(it_resume_res);
    }
}
