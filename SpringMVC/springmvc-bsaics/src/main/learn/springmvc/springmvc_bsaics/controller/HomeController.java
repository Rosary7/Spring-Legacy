package learn.springmvc.springmvc_bsaics.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value="/heloworldurl")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("heloworld");
	}
	
	
	@RequestMapping(value="/testmodelmapurl") 
    public String welcome(ModelMap map) {
        System.out.println("Inside welcome() method ....!");
 
        map.addAttribute("msg1", "Hi! ");
        map.addAttribute("msg2", "Welcoem!!");
        map.addAttribute("msg3", "Welcoem!!");
 
        return "testmodelmap";
    }
	
	@RequestMapping("/testmodelandviewurl")
	public ModelAndView passParametersWithModelAndView() {
	    ModelAndView modelAndView = new ModelAndView("testmodelandview"); // set  view
	    modelAndView.addObject("message", "helo"); //set model
	    return modelAndView;
	}
	

	
}
