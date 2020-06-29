import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class Task15Test {

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
        Task_1_5.main(new String[]{});
        assertEquals("Hello, Java platform", outContent.toString().trim());
    }

}