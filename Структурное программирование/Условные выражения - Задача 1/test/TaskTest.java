import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class TaskTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final InputStream originalIn = System.in;
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUp() throws Exception {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void tearDown() throws Exception {
        System.setIn(originalIn);
        System.setOut(originalOut);
    }

    @Test
    public void positiveTest() {
        final ByteArrayInputStream inContent = new ByteArrayInputStream("1".getBytes());
        System.setIn(inContent);

        Task.main(new String[]{});
        assertEquals("Положительное", outContent.toString().trim());
    }

    @Test
    public void negativeTest() {
        final ByteArrayInputStream inContent = new ByteArrayInputStream("-1".getBytes());
        System.setIn(inContent);

        Task.main(new String[]{});
        assertEquals("Отрицательное", outContent.toString().trim());
    }
    @Test
    public void zeroTest() {
        final ByteArrayInputStream inContent = new ByteArrayInputStream("0".getBytes());
        System.setIn(inContent);

        Task.main(new String[]{});
        assertEquals("Положительное", outContent.toString().trim());
    }

}