package boots.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import boots.model.Rent;
import boots.service.RentService;

@Controller
public class RentController {

	
	@Autowired
	private RentService rentService;
	
	@GetMapping("/all-rents")
	public String allRents(HttpServletRequest request){
		request.setAttribute("rents", rentService.findAll());
		request.setAttribute("mode", "MODE_RENTS");
		return "rent";
	}
	
	@GetMapping("/new-rent")
	public String newRent(HttpServletRequest request){
		request.setAttribute("mode", "MODE_NEW");
		return "rent";
	}
	
	@PostMapping("/save-rent")
	public String saveRent(@ModelAttribute Rent rent , BindingResult bindingResult, HttpServletRequest request){
		rentService.save(rent);
		request.setAttribute("rents", rentService.findAll());
		request.setAttribute("mode", "MODE_RENTS");
		return "rent";
	}
	
	@GetMapping("/update-rent")
	public String updateRent(@RequestParam int id, HttpServletRequest request){
		request.setAttribute("rent", rentService.findOne(id));
		request.setAttribute("mode", "MODE_UPDATE");
		return "rent";
	}
	

	@GetMapping("/delete-rent")
	public String deleteRent(@RequestParam int id, HttpServletRequest request){
		rentService.delete(id);
		request.setAttribute("rents", rentService.findAll());
		request.setAttribute("mode", "MODE_RENTS");
		return "rent";
	}
	
}
