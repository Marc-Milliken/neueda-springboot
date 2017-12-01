package uk.ac.belfastmet.titanic.repository;

import org.springframework.data.repository.CrudRepository;
import uk.ac.belfastmet.titanic.domain.Passengers;


public interface TitanicRepository extends CrudRepository<Passengers, Integer> {
	
	Iterable<Passengers> findByName(String string);

}	
