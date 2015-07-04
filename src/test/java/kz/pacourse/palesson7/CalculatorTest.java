package kz.pacourse.palesson7;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * ������������ ������ Calculator
 */
public class CalculatorTest {
    /**
     * ���������� � ������������� ���������� ������������ ��� ��������
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
     * ������������� ������������ ������
     */
    final Calculator calculator = new Calculator();

    /**
     * �������� ������ ��������
     * @throws Exception ������������� ��� ������������� ���������� ��������
     * ����������� � ���������� ������������� ������
     */
    @Test
    public void testAdd() throws Exception {
        calculator.add(FIRST_INPUT_VALUE, SECOND_INPUT_VALUE, THIRD_INPUT_VALUE);
        int actualAddValue = calculator.getResult();
        assertEquals(EXPECTED_RESULT_ADD_VALUE, actualAddValue);
        calculator.clearResult();
    }

    /**
     * �������� ������ ���������� ��������
     * @throws Exception ������������� ��� ������������� ���������� ��������
     * ����������� � ���������� ������������� ������
     */
    @Test
    public void testSub() throws Exception {
        calculator.sub(FIRST_INPUT_VALUE, SECOND_INPUT_VALUE, THIRD_INPUT_VALUE);
        int actualSubValue = calculator.getResult();
        assertEquals(EXPECTED_RESULT_SUB_VALUE, actualSubValue);
        calculator.clearResult();
    }

    /**
     * �������� ������ ���������
     * @throws Exception ������������� ��� ������������� ���������� ��������
     * ����������� � ���������� ������������� ������
     */
    @Test
    public void testMult() throws Exception {
        calculator.mult(FIRST_INPUT_VALUE, SECOND_INPUT_VALUE, THIRD_INPUT_VALUE);
        int actualMultValue = calculator.getResult();
        assertEquals(EXPECTED_RESULT_MULT_VALUE, actualMultValue);
        calculator.clearResult();
    }

    /**
     * �������� ������ �������
     * @throws Exception ������������� ��� ������������� ���������� ��������
     * ����������� � ���������� ������������� ������
     */
    @Test
    public void testDiv() throws Exception {
        calculator.div(FIRST_INPUT_VALUE, SECOND_INPUT_VALUE, THIRD_INPUT_VALUE);
        int actualDivValue = calculator.getResult();
        assertEquals(EXPECTED_RESULT_DIV_VALUE, actualDivValue);
        calculator.clearResult();
    }

    /**
     * �������� ������ ��������� ���� result
     * ������������ ��������� �������� ���� result ������� ���������
     * @throws Exception ������������� ��� ������������� ���������� ��������
     * ����������� � ���������� ������������� ������
     * �������� ���������� ������ ���� ��������� ������ ��������� �� �������
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
     * �������� �� ������ ������ ��� ������� � ������
     * @throws UserException ������������� ����������������
     * ������ � ���������� ��������������� ����������
     */
    @Test(expected = UserException.class)
    public void divException() throws UserException {
        calculator.div(1,0);
    }
}