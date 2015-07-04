package kz.pacourse.palesson7;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Тестирование класса Calculator
 */
public class CalculatorTest {
    /**
     * Обьявление и инициализация переменных используемых для проверки
     */
    final static int FIRST_INPUT_VALUE = -2;
    final static int SECOND_INPUT_VALUE = 6;
    final static int THIRD_INPUT_VALUE = -9;
    final static int CLEAR_RESULT_VALUE = 0;
    final static int EXPECTED_RESULT_ADD_VALUE =
            FIRST_INPUT_VALUE + SECOND_INPUT_VALUE + THIRD_INPUT_VALUE;
    final static int EXPECTED_RESULT_SUB_VALUE =
            FIRST_INPUT_VALUE - SECOND_INPUT_VALUE - THIRD_INPUT_VALUE;
    final static int EXPECTED_RESULT_MULT_VALUE =
            FIRST_INPUT_VALUE * SECOND_INPUT_VALUE * THIRD_INPUT_VALUE;
    final static int EXPECTED_RESULT_DIV_VALUE =
            FIRST_INPUT_VALUE / SECOND_INPUT_VALUE / THIRD_INPUT_VALUE;
    /**
     * Инициализация проверяемого класса
     */
    final Calculator calculator = new Calculator();

    /**
     * Проверка метода сложения
     * @throws Exception выбрасывается при несоответсвии ожидаемого значения
     * полученному в результате использования метода
     */
    @Test
    public void testAdd() throws Exception {
        calculator.add(FIRST_INPUT_VALUE, SECOND_INPUT_VALUE, THIRD_INPUT_VALUE);
        int actualAddValue = calculator.getResult();
        assertEquals(EXPECTED_RESULT_ADD_VALUE, actualAddValue);
        calculator.clearResult();
    }

    /**
     * Проверка метода вычисления разности
     * @throws Exception выбрасывается при несоответсвии ожидаемого значения
     * полученному в результате использования метода
     */
    @Test
    public void testSub() throws Exception {
        calculator.sub(FIRST_INPUT_VALUE, SECOND_INPUT_VALUE, THIRD_INPUT_VALUE);
        int actualSubValue = calculator.getResult();
        assertEquals(EXPECTED_RESULT_SUB_VALUE, actualSubValue);
        calculator.clearResult();
    }

    /**
     * Проверка метода умножения
     * @throws Exception выбрасывается при несоответсвии ожидаемого значения
     * полученному в результате использования метода
     */
    @Test
    public void testMult() throws Exception {
        calculator.mult(FIRST_INPUT_VALUE, SECOND_INPUT_VALUE, THIRD_INPUT_VALUE);
        int actualMultValue = calculator.getResult();
        assertEquals(EXPECTED_RESULT_MULT_VALUE, actualMultValue);
        calculator.clearResult();
    }

    /**
     * Проверка метода деления
     * @throws Exception выбрасывается при несоответсвии ожидаемого значения
     * полученному в результате использования метода
     */
    @Test
    public void testDiv() throws Exception {
        calculator.div(FIRST_INPUT_VALUE, SECOND_INPUT_VALUE, THIRD_INPUT_VALUE);
        int actualDivValue = calculator.getResult();
        assertEquals(EXPECTED_RESULT_DIV_VALUE, actualDivValue);
        calculator.clearResult();
    }

    /**
     * Проверка метода обнуления поля result
     * используется изменение значения поля result методом умножения
     * @throws Exception выбрасывается при несоответсвии ожидаемому значению
     * полученному в результате использования метода
     * Проверка происходит только если результат метода умножения не нулевой
     */
    @Test
    public void testClearResult() throws Exception {
        calculator.add(FIRST_INPUT_VALUE, SECOND_INPUT_VALUE, THIRD_INPUT_VALUE);
        int actualResultValue = calculator.getResult();
        if (actualResultValue != CLEAR_RESULT_VALUE) {
            calculator.clearResult();
            actualResultValue = calculator.getResult();
            assertEquals(CLEAR_RESULT_VALUE, actualResultValue);
        }
    }

    /**
     * Проверка на выброс ошибки при делении с нулями
     * @throws UserException выбрасывается пользовательская
     * ошибка с сообщением соответсвующего содержания
     */
    @Test(expected = UserException.class)
    public void divException() throws UserException {
        calculator.div(1,0);
    }
}