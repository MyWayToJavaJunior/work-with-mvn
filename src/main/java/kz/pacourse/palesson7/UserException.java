package kz.pacourse.palesson7;

/**
 * ��������� ���� ����� ����������
 * ����������� �� Exception
 */
public class UserException extends Exception{

    /**
     * ����������� ��������� � ������
     * @param message ��������� � ������
     */
    public UserException(final String message) {
        super(message);
    }
}
