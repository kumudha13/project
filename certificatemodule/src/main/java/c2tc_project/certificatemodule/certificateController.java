package c2tc_project.certificatemodule;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class certificateController {

	@Autowired
	private certificateservice service;
	
	//retrive
	//user defined method which calls listAll() from service class*
		@GetMapping("/certificates")
		public List<certificate> list(){
			
			return service.listAll();
		}
		//retrive by id 
		//user defined method which calls getid() from service class*
		@GetMapping("/certificates/{id}")
		public ResponseEntity <certificate> get(@PathVariable long id)
		{
			try
			{
				certificate certi = service.get(id);
				return new ResponseEntity<certificate>(certi,HttpStatus.OK);
				
			} 
			
			catch (Exception e)
			{
				return new ResponseEntity<certificate>(HttpStatus.NOT_FOUND);
				
			}
			
		}	
		//create
		//user defined method which calls save()from service class*
		@PostMapping("/certificates")
		public void add(@RequestBody certificate certi) {
			service.save(certi);
			
		}

		//update
		//user defined method which calls getid(),save()from service class *
		@PutMapping("/certificates/{id}")
		public ResponseEntity<?> update(@RequestBody certificate certi,@PathVariable long id){
			try {
				certificate existcerti = service.get(id);
				service.save(certi);
				return new ResponseEntity <>(HttpStatus.OK);
			} 
			catch (Exception e) {
				return new ResponseEntity <>(HttpStatus.NOT_FOUND);
			}
		}
		//delete
		@DeleteMapping("/certificates/{id}")
		public void delete(@PathVariable long id) {
			
			service.delete(id);
		}
		//delete all 
		@DeleteMapping("/certificates")
		public void del() {
			service.del();
		}
		
	
	
}
