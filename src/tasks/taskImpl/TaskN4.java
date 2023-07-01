package tasks.taskImpl;

import java.util.Scanner;

/**
 * 4. Напишите класс, который принимает с клавиатуры две
 * переменный это два числа, пока не будет введено две одинаковых
 * чисел.
 * Класс должен выводить на экран сумму всех первых чисел и сумму
 * всех вторых чисел (не считая чисел, введенных одинаковыми).
 */
public class  TaskN4 {
    public void task() {
        Scanner scanner = new Scanner(System.in);
        int sum= 0;
        while (true) {
            System.out.println("number 1");
            int num1 = scanner.nextInt();
            System.out.println("number 2");
            int num2 = scanner.nextInt();
            String convert = Integer.toString(num1);
            for (int i = 0; i < convert.length(); i++) {
                System.out.print("~");
            }
            System.out.println();

            if (num1 ==num2){
                System.out.println("Number1 and Number2 is equals!!!");
                break;
            }
            sum+=num1;
            sum+=num2;
        }
        System.out.println(sum);
    }

}
