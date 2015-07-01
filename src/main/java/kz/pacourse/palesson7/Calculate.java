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
        if (!(args.length > 0)) try {
            throw new UserException("need two arguments at start program");
        } catch (UserException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
        int first = Integer.valueOf(args[0]);
        int second = Integer.valueOf(args[1]);
        int summAdd = first + second;
        int summSub = first - second;
        int summMult = first * second;

        System.out.println(first + " + " + second + " = " + summAdd);
        System.out.println(first + " - " + second + " = " + summSub);
        System.out.println(first + " * " + second + " = " + summMult);
        if (first == 0 || second == 0) {
            try {
                throw new UserException("Can't do Divide with 0");
            } catch (UserException e) {
                System.out.println(e.getMessage());
            }
        } else {
            int summDiv = first / second;
            System.out.println(first + " / " + second + " = " + summDiv);
        }
    }
}
