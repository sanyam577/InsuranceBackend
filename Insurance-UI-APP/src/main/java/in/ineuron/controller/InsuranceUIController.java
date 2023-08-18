package in.ineuron.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import in.ineuron.service.InsuranceService;

@Controller
@CrossOrigin
public class InsuranceUIController {

	@Autowired
	private InsuranceService service;

	@GetMapping("/")
	public String loadPage() {
		System.out.println("PolicyUIController loadPage()");
		return "index";
	}

	@GetMapping("/getTotalCost")
	public String getTotalCost(HttpServletRequest request, Model model) {
		System.out.println("InsuranceUIController.getTotalCost()");

		String policyName = request.getParameter("policyName");
		String time = request.getParameter("time");

		String response = service.getTotalPolicyPrice(policyName, Integer.parseInt(time));
		model.addAttribute("msg", response);
		return "index";
	}

}
