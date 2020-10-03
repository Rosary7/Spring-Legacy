package learn.springmvc.springmvc_bsaics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
// https://langmainternational.com/

@Controller  
public class LocaleTestController {  
	
	@RequestMapping("/localeIndexPageUrl")  
    public String displayhome(Model m)  
    {  
        return "localeIndexPage";  
    }  
}  