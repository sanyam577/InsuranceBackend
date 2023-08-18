package in.ineuron.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import in.ineuron.entity.InsurancePolicy;
import in.ineuron.exception.PolicyNotFoundException;
import in.ineuron.repository.StockRepository;

@Service
public class PolicyPriceServiceimpl implements IPolicyPriceService {

	@Autowired
	private StockRepository repo;

	@Override
	public Double findByPolicyName(String policyName) {

		InsurancePolicy insurancePolicy = repo.findByPolicyName(policyName);
		if (insurancePolicy == null) {
			throw new PolicyNotFoundException("Policy not vailable");
		}

		return insurancePolicy.getPolicyPrice();
	}

}
