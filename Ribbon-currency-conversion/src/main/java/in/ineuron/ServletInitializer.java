package in.ineuron;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(FeignClientApp.class);
	}

}

//http://laptop-1fne9bq7:4444/convert/from/EUR/to/INR/quantity/2
//http://laptop-1fne9bq7:4444/convert/from/USD/to/INR/quantity/4
//http://laptop-1fne9bq7:4444/convert/from/USD/to/INR/quantity/3

