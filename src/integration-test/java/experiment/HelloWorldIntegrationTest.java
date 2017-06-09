package experiment;

import org.junit.Test;

public class HelloWorldIntegrationTest {

    @Test
    public void it() {
        new HelloWorld("message");
        new HelloWorldMock("mock");
    }
}