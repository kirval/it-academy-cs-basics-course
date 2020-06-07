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
        final ByteArrayInputStream in = new ByteArrayInputStream("1".getBytes());
        System.setIn(in);

        Task.main(new String[]{});
        assertEquals("Вы выбрали квадрат", outContent.toString().trim());
    }

    @Test
    public void test2() {
        final ByteArrayInputStream in = new ByteArrayInputStream("2".getBytes());
        System.setIn(in);

        Task.main(new String[]{});
        assertEquals("Вы выбрали круг", outContent.toString().trim());
    }

    @Test
    public void test3() {
        final ByteArrayInputStream in = new ByteArrayInputStream("3".getBytes());
        System.setIn(in);

        Task.main(new String[]{});
        assertEquals("Вы выбрали треугольник", outContent.toString().trim());
    }

    @Test
    public void test4() {
        final ByteArrayInputStream in = new ByteArrayInputStream("4".getBytes());
        System.setIn(in);

        Task.main(new String[]{});
        assertEquals("Вы выбрали ромб", outContent.toString().trim());
    }

    @Test
    public void test5() {
        final ByteArrayInputStream in = new ByteArrayInputStream("5".getBytes());
        System.setIn(in);

        Task.main(new String[]{});
        assertEquals("Нет такой фигуры!", outContent.toString().trim());
    }

}