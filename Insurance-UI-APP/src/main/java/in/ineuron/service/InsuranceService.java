package in.ineuron.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class InsuranceService {

	public String getTotalPolicyPrice(String policyName, Integer time) {

		String REST_END_POINT = "http://localhost:4444/api/calc/calc/calculate/{policyName}/{time}";
		String response = null;

		WebClient webClient = WebClient.create();
		
		try {
			response=webClient.
					get().
					uri(REST_END_POINT, policyName,time).
					retrieve().
					bodyToMono(String.class).
					block();
			
		}catch(Exception e) {
			response="Policy not found";
		}

		return response;
	}

}
