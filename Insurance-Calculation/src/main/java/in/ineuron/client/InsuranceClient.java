package in.ineuron.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "INSURANCE-PRICE-SERVICE")
public interface InsuranceClient {

	@GetMapping("/price/policyPrice/{policyName}")
	public ResponseEntity<Double> getPolicyPrice(@PathVariable String policyName);
	
}
//url http://localhost:3333/getTotalCost?policyName=LIC&time=2