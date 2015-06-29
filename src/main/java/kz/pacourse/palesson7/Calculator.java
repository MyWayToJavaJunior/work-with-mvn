package kz.pacourse.palesson7;

/**
 * Класс реализует математические операции над входящими данными
 */
public class Calculator {
    /**
     * хранит результат вычислений
     */
    private int result;

    /**
     * Выполняется суммирование входящего массива аргументов,
     * результат сохраняется в result суммируясь с его текущим значением
     * @param params входящий массив аргументов
     */
    public void add(int ... params) {
        int addResult = params[0];
        for (int i = 1; i < params.length - 1; i++) {
            addResult += params[i];
        }
        result += addResult;
    }

    /**
     * Выполняется операция разности над входящим массивом аргументов,
     * результат сохраняется в result суммируясь с его текущим значением
     * @param params входящий массив аргументов
     */
    public void sub(int ... params) {
        int subResult = params[0];
        for (int i = 1; i < params.length - 1; i++) {
            subResult -= params[i];
        }
        result += subResult;
    }

    /**
     * Выполняется перемножение входящего массива аргументов,
     * результат сохраняется в result суммируясь с его текущим значением
     * @param params входящий массив аргументов
     */
    public void mult(int ... params) {
        int multResult = params[0];
        for (int i = 1; i < params.length - 1; i++) {
            multResult *= params[i];
        }
        result += multResult;
    }

    /**
     * Выполняется операция деления над входящим массивом аргументов,
     * результат сохраняется в result суммируясь с его текущим значением
     * @param params входящий массив аргументов
     */
    public void div(int ... params) {
        int divResult = params[0];
        for (int i = 1; i < params.length - 1; i++) {
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
        result = 0;
    }
}
