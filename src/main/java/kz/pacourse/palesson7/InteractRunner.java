package kz.pacourse.palesson7;

import java.util.InputMismatchException;
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
                int firstInt;
                int secondInt;
                try {
                    firstInt = Integer.valueOf(first);
                    secondInt = Integer.valueOf(second);
                } catch (NumberFormatException e) {
                    System.out.println("Some args not int");
                    continue;
                }
                System.out.println("1 add / 2 sub / 3 mult / 4 div");
                int userChoice = 0;
                try {
                    userChoice = reader.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("it is not a number");
                }
                switch (userChoice) {
                    case 1:     calc.add(firstInt, secondInt);
                                System.out.println("After Add: " +calc.getResult());
                                break;
                    case 2:     calc.sub(firstInt, secondInt);
                                System.out.println("After Sub: " +calc.getResult());
                                break;
                    case 3:     calc.mult(firstInt, secondInt);
                                System.out.println("After Mult: " +calc.getResult());
                                break;
                    case 4:     try {
                                    calc.div(firstInt, secondInt);
                                    System.out.println("After Div: " +calc.getResult());
                                } catch (UserException e) {
                                    System.out.println(e.getMessage());
                                }
                    default:    break;
                }
                System.out.println("**********************************");
                System.out.println("Total Result: " + calc.getResult());
                System.out.println("**********************************");
                System.out.println("Clear Result? yes/no");
                if ("yes".equals(reader.next()))
                    calc.clearResult();
                System.out.println("Result: " + calc.getResult());
                System.out.println("Exit? yes/no");
                exit = reader.next();
            }
        }
        finally {
            reader.close();
        }
    }
}
