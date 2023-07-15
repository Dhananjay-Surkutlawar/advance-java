package controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController 
{
	@RequestMapping(value="/hello",method=RequestMethod.GET)
    public String sayHello()
    {
    	return "hello";
    }
	
   
    
    @RequestMapping(value="/info",method=RequestMethod.GET)
	public String  info(HttpServletRequest req,ModelMap mod)
	{
		mod.addAttribute("name",req.getParameter("name"));
		mod.addAttribute("color",req.getParameter("color"));
		
		return "info";
		
	}
	
} 
