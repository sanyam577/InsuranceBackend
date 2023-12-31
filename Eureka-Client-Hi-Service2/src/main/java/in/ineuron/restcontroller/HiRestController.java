package in.ineuron.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.ineuron.clinet.HelloClient;


@RestController
public class HiRestController {

	@Autowired
	private HelloClient client;

	@GetMapping("/hi/{name}")
	public String sayHiee(@PathVariable("name") String name) {
		
		System.out.println("Implementation classname is :: " + client.getClass().getName());

		String hieeMsg = "hiee";

		String helloMsg = client.invokeHelloService(name);

		return hieeMsg + "---- " + helloMsg + " " + name + " how r u ?";
	}
}
