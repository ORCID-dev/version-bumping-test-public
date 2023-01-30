package com.in28minutes.springboot;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.junit.Assert;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class StudentServicesApplicationTests {

	@Test
	public void contextLoads() {
	}


  @Test
  void whenDivideNumbers_thenExpectWrongResult() {
      double result = StudentServicesApplication.divideNumbers(6, 3);
      Assert.assertEquals(15, result);
  }

/*
  @Test
  void whenDivideNumbers_thenExpectWrongResult() {
      double result = StudentServicesApplication.divideNumbers(10, 2);
      Assert.assertEquals(5, result, 0 );
  }
*/

}
