package in.ineuron.config;

import java.util.Arrays;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.ineuron.methodref.SampleTest;

@Configuration
public class AppConfig {

	@Bean
	public CommandLineRunner runA() {
		
		/*//ANANOMUS CLASS 
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				System.out.println("HELLO :: "+Arrays.asList(args));
			}
		};
		*/
		/*
		//Lambda Expression
		
		return (args) -> {
			System.out.println("FROM RUNNER :: "+Arrays.asList(args));
		};
		*/
		
		//using class
			return SampleTest::test;
					
		
	
		
		
	}
	
}
