package tasks.taskImpl;
/**
 * 12. Создайте не возвращающий метод в параметры которого, вы
 *     даете массив из целых чисел и еще целое число n.
 *     Метод должен проверить есть ли в массиве число большее или
 *     равное n.
 *     Если есть такое число вывести в консоль true, в другом случае false!
 */

public class TaskN12 {
    public void task(int n,int []numbers){
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]==n && numbers[i]>=n){
                System.out.println(true);
            }else {
                System.out.println(false);
            }
        }
    }
}
