package in.ineuron.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name ="INSURANCE_POLICY")
public class InsurancePolicy {

	@Id
	@Column(name = "POLICY_ID")
	private Integer policyId;

	@Column(name = "POLICY_NAME")
	private String policyName;

	@Column(name = "POLICY_PRICE")
	private Double policyPrice;

}
