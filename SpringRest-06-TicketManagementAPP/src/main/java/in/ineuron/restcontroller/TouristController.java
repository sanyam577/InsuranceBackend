package in.ineuron.restcontroller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ineuron.model.Tourist;
import in.ineuron.service.ITouristMgmtService;

@RestController
@RequestMapping("/api/tourist")
public class TouristController {

	@Autowired
	private ITouristMgmtService service;

	@PostMapping("/register")
	public ResponseEntity<String> enrollTourist(@RequestBody Tourist tourist) {
		try {
			String resultMsg = service.registerTourist(tourist);
			return new ResponseEntity<String>(resultMsg, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>("Problem in tourist enrollment", HttpStatus.INTERNAL_SERVER_ERROR);// 500
																													// //
																													// Error
		}
	}
	/*
	 http://localhost:9999/RestMiniProject/api/tourist/register
	 {
    "tid": 2,
    "city": "shimla",
    "name": "dhoni",
    "packageType": "3days 2nights",
    "budget": 30345.6
     }
	 */
	
	
	@GetMapping("/findAll")
	public ResponseEntity<?> displayTouristDetails() {
		try {
			List<Tourist> list = service.fetchAllTourist();
			return new ResponseEntity<List<Tourist>>(list, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>("Problem in fetching tourist", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
//http://localhost:9999/RestMiniProject/api/tourist/findAll
	
	@GetMapping("/find/{id}")
	public ResponseEntity<?> displayTouristById(@PathVariable("id") Integer id) {
		try {
			Tourist tourist = service.fetchTouristById(id);
			return new ResponseEntity<Tourist>(tourist, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	//http://localhost:9999/RestMiniProject/api/tourist/find/2

	@PutMapping("/modify")
	public ResponseEntity<String> modifytourist(@RequestBody Tourist tourist) {
		try {
			String msg = service.updateTouristByDetails(tourist);
			return new ResponseEntity<String>(msg, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}
	// http://localhost:9999/RestMiniProject/api/tourist/modify        and put value in raw , Jason
		
	@PatchMapping("/budgetModify/{id}/{hike}")
	public ResponseEntity<String> modifytouristBudgetById(@PathVariable("id") Integer id,
			@PathVariable("hike") Float hikeAmt) {
		try {
			String msg = service.updateTouristById(id, hikeAmt);
			return new ResponseEntity<String>(msg, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}
//http://localhost:9999/RestMiniProject/api/tourist/budgetModify/2/10.0
	
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> removeTouristById(@PathVariable("id") Integer id) {
		try {
			String msg = service.deleteTouristById(id);
			return new ResponseEntity<String>(msg, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}
	
	//http://localhost:9999/RestMiniProject/api/tourist/delete/2
}
