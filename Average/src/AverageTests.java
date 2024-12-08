import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AverageTests {
    private Average a;

    @Before
    public void newAvgObj(){
        a = new Average();
    }

    // Test Cases
    @Test
    public void testAverageEmptyArray() {
        int[] list = {};
        assertEquals(0, a.average(1, list));
    }

    @Test
    public void testAverageSingleElementArray() {
        int[] list = {3};
        assertEquals(3, a.average(1, list));
    }

    @Test
    public void testAverageKNegative() {
        int[] list = {1, 2, 3, 4};
        assertEquals(0, a.average(-1, list));
    }
 
    @Test
    public void testAverageK0() {
        int[] list = {1, 2, 3, 4};
        assertEquals(0, a.average(-1, list));
    }

    @Test
    public void testAverageK1() {
        int[] list = {1, 2, 3, 4};
        assertEquals(1, a.average(1, list));
    }
 
    @Test
    public void testAverageKInList() {
        int[] list = {1, 2, 3, 4};
        assertEquals(2, a.average(4, list));
    }

    @Test
    public void testAverageKEqualList() {
        int[] list = {2, 4, 3, 5, 7};
        assertEquals(4, a.average(9, list));
    }

    @Test
    public void testAverageKOverList() {
        int[] list = {2, 4, 3, 5, 7};
        assertEquals(4, a.average(9, list));
    }

    @Test
    public void testAverageKOneLessList() {
        int[] list = {3, 4, 6, 7, 1};
        assertEquals(5, a.average(4, list));
    }
        
}
