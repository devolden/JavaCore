package tasks.taskImpl;
/**
 *13. Напишите не возвращающий метод, который берет в параметры
 *     массив из boolean типа, и выводит в консоль количество true
 *     элементов массива.
 */
public class TaskN13 {
    public void task(boolean [] countTrue){
        int quantityTrue=0;
        for (boolean b : countTrue) {
            if (b){
                quantityTrue++;
            }
        }
        System.out.println(quantityTrue);
    }
}
