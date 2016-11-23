package boots.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import boots.model.Enterprice;
import boots.service.EnterpriceService;

@Controller
public class EnterpriceController {
	
	@Autowired
	private EnterpriceService enterpriceService;
	
	@GetMapping("/all-enterprices")
	public String allEnterpices(HttpServletRequest request){
	request.setAttribute("enterprices", enterpriceService.findAll());
	request.setAttribute("mode", "MODE_ENTERPRICES");
	return "enterprice";
	}
	
	@GetMapping("/new-enterprice")
	public String newEnterprice(HttpServletRequest request){
		request.setAttribute("mode", "MODE_NEW");
		return "enterprice";
	}
	
	@PostMapping("/save-enterprice")
	public String saveEnterprice(@ModelAttribute Enterprice enterprice , BindingResult bindingResult, HttpServletRequest request){
		enterpriceService.save(enterprice);
		request.setAttribute("enterprices", enterpriceService.findAll());
		request.setAttribute("mode", "MODE_ENTERPRICES");
		return "enterprice";
	}
	
	@GetMapping("/update-enterprice")
	public String updateEnterprice(@RequestParam int id, HttpServletRequest request){
		request.setAttribute("enterprice", enterpriceService.findOne(id));
		request.setAttribute("mode", "MODE_UPDATE");
		return "enterprice";
	}
	
	@GetMapping("/delete-enterprice")
	public String deleteEnterprice(@RequestParam int id, HttpServletRequest request){
		enterpriceService.delete(id);
		request.setAttribute("enterprices", enterpriceService.findAll());
		request.setAttribute("mode", "MODE_ENTERPRICES");
		return "enterprice";
	}


}
