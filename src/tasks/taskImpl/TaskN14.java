package tasks.taskImpl;
/**
 *14. Напишите не возвращающий метод который в параметры берет
 *     массив из рандомных чисел от 1 до 50 и выводит в консоль только
 *     те числа что больше 20.
 */
public class TaskN14 {
    public void task(int[] randomNumbers ){
        for (int randomNumber : randomNumbers) {
            if (randomNumber>=20){
                System.out.println(randomNumber);
            }
        }
    }
}
