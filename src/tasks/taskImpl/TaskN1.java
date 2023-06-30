package tasks.taskImpl;

import tasks.Tasks;

import java.util.Random;

/**
 * 1. Напишите класс, который создает 20 случайных чисел диапазона
 *     1 - 99. Следует вывести в консоль только те числа которые делятся
 *     на 1-ое рандомное число без остатка.
 *     - Нельзя использовать массив.*/
public class TaskN1 implements Tasks {

    public void task(){
        Random random = new Random();
        int firstNum= 0;
        for (int i = 0; i <= 20; i++) {
            int ranNum = random.nextInt(1,99);
            if (i==0){
                firstNum+=ranNum;
                System.out.println("First number: "+firstNum);
            }else if (ranNum % firstNum == 0){
                System.out.println(ranNum+" % "+firstNum+" = "+(ranNum % firstNum));

            }

        }
    }

}
