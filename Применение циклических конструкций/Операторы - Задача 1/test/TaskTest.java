import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

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
        final ByteArrayInputStream in = new ByteArrayInputStream("1 0 2".getBytes());
        System.setIn(in);

        Task.main(new String[]{});

        assertThat(outContent.toString(), containsString("Нечетное"));
        assertThat(outContent.toString(), not(containsString("Четное")));
    }

    @Test
    public void test2() {
        final ByteArrayInputStream in = new ByteArrayInputStream("1 0".getBytes());
        System.setIn(in);

        Task.main(new String[]{});

        assertThat(outContent.toString(), containsString("Нечетное"));
    }

    @Test
    public void test3() {
        final ByteArrayInputStream in = new ByteArrayInputStream("2 0".getBytes());
        System.setIn(in);

        Task.main(new String[]{});

        assertThat(outContent.toString(), containsString("Четное"));
    }

}