package kz.pacourse.palesson7;

/**
 * Реализует свой класс исключений
 * наследуется от Exception
 */
public class UserException extends Exception{

    /**
     * Выбрасывает сообщение о ошибке
     * @param message сообщение о ошибке
     */
    public UserException(final String message) {
        super(message);
    }
}
