import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class HelloWorldTests {

    @Test
    void sayHelloWorldTest() {
        HelloWorld helloWorld = new HelloWorld;
        
        String expected = "Hello, World";
        assertEquals(expected, helloWorld.returnHelloWorld);
    }
}