package in.ineuron.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TransactionManagement {

	@Pointcut("execution(public void in.ineuron.service.printService.printName())")
	public void m1() {}
	
	@Pointcut("execution(void in.ineuron.service.printService.printOffers())")
	public void m2() {}

	
	@Pointcut("m1() || m2()")
	public void m() {}
	
	@Before("m()")
	public void welcome() {
		System.out.println("Welcome to SBI Bank ");
	}
	
	@After("m()")
	public void wish() {
		System.out.println("Have a great day ahead");
	}
}
