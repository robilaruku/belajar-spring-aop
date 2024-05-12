package robidev.aop.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HelloServiceTest {

    @Autowired
    private HelloService helloService;

    @Test
    void testHelloService() {
        Assertions.assertEquals("Hello Robi", helloService.hello("Robi"));
        Assertions.assertEquals("Hello Robi Laruku", helloService.hello("Robi", "Laruku"));
        Assertions.assertEquals("Bye Robi", helloService.bye("Robi"));

        helloService.test();
    }
    
}
