package experiment;

import org.junit.Test;

public class HelloWorldTest {

    @Test
    public void unit() {
        new HelloWorld("message");
        new HelloWorldMock("mock");
    }
}