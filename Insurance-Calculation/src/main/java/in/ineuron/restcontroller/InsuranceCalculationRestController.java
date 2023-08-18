package in.ineuron.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ineuron.client.InsuranceClient;

@RestController
@CrossOrigin
@RequestMapping("/calc")
public class InsuranceCalculationRestController {

	@Autowired
	private InsuranceClient client;

	@GetMapping("/calculate/{policyName}/{time}")
	public ResponseEntity<?> calculate(@PathVariable String policyName, @PathVariable Integer time) {

	    ResponseEntity<?> responseEntity = null;
	    Double totalPrice = null;
	    Double EMI = null;
	    System.out.println(policyName);
	    System.out.println(time);

	    try {
	        responseEntity = client.getPolicyPrice(policyName);
	        System.out.println(responseEntity);

	        int statusCode = responseEntity.getStatusCode().value();

	        if (statusCode == 200) {
	            Double companyStockPrice = (Double) responseEntity.getBody();
	            totalPrice = time * companyStockPrice * 12;
	            String response = "Total amount :: " + totalPrice;
	            EMI = totalPrice / 12;
	            String response2 = "EMI per month :: " + EMI;
	            String finalResponse = response + ", " + response2; // Combine response and response2
	            responseEntity = new ResponseEntity<String>(finalResponse, HttpStatus.OK); // Update ResponseEntity
	        }

	    } catch (Exception e) {
	        responseEntity = new ResponseEntity<String>("policy not found", HttpStatus.BAD_REQUEST);
	    }

	    return responseEntity;
	}
}

//url :-http://localhost:1111/calc//calculate/{policyName}/{time}

