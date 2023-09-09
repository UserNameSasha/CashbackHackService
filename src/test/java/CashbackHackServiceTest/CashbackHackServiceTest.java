package CashbackHackServiceTest;

import org.junit.Test;
import ru.netology.unit.CashbackHackService;

import static org.junit.Assert.*;


public class CashbackHackServiceTest {

      @Test
    public void testIfLess1000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 800;
        int actual = service.remain(200);
        assertEquals(expected, actual);
    }
    @Test
    public void testIfEquals1000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1000;
        int actual = service.remain(0);
        assertEquals(actual, expected);
    }
    @Test
    public void testIfMore1000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(1100);
        assertEquals(actual, expected);
    }

}
