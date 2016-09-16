package com.manolo.spring.web.controllers;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.manolo.spring.web.dao.Offer;
import com.manolo.spring.web.service.OffersService;

@Controller
public class OffersController {
	
	private OffersService offersService;
	
	
@Autowired
public void setOfferService(OffersService offerService) {
		this.offersService = offerService;
	}


@RequestMapping(value ="/test" ,method=RequestMethod.GET)	
public String showTest(Model model, @RequestParam("id")String id) {
	
System.out.println("id is " + id);
	
	return "test";
}

/*
@ExceptionHandler(DataAccessException.)
public String handleDatabbaseException(DataAccessException ex){
	
	return "error";
}
*/

@RequestMapping("/offers")	
public String showOffers(Model model) {
	
	
	List <Offer> offers = offersService.getCurrent();
	model.addAttribute("offers", offers);
	
	return "offers";
}

@RequestMapping("/createoffer")	
public String createOffer(Model model) {
	
	model.addAttribute("offer",new Offer() );

	return "createoffer";
}

@RequestMapping(value ="/docreate", method=RequestMethod.POST)	
public String doCreate(Model model, @Valid Offer offer, BindingResult result) {
	
if(result.hasErrors()) {
return "createoffer";	

}
offersService.create(offer);
return "offercreated";
}


/*
 * @RequestMapping("/")	
public ModelAndView showHome() {
	
	ModelAndView mv = new ModelAndView("home");
	
	Map <String, Object> model = mv.getModel();
	model.put("name", "Manolo");
	
	
	return mv;
}
 * 
 */

}
