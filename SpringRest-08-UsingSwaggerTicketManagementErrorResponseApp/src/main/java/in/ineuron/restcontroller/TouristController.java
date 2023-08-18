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
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/tourist")
public class TouristController {

	@Autowired
	private ITouristMgmtService service;

	@PostMapping("/register")
	@ApiOperation("For Tourist Registration")
	public ResponseEntity<String> enrollTourist(@RequestBody Tourist tourist) {

		String resultMsg = service.registerTourist(tourist);
		return new ResponseEntity<String>(resultMsg, HttpStatus.OK);

	}

	@ApiOperation("Find Tourist Details")
	@GetMapping("/findAll")
	public ResponseEntity<?> displayTouristDetails() {

		List<Tourist> list = service.fetchAllTourist();
		return new ResponseEntity<List<Tourist>>(list, HttpStatus.OK);

	}

	@GetMapping("/find/{id}")
	@ApiOperation("Find Tourist Details By Id")
	public ResponseEntity<?> displayTouristById(@PathVariable("id") Integer id) {

		Tourist tourist = service.fetchTouristById(id);
		return new ResponseEntity<Tourist>(tourist, HttpStatus.OK);

	}

	@PutMapping("/modify")
	@ApiOperation("Update Tourist Details")
	public ResponseEntity<String> modifytourist(@RequestBody Tourist tourist) {

		String msg = service.updateTouristByDetails(tourist);
		return new ResponseEntity<String>(msg, HttpStatus.OK);

	}

	@PatchMapping("/budgetModify/{id}/{hike}")
	@ApiOperation("Update Tourist Details By ID")
	public ResponseEntity<String> modifytouristBudgetById(@PathVariable("id") Integer id,
			@PathVariable("hike") Float hikeAmt) {

		String msg = service.updateTouristById(id, hikeAmt);
		return new ResponseEntity<String>(msg, HttpStatus.OK);

	}

	@DeleteMapping("/delete/{id}")
	@ApiOperation("Delete Tourist Details")
	public ResponseEntity<String> removeTouristById(@PathVariable("id") Integer id) {
		String msg = service.deleteTouristById(id);
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
}
