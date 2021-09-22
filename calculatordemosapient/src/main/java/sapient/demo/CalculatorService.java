package sapient.demo;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

	@org.springframework.beans.factory.annotation.Autowired(required = true)

	CalculatorRepository calrepo;

	public Fees getByNational_id(long national_id) {
		return calrepo.findById(national_id).get();
	}

}
