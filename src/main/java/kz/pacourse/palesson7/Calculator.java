package kz.pacourse.palesson7;

/**
 * ����� ��������� �������������� �������� ��� ��������� �������
 */
public class Calculator {
    /**
     * ������ ��������� ����������
     */
    private int result;

    /**
     * ����������� ������������ ��������� ������� ����������,
     * ��������� ����������� � result ���������� � ��� ������� ���������
     * @param params �������� ������ ����������
     */
    public void add(int ... params) {
        int addResult = params[0];
        for (int i = 1; i < params.length - 1; i++) {
            addResult += params[i];
        }
        result += addResult;
    }

    /**
     * ����������� �������� �������� ��� �������� �������� ����������,
     * ��������� ����������� � result ���������� � ��� ������� ���������
     * @param params �������� ������ ����������
     */
    public void sub(int ... params) {
        int subResult = params[0];
        for (int i = 1; i < params.length - 1; i++) {
            subResult -= params[i];
        }
        result += subResult;
    }

    /**
     * ����������� ������������ ��������� ������� ����������,
     * ��������� ����������� � result ���������� � ��� ������� ���������
     * @param params �������� ������ ����������
     */
    public void mult(int ... params) {
        int multResult = params[0];
        for (int i = 1; i < params.length - 1; i++) {
            multResult *= params[i];
        }
        result += multResult;
    }

    /**
     * ����������� �������� ������� ��� �������� �������� ����������,
     * ��������� ����������� � result ���������� � ��� ������� ���������
     * @param params �������� ������ ����������
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
     * @return ���������� ���������� ���� result
     */
    public int getResult() {
        return result;
    }

    /**
     * �������� ���������� ���� result
     */
    public void clearResult() {
        result = 0;
    }
}
