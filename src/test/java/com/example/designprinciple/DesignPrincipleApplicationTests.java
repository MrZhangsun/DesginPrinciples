package com.example.designprinciple;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DesignPrincipleApplicationTests {

    @Test
    public void contextLoads() {
        for (int i = 1; i <= 100; i++) {
            for (int j = 2; i >= j; j++) {
                if (i % j == 0) {
                    break;
                }
            }

        }

    }

}
