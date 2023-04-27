package loham.demo.apicall;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpStatusCodeException;

import loham.demo.services.GetScrappedDataService;

@RestController
@RequestMapping("")
public class Controller {
	
	@Autowired
	GetScrappedDataService data;

	
	@GetMapping("/get")
	public ResponseEntity<String> returnScrappedData() {
		String s = "";
		s = data.getData();
		return new ResponseEntity<String>(s ,HttpStatus.OK );
	}
	
	
	@GetMapping("/hello")
	public ResponseEntity<String> sayHello(){
		return new ResponseEntity<>("Hello" , HttpStatus.OK);
	}
	
}
