package tasks.taskImpl;

import java.util.Scanner;

/**
 * 7. Напишите класс, который принимает с клавиатуры целое число
 *         любой длины и строит из него число с обратным порядком цифр.
 *     Новое значение следует вывести в консоль.
 *     */
public class TaskN7 {
    public void task(){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();
        String string = Integer.toString(number);
        System.out.println("string.charAt(3) = " + string.charAt(2));
        for (int i = string.length()-1; i >= 0; i--) {
            System.out.print(string.charAt(i));
        }

    }
}
