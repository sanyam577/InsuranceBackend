package in.ineuron.runners;

import java.util.Arrays;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class EmailRunner implements ApplicationRunner {

	@Value("${spring.application.name}")
	private String name;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
         
		/*
		System.out.println("Form ApplicationRunner ::"+Arrays.asList(args.getSourceArgs()));
	  //printing non options args
            System.out.println("NonOptionalArgs  :: "+ args.getNonOptionArgs());
	
          //printing options args
            System.out.println("OptionalArgs  :: "+ args.getOptionNames());
	   
            Set<String> optionNames = args.getOptionNames();
            for(String optionName :optionNames) {
            	System.out.println(optionName + "::" + args.getOptionValues(optionName));
            }
            if(args.getNonOptionArgs().contains("start")) {
            	System.out.println("Start taking Email Dump");
            }
	     */
	
		System.out.println(name);
		
	}

}
