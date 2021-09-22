package sapient.demo;

import org.springframework.web.bind.annotation.RestController;

import sapient.demo.exception.ErrorDetails;

import java.util.NoSuchElementException;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@RestController

@ControllerAdvice
@RequestMapping("/Calculator/")
public class CalculatorController {
	@Autowired
	CalculatorService cal;

	org.slf4j.Logger logger = LoggerFactory.getLogger(CalculatorController.class);

	@GetMapping("/Fees/{national_id}")
	public Fees getHoaFees(@PathVariable long national_id) {

		return cal.getByNational_id(national_id);
	}

	@ExceptionHandler(NoSuchElementException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public ErrorDetails handle(NoSuchElementException exception, HttpServletRequest request) {

		ErrorDetails er = new ErrorDetails("404", "national_id number is not found", request.getServletPath());
		return er;
	}

}
