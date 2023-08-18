package in.ineuron;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringResBannerAppApplication {
	
	
@SuppressWarnings("static-access")
public static void main(String[] args) {
	
	
SpringApplication application = new SpringApplication();
ConfigurableApplicationContext ctx =

application.run(SpringResBannerAppApplication.class, args);

ctx.close();
}
}

//application.setBannerMode(Mode.CONSOLE);


