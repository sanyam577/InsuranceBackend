package in.ineuron.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ineuron.service.IPolicyPriceService;

@RestController
@CrossOrigin
@RequestMapping("/price")
public class PolicyPriceController {

	@Autowired
	private IPolicyPriceService service;

	@GetMapping("/policyPrice/{policyName}")
	public ResponseEntity<Double> getStockPrice(@PathVariable String policyName) {

		Double price = service.findByPolicyName(policyName);
		System.out.println(policyName + " " + price);

		return new ResponseEntity<Double>(price, HttpStatus.OK);
	}

}

//url :-http://localhost:2222/price/policyPrice/LIC


