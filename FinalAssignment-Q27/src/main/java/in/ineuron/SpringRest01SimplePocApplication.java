package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringRest01SimplePocApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRest01SimplePocApplication.class, args);
	}

}



//Url:- http://localhost:9999/api/customer/report/5
