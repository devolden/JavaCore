package tasks.taskImpl;
/**
 *17. Напишите метод, который принимает в качестве параметра
 *     массив целых чисел и число К, число К это индекс в массиве.
 *     Нам нужно вывести сумму всех чисел до индекса K массива.
 */
public class TaskN17 {
    public void task(int [] array, int k){
        for (int i = 0; i < k; i++) {
            System.out.print(", "+array[i]);
        }
    }
}
