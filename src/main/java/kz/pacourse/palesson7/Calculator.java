package kz.pacourse.palesson7;

/**
 * Класс реализует математические операции над входящими данными
 */
public class Calculator {
    /**
     * хранит результат вычислений
     */
    private int result;

    public void add(int ... params) {
        int addResult = params[0];
        for (int i = 1; i < params.length - 1; i++) {
            addResult += params[i];
        }
        result += addResult;
    }

    public void sub(int ... params) {
        int subResult = params[0];
        for (int i = 1; i < params.length - 1; i++) {
            subResult -= params[i];
        }
        result += subResult;
    }

    public void mult(int ... params) {
        int multResult = params[0];
        for (int i = 1; i < params.length - 1; i++) {
            multResult *= params[i];
        }
        result += multResult;
    }

    public void div(int ... params) {
        int divResult = params[0];
        for (int i = 1; i < params.length - 1; i++) {
            divResult /= params[i];
        }
        result += divResult;
    }

    public int getResult() {
        return result;
    }

    public void clearResult() {
        result = 0;
    }
}
