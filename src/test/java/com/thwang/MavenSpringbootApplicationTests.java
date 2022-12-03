package com.thwang;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;

@SpringBootTest
@PropertySource(value = "classpath:application.yml")
class MavenSpringbootApplicationTests {

  @Test
  void contextLoads() {
  }

}
