package kz.pacourse.palesson7;

import java.util.Scanner;

/**
 * Класс производит вычесления с использованием класса Calculator,
 * Аргументы для вычеслений принимает из консоли от пользователя
 */
public class InteractRunner {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        try {
            Calculator calc = new Calculator();
            String exit = "no";
            while (!exit.equals("yes")) {
                System.out.println("Enter first arg");
                String first = reader.next();
                System.out.println("Enter second arg");
                String second = reader.next();
                int firstInt = 0;
                int secondInt = 0;
                try {
                    firstInt = Integer.valueOf(first);
                    secondInt = Integer.valueOf(second);
                } catch (NumberFormatException e) {
                    System.out.println("Some args not int");
                    System.exit(0);
                }
                calc.add(firstInt, secondInt);
                calc.sub(firstInt, secondInt);
                calc.mult(firstInt, secondInt);
                try {
                    calc.div(firstInt, secondInt);
                } catch (UserException e) {
                    System.out.println(e.getMessage());
                    System.exit(0);
                }
                System.out.println("Result: " + calc.getResult());
                calc.clearResult();
                System.out.println("Exit? yes/no");
                exit = reader.next();
            }
        }
        finally {
            reader.close();
        }
    }
}
