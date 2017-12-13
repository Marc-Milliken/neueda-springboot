package uk.ac.belfastmet.titanic.repository;

import org.springframework.data.repository.CrudRepository;
import uk.ac.belfastmet.titanic.domain.Passengers;


public interface PassengerRepository extends CrudRepository<Passengers, Integer> {
	
	Iterable<Passengers> findByOrderByPassengerId();
	
	Iterable<Passengers> findBypClass(int i);
	
	Iterable<Passengers> findBySurvived(int i);
}	
