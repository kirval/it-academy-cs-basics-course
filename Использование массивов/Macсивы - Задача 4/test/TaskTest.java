import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
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
        final ByteArrayInputStream in = new ByteArrayInputStream("1 2 3 4 5 6 7 8 9 100".getBytes());
        System.setIn(in);

        Task.main(new String[]{});

        assertThat(outContent.toString(), containsString("100"));
    }

}