package kz.pacourse.palesson7;

/**
 * Выполняется суммирование входящих,
 * указанных при запуске программе аргументов,
 * и вывод результата суммирования в консоль.
 * @author DK
 * @version 1.0.0
 */
public class Calculate {
    public static void main(String[] args) {
        System.out.println("Calculated .....");
        int first = Integer.valueOf(args[0]);
        int second = Integer.valueOf(args[1]);
        int summ = first + second;
        System.out.println("Summ of " + first + " and " + second + " is " + summ);
    }
}
