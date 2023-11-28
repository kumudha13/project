package c2tc_project.certificatemodule;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;


@Service
@Transactional
public class certificateservice {
	
	@Autowired
	private certificateRepository repository;
	//method findall()is called from JPA repository 
	
	public List<certificate> listAll(){
		return repository.findAll();
		
	}
	//method findbtid()is called from JPA repository 
		public certificate get(long id) {
			
			return repository.findById(id).get();
		}

		//method save()is called from JPA repository 
		public void save(certificate certi) {
			repository.save(certi);
		}
		//method deletebyid()is called from JPA repository 
		public void delete(long id) {
			repository.deleteById(id);
		}
		
		//method to delete all 
		public void del()
		{
			repository.deleteAll();
		}
	

}
