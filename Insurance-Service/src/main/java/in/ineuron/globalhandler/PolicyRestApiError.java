package in.ineuron.globalhandler;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import in.ineuron.exception.PolicyNotFoundException;

@RestControllerAdvice
public class PolicyRestApiError {
	@ExceptionHandler(value = PolicyNotFoundException.class)
	public ResponseEntity<String> handlePolicyNotFoundException(PolicyNotFoundException se) {
		return new ResponseEntity<String>(se.getMessage(), HttpStatus.BAD_REQUEST);
	}
}
