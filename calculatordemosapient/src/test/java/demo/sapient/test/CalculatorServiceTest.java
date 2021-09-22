package demo.sapient.test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


import org.junit.Test;
import org.junit.runner.RunWith;

import org.mockito.Mock;
import org.mockito.Mockito;

import org.springframework.test.context.junit4.SpringRunner;

import sapient.demo.CalculatorService;
import sapient.demo.Fees;

@RunWith(SpringRunner.class)

public class CalculatorServiceTest {

	@Mock
	private CalculatorService service;

	@Test
	public void calRepositoryTest() {
		// given

		long national_id = 9;
		Fees fe = new Fees();
		fe.setNational_id(national_id);
		Mockito.when(service.getByNational_id(national_id)).thenReturn(fe);

		Fees found = service.getByNational_id(fe.getNational_id());

		assertNotNull(found);
		assertEquals(found.getNational_id(), national_id);

	}

}