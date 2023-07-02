import tasks.taskImpl.*;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        TaskN1 taskN1 = new TaskN1();
//        taskN1.task();
        TaskN2 taskN2 = new TaskN2();
//        taskN2.task();
        TaskN3 taskN3 = new TaskN3();
//        taskN3.task();
        TaskN4 taskN4 = new TaskN4();
//        taskN4.task();
        TaskN5 taskN5 = new TaskN5();
//        taskN5.task();
        TaskN6 taskN6 = new TaskN6();
//        taskN6.task();
        TaskN7 taskN7 = new TaskN7();
//        taskN7.task();
        TaskN8 taskN8 = new TaskN8();
//        taskN8.task();
        TaskN9 taskN9 = new TaskN9();
//        taskN9.task();
        TaskN10 taskN10 = new TaskN10();
//        taskN10.task();
        TaskN11 taskN11 = new TaskN11();
//        taskN11.task();
        TaskN12 taskN12 = new TaskN12();
//        taskN12.task(3,new int[]{1,2,3,4,5});
        TaskN13 taskN13 = new TaskN13();
//        taskN13.task(new boolean[]{true, false, true});
        TaskN14 taskN14 = new TaskN14();
//        for (int i = 0; i < 10; i++) {
//            int randomNumber = random.nextInt(1,50);
//            taskN14.task(new int[]{randomNumber});
//        }
        TaskN15 taskN15 = new TaskN15();
//        int [] ints= new int[20];
//        for (int i = 0; i < ints.length; i++) {
//            int randomNumber = random.nextInt(1,50);
//            ints[i]=randomNumber;
//        }
//        taskN15.task(ints,15);
        TaskN16 taskN16 = new TaskN16();
        System.out.println(taskN16.task(3));
    }
}