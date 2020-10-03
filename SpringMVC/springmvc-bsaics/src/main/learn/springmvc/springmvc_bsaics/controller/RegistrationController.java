package learn.springmvc.springmvc_bsaics.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import learn.springmvc.springmvc_bsaics.exceptions.CustomException;
import learn.springmvc.springmvc_bsaics.model.Registraion;

@Controller
public class RegistrationController 
{
	@ModelAttribute("professionList")
	public List populateProfessionList()
	{
		List professionList = new ArrayList(); 
		professionList.add("Devloper");
		professionList.add("Manager");
		professionList.add("Architecht");
		
		return professionList;
	}
	
	@ModelAttribute("hobbyList")
	public List populateHobbyList()
	{
		List hobbyList = new ArrayList(); 
		hobbyList.add("Cricket");
		hobbyList.add("Football");
		hobbyList.add("Hockey");
		hobbyList.add("Basketball");
		
		return hobbyList;
	}
	
	@RequestMapping("/exceptionFirstPageUrl")  
    public String displayhome(Model m)  
    {  
        return "exceptionFirstPage";  
    } 
	
	@RequestMapping("/exceptionSecondPageUrl")
	public String displayForm(Map model)
	{
		Registraion rb = new Registraion();
		model.put("rb",rb);
		return "exceptionSecondPageResgistraion";
	}
	
	/*
	 This will throw two exceptions
		1. When the firstName is less than 3 ,it will throw IOException
		2. When the lastName is less than 3 it, will throw CustomException
		Both the exceptions will be handled globally by our GlobalException class.
	 */
	@RequestMapping(value="/exceptionThirdPageUrl",method=RequestMethod.POST)
	public String processRegistration(@ModelAttribute("rb") Registraion rb) throws IOException
	{
		if(rb.getFirstName().length() < 3)
		{
			throw new IOException("IOException has occured");
		}
		
		if(rb.getLastName().length() < 5)
		{
			throw new CustomException("Custom Exception has occured", "CustomException");
		}
		return "exceptionSecondPageResgistraion";
	}
}
