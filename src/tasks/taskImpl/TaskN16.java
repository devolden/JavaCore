package tasks.taskImpl;
/**
 *16. Напишите метод возвращающий тип int, вы должны в параметры
 *     метода дать целое положительное число n.
 *     А метод нам вернёт сумму всех цифр от 0 до n.
 */
public class TaskN16 {
    public int task(int n){
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            int num = i;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
        }
        return sum;
    }
}
