package boots.dao;

import org.springframework.data.repository.CrudRepository;

import boots.model.Rent;

public interface RentRepository extends CrudRepository<Rent, Integer> {

}
