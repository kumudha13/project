package c2tc_project.certificatemodule;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface certificateRepository extends JpaRepository<certificate,Integer>  {

	Optional<certificate> findById(long id);

	void deleteById(long id);

}
