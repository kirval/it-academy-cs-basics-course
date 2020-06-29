import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class Task16Test {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUp() throws Exception {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void tearDown() throws Exception {
        System.setOut(originalOut);
    }

    @Test
    public void main() {
        String[] args = {"1", "2", "3", "4", "5"};

        long sum = Long.parseLong(args[0]);
        sum *= Long.parseLong(args[1]);
        sum *= Long.parseLong(args[2]);
        sum *= Long.parseLong(args[3]);
        sum *= Long.parseLong(args[4]);

        Task_1_6.main(args);
        assertThat(outContent.toString().trim(), containsString(String.valueOf(sum)));
    }

}