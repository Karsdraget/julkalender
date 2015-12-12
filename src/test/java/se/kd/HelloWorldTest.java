package se.kd;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class HelloWorldTest {
    @Test
    public void say_hello() {
        String expected = "Hello, World!";

        HelloWorld helloWorld = new HelloWorld();

        String actual = helloWorld.sayHello();

        assertThat(actual, is(expected));
    }
}
