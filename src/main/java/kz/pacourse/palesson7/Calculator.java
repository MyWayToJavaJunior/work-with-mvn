package kz.pacourse.palesson7;

/**
 * ����� ��������� �������������� �������� ��� ��������� �������
 */
public class Calculator {
    /**
     * ������ ��������� ����������
     */
    private int result;
    private static final int VALUE_FOR_CLEAR_RESULT = 0;

    /**
     * ����������� ������������ ��������� ������� ����������,
     * ��������� ����������� � result ���������� � ��� ������� ���������
     * @param params �������� ������ ����������
     */
    public void add(final int ... params) {
        int addResult = params[0];
        for (int i = 1; i < params.length; i++) {
            addResult += params[i];
        }
        result += addResult;
    }

    /**
     * ����������� �������� �������� ��� �������� �������� ����������,
     * ��������� ����������� � result ���������� � ��� ������� ���������
     * @param params �������� ������ ����������
     */
    public void sub(final int ... params) {
        int subResult = params[0];
        for (int i = 1; i < params.length; i++) {
            subResult -= params[i];
        }
        result += subResult;
    }

    /**
     * ����������� ������������ ��������� ������� ����������,
     * ��������� ����������� � result ���������� � ��� ������� ���������
     * @param params �������� ������ ����������
     */
    public void mult(final int ... params) {
        int multResult = params[0];
        for (int i = 1; i < params.length; i++) {
            multResult *= params[i];
        }
        result += multResult;
    }

    /**
     * ����������� �������� ������� ��� �������� �������� ����������,
     * ��������� ����������� � result ���������� � ��� ������� ���������
     * @param params �������� ������ ����������
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
     * @return ���������� ���������� ���� result
     */
    public int getResult() {
        return result;
    }

    /**
     * �������� ���������� ���� result
     */
    public void clearResult() {
        result = VALUE_FOR_CLEAR_RESULT;
    }
}
