package demo.sapient.test;




import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import org.springframework.test.context.junit4.SpringRunner;

import sapient.demo.CalculatorController;
import sapient.demo.CalculatorService;
import sapient.demo.Fees;

@RunWith(SpringRunner.class)

public class CalculatorControllerTest {

	@Mock
	CalculatorService cals;
	@InjectMocks
	CalculatorController calr;

	@Test
	public void test() throws Exception {

		Fees f = new Fees();
		f.setFees(9000);
		Mockito.when(cals.getByNational_id(9)).thenReturn(f);

		Fees response = calr.getHoaFees(9);
		assertEquals(9000l, response.getFees());
	}
}
