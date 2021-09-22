package demo.sapient.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import sapient.demo.CalculatorDemoApplication;

@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
public class CalculatorDemoApplicationTests {

	@Test
	public void main() {
		CalculatorDemoApplication.main(new String[] {});
	}

}
