package admin;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends  JpaRepository<Admin,Integer>  {

	Optional<Admin> findById(long id);

	void deleteById(long id);

	
	
	
}
