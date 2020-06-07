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
    public void test1() {
        final ByteArrayInputStream in = new ByteArrayInputStream("25".getBytes());
        System.setIn(in);

        Task.main(new String[]{});
        assertEquals("Попало", outContent.toString().trim());
    }

    @Test
    public void test2() {
        final ByteArrayInputStream in = new ByteArrayInputStream("50".getBytes());
        System.setIn(in);

        Task.main(new String[]{});
        assertEquals("Попало", outContent.toString().trim());
    }

    @Test
    public void test3() {
        final ByteArrayInputStream in = new ByteArrayInputStream("100".getBytes());
        System.setIn(in);

        Task.main(new String[]{});
        assertEquals("Попало", outContent.toString().trim());
    }

    @Test
    public void test4() {
        final ByteArrayInputStream in = new ByteArrayInputStream("-1".getBytes());
        System.setIn(in);

        Task.main(new String[]{});
        assertEquals("Не попало", outContent.toString().trim());
    }

    @Test
    public void test5() {
        final ByteArrayInputStream in = new ByteArrayInputStream("200".getBytes());
        System.setIn(in);

        Task.main(new String[]{});
        assertEquals("Не попало", outContent.toString().trim());
    }

}