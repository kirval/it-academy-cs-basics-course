import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.containsString;
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
        Task.main(new String[]{});
        assertThat(outContent.toString(), containsString("1"));
        assertThat(outContent.toString(), containsString("2"));
        assertThat(outContent.toString(), containsString("3"));
        assertThat(outContent.toString(), containsString("4"));
        assertThat(outContent.toString(), containsString("5"));
        assertThat(outContent.toString(), containsString("6"));
        assertThat(outContent.toString(), containsString("7"));
        assertThat(outContent.toString(), containsString("8"));
        assertThat(outContent.toString(), containsString("9"));
        assertThat(outContent.toString(), containsString("10"));
    }

}