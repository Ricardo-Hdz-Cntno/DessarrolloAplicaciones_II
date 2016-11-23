package boots.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import boots.dao.EnterpriceRepository;
import boots.model.Enterprice;

@Service @Transactional
public class EnterpriceService {
	private final EnterpriceRepository enterpriceRepository;
	
	
	
	public EnterpriceService(EnterpriceRepository enterpriceRepository) {
		super();
		this.enterpriceRepository = enterpriceRepository;
	}

	public List<Enterprice> findAll(){	
		List<Enterprice> enterprices = new ArrayList<Enterprice>();
		for(Enterprice enterprice : enterpriceRepository.findAll()){
			enterprices.add(enterprice);
		}
		return enterprices;
	}
	
	public void save(Enterprice enterprice){
		enterpriceRepository.save(enterprice);
	}
	
	public void delete(int id){
		enterpriceRepository.delete(id);
	}
	
	public Enterprice findOne (int id){
		return enterpriceRepository.findOne(id);
	}
}
