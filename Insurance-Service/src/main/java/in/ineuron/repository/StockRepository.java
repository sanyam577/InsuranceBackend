package in.ineuron.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ineuron.entity.InsurancePolicy;

public interface StockRepository extends JpaRepository<InsurancePolicy, Integer> {
	public InsurancePolicy findByPolicyName(String policyName);
}
