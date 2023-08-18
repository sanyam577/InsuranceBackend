package in.ineuron.document; //model is replaced

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.lang.NonNull;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Document //@Entity is replaced
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Customer {

	@Id
	private String id;

	@NonNull
	private Integer cno;

	@NonNull
	private String cname;

	@NonNull
	private Float billAmt;

	@NonNull
	private String caddr;

	@NonNull
	private Long mobileNo;
}
