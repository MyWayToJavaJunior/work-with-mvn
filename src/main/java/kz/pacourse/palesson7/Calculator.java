package kz.pacourse.palesson7;

/**
 * Класс реализует математические операции над входящими данными
 */
public class Calculator {
    /**
     * хранит результат вычислений
     */
    private int result;
    private static final int VALUE_FOR_CLEAR_RESULT = 0;

    /**
     * Выполняется суммирование входящего массива аргументов,
     * результат сохраняется в result суммируясь с его текущим значением
     * @param params входящий массив аргументов
     */
    public void add(final int ... params) {
        int addResult = params[0];
        for (int i = 1; i < params.length; i++) {
            addResult += params[i];
        }
        result += addResult;
    }

    /**
     * Выполняется операция разности над входящим массивом аргументов,
     * результат сохраняется в result суммируясь с его текущим значением
     * @param params входящий массив аргументов
     */
    public void sub(final int ... params) {
        int subResult = params[0];
        for (int i = 1; i < params.length; i++) {
            subResult -= params[i];
        }
        result += subResult;
    }

    /**
     * Выполняется перемножение входящего массива аргументов,
     * результат сохраняется в result суммируясь с его текущим значением
     * @param params входящий массив аргументов
     */
    public void mult(final int ... params) {
        int multResult = params[0];
        for (int i = 1; i < params.length; i++) {
            multResult *= params[i];
        }
        result += multResult;
    }

    /**
     * Выполняется операция деления над входящим массивом аргументов,
     * результат сохраняется в result суммируясь с его текущим значением
     * @param params входящий массив аргументов
     */
    public void div(final int ... params) {
        int divResult = params[0];
        for (int i = 1; i < params.length; i++) {
            divResult /= params[i];
        }
        result += divResult;
    }

    /**
     *
     * @return возвращает содержимое поля result
     */
    public int getResult() {
        return result;
    }

    /**
     * Обнуляет содержимое поля result
     */
    public void clearResult() {
        result = VALUE_FOR_CLEAR_RESULT;
    }
}
