package admin;

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
public class Admincontroller {
	
	
	@Autowired
	private Adminservices service;
	
	//retrive
	
		//user defined method which calls listAll() from service class*
		@GetMapping("/admin")
		public List<Admin> list(){
			
			return service.listAll();
		}
		
		//retrive by id 
		//user defined method which calls getid() from service class*
		@GetMapping("/admin/{id}")
		public ResponseEntity <Admin> get(@PathVariable long id)
		{
			try
			{
				Admin ad = service.get(id);
				return new ResponseEntity<Admin>(ad,HttpStatus.OK);
				
			} 
			
			catch (Exception e)
			{
				return new ResponseEntity<Admin>(HttpStatus.NOT_FOUND);
				
			}
			
		}
		//create
		//user defined method which calls save()from service class*
		@PostMapping("/admin")
		public void add(@RequestBody Admin ad) {
			service.save(ad);
			
		}
		
		//update
		//user defined method which calls getid(),save()from service class *
		@PutMapping("/admin/{id}")
		public ResponseEntity<?> update(@RequestBody Admin ad,@PathVariable long id){
			try {
				Admin existad = service.get(id);
				service.save(ad);
				return new ResponseEntity <>(HttpStatus.OK);
			} 
			catch (Exception e) {
				return new ResponseEntity <>(HttpStatus.NOT_FOUND);
			}
		}
		//delete
		@DeleteMapping("/admin/{id}")
		public void delete(@PathVariable long id) {
			
			service.delete(id);
		}
		
		
		
		
		
		
		
		
}