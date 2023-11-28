package admin;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class Adminservices {

	
	

	@Autowired
	private AdminRepository repository;
	//method findall()is called from JPA repository 
	
	public List<Admin> listAll(){
		return repository.findAll();
		
	}
	
	//method findbtid()is called from JPA repository 
		public Admin get(long id) {
			
			return repository.findById(id).get();
		}
		
		//method save()is called from JPA repository 
		
		public void save(Admin ad) {
			// TODO Auto-generated method stub
			repository.save(ad);
		}
		//method deletebyid()is called from JPA repository 
		public void delete(long id) {
			repository.deleteById(id);
		}
}
