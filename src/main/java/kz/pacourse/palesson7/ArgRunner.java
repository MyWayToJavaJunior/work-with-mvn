package kz.pacourse.palesson7;


/**
 * Класс получающий данные из параметров
 * при запуске(args)
 */
public class ArgRunner {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.print("Args before magic: ");
        for (String s : args)
            System.out.print(s + " ");
        System.out.println("");
        System.out.print("Args after magic: ");
        int[] intArgs = getIntFromStringArgs(args);
        if (intArgs == null) {
            System.out.println("Need two args on start program");
            System.exit(0);
        }
        for (Integer i : intArgs)
            System.out.print(i + " ");
        System.out.println("");
        calc.add(intArgs);
        System.out.println("Result after add: " + calc.getResult());
        calc.sub(intArgs);
        System.out.println("Result after sub: " + calc.getResult());
        calc.mult(intArgs);
        System.out.println("Result after mult: " + calc.getResult());
        try {
            calc.div(intArgs);
            System.out.println("Result after add: " + calc.getResult());
        } catch (UserException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("*********************");
        System.out.println("   Total Result: " + calc.getResult());
        System.out.println("*********************");
    }

    private static int[] getIntFromStringArgs(String[] args) {
        int[] nullResult = new int[args.length];
        int realCountArgs = 0;
            for (int j = 0; j < args.length;j++) {
                try {
                    nullResult[realCountArgs] = Integer.valueOf(args[j]);
                    realCountArgs++;
                } catch (NumberFormatException e) {

                }
            }
        int[] result = new int[realCountArgs];
        System.arraycopy(nullResult, 0, result, 0, result.length);
        return realCountArgs < 2 ? nullResult : result;
    }

}
