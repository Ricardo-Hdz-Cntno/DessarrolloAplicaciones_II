package boots.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import boots.dao.RentRepository;
import boots.model.Rent;


@Service @Transactional
public class RentService {
	private final RentRepository rentRepository;

	public RentService(RentRepository rentRepository) {
		super();
		this.rentRepository = rentRepository;
	}
	
	public List<Rent> findAll(){	
		List<Rent> rents = new ArrayList<Rent>();
		for(Rent rent : rentRepository.findAll()){
			rents.add(rent);
		}
		return rents;
	}
	
	public void save(Rent rent){
		rentRepository.save(rent);
	}
	
	public void delete(int id){
		rentRepository.delete(id);
	}
	
	public Rent findOne (int id){
		return rentRepository.findOne(id);
	}
}
