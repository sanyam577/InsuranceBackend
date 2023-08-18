package in.ineuron.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//import in.ineuron.client.HelloClient;

@RestController
public class HelloRestController {

	
	//@Autowired
//	private HelloClient client;

	@GetMapping("/hello/{name}")
	public String sayHiee(@PathVariable("name") String name) {
		
//		System.out.println("Implementation classname is :: " + client.getClass().getName());

		String helloMsg = "hello";

//		String helloMsg = client.invokeHelloService(name);

		return helloMsg + " "+name + " how r u ?";
	}
}
