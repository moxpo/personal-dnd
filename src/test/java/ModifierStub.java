import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class ModifierStub {

    @Test
    public void stubCalculate() {
        Modifier modifier = mock(Modifier.class);

        when(modifier.calculate(10)).thenReturn(99);
        when(modifier.calculate(18)).thenReturn(500);

        int result1 = modifier.calculate(10);
        int result2 = modifier.calculate(18);

        assertEquals(99, result1);
        assertEquals(500, result2);
    }
}