package learn.springmvc.springmvc_bsaics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("empFullName")
public class SessionAttributeController {
 
	@RequestMapping(value = "/firstPageUrl")
	public ModelAndView showFirstPage() {
		return new ModelAndView("firstPage");
	}
 
	@RequestMapping(value = "/secondPageUrl", method = RequestMethod.POST)
	public ModelAndView showWelcome(@RequestParam String fullName) {
 
		ModelAndView mv = new ModelAndView("secondPage");
		mv.addObject("empFullName", fullName);
 
		return mv;
 
	}
}
