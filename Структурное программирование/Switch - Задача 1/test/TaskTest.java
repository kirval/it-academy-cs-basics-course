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
        final ByteArrayInputStream in = new ByteArrayInputStream("Вверх".getBytes());
        System.setIn(in);

        Task.main(new String[]{});
        assertEquals("Двигаться вверх", outContent.toString().trim());
    }

    @Test
    public void test2() {
        final ByteArrayInputStream in = new ByteArrayInputStream("Вниз".getBytes());
        System.setIn(in);

        Task.main(new String[]{});
        assertEquals("Двигаться вниз", outContent.toString().trim());
    }

    @Test
    public void test3() {
        final ByteArrayInputStream in = new ByteArrayInputStream("Влево".getBytes());
        System.setIn(in);

        Task.main(new String[]{});
        assertEquals("Двигаться влево", outContent.toString().trim());
    }

    @Test
    public void test4() {
        final ByteArrayInputStream in = new ByteArrayInputStream("Вправо".getBytes());
        System.setIn(in);

        Task.main(new String[]{});
        assertEquals("Двигаться вправо", outContent.toString().trim());
    }

    @Test
    public void test5() {
        final ByteArrayInputStream in = new ByteArrayInputStream("Стоять".getBytes());
        System.setIn(in);

        Task.main(new String[]{});
        assertEquals("Стоять на месте", outContent.toString().trim());
    }

    @Test
    public void test6() {
        final ByteArrayInputStream in = new ByteArrayInputStream("123".getBytes());
        System.setIn(in);

        Task.main(new String[]{});
        assertEquals("Неверное направление!", outContent.toString().trim());
    }

}