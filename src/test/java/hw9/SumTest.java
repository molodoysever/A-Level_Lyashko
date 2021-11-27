package hw9;

import hw3.task1.Sum;
import hw3.task1.UserInput;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class SumTest {
    private UserInput userInputMock;
    private Sum sum = new Sum();

    @Before
    public void setUp() {
        userInputMock = Mockito.mock(UserInput.class);
    }
    @Test
    public void retSum() {
        Mockito.when(userInputMock.getNumber()).thenReturn(623);
        int act = sum.retSum(userInputMock);
        int expected = 11;
        assertEquals(expected, act);
    }
    @Test
    public void retSumNegative () {
        Mockito.when(userInputMock.getNumber()).thenReturn(-5);
        int act = sum.retSum(userInputMock);
        int expected = -1;
        assertEquals(expected,act);
    }
}