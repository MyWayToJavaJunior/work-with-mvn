package kz.pacourse.palesson7;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Тестирование класса Calculate
 */
public class CalculateTest {

    @Test(expected = UserException.class)
    public void notTwoArgsException() throws UserException {
        final String INPUT_ARGS_IS_NOT_TWO[] = {"1"};
        Calculate calculate = new Calculate();
        Calculate.main(INPUT_ARGS_IS_NOT_TWO);
    }

    @Test(expected = UserException.class)
    public void testArgsEmptyThrowsException() throws UserException {
        final String INPUT_ARGS_IS_EMPTY[] = {};
        Calculate calculate = new Calculate();
        Calculate.main(INPUT_ARGS_IS_EMPTY);
    }

    @Test(expected = UserException.class)
    public void testArgsContainZeroThrowsException() throws UserException {
        final String INPUT_ARGS_WITH_ZERO[] = {"1","0"};
        Calculate calculate = new Calculate();
        Calculate.main(INPUT_ARGS_WITH_ZERO);
    }
}