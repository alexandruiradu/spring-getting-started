package ro.sda.spring;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ro.sda.spring.without_di.EmailServiceClient;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LegacyTest {

    private ByteArrayOutputStream outputContent = new ByteArrayOutputStream();


    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputContent));
    }

    @Test
    public void legacyTest() {
        EmailServiceClient app = new EmailServiceClient();

        app.processMessage("TEST MESSAGE", "mihai@yahoo.com");

        String output = outputContent.toString();

        assertEquals("Email sent to mihai@yahoo.com with message = TEST MESSAGE", output);
    }
}
