package uk.ac.belfastmet.cereals.repository;

import org.springframework.data.repository.CrudRepository;

import uk.ac.belfastmet.cereals.domain.Cereal;

public interface CerealRepository extends CrudRepository<Cereal, Integer>{

	Iterable<Cereal> findByOrderByCerealId();
	
}
