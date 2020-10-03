package learn.springmvc.springmvc_bsaics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  
public class TestJstlController {  
	
	@RequestMapping("/testJstlPageUrl")  
    public String displayhome(Model m)  
    {  
        return "testJstlPage";  
    }  
	
  
}  