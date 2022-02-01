import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void testSubtract() {
        assertEquals(14, SkillDemo.subtract(20, 6));
    }
}