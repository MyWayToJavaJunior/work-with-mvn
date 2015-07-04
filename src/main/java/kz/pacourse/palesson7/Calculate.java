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
        try {
            Calculate.argsEmptyThrowsException(args);
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

        try {
            Calculate.argsContainZeroThrowsException(args);
        } catch (UserException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }

        int summDiv = first / second;
        System.out.println(first + " / " + second + " = " + summDiv);
    }

    public static void argsEmptyThrowsException(String[] args) throws UserException {
        if (args.length < 2)
            throw new UserException("need two arguments at start program");
    }

    public static void argsContainZeroThrowsException(String[] args) throws UserException {
        if (args[1].equals("0"))
            throw new UserException("Can't do Divide with 0");
    }
}
