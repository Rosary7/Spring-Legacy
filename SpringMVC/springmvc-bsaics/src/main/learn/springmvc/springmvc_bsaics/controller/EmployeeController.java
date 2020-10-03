package learn.springmvc.springmvc_bsaics.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import learn.springmvc.springmvc_bsaics.model.Employee;

@Controller  
public class EmployeeController {  
	
	// @RequestMapping - Specifying URL mapping.
	@RequestMapping("/validationFirstPageUrl")  
    public String displayhome(Model m)  
    {  
        return "validationFirstPage";  
    }  
	
    @RequestMapping("/validationSecondPageUrl")  
    public String displayLogin(Model m)  
    {  
        m.addAttribute("emp", new Employee());  
        return "validationSecondPage";  
    }  
    
    /**
     * The @Valid annotation applies validation rules on the provided object.
     * The BindingResult interface contains the result of validation.
     */
    @RequestMapping("/validationThirdPageUrl")  
    public String submitForm( @Valid @ModelAttribute("emp") Employee e, BindingResult br)  
    {  
        if(br.hasErrors())  
        {  
            return "validationSecondPage";  
        }  
        else  
        {  
        return "validationThirdPage";  
        }  
    }  
}  
