package tasks.taskImpl;

/**
 * 15. Напишите не возвращающий метод, который берет массив из
 * рандомных чисел от 1 до 50 и еще одно целое число n.
 * Нужно вывести в консоль сколько раз число n повторялось в
 * массиве.
 */
public class TaskN15 {
    public void task(int[] array, int n) {
        int countN = 0;
        for (int i : array) {
            System.out.print(" "+i+",");
            if (i == n) countN++;

        }
        System.out.println("\n"+countN);
    }
}
