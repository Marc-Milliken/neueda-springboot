package uk.ac.belfastmet.titanic.service;

import uk.ac.belfastmet.titanic.domain.Passenger;

public interface PassengerRestService {

	Iterable<Passenger> list();
	
	Passenger create(Passenger passenger);
	
	Passenger read(Integer passengerId);
	
	Passenger update(Integer passengerId, Passenger passenger);
	
	void delete(Integer passengerId);
	
}
