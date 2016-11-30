package com.virtusa.spring.mvc;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.support.WebRequestDataBinder;

import com.virtusa.spring.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;

	public UserController() {
		System.out.println("User Controller!!!!!!!!!");
	}
	
//	@RequestMapping("/greet")
//	@ResponseBody
//	public String greet(){
//		return "Welcome";
//	}
	@RequestMapping("/")
	public String home(){
		return "userhome";
	}
	@RequestMapping(value = "/registeruser",method=RequestMethod.GET)
	public String registerUser(Model model,@Valid@ModelAttribute UserBean userBean,BindingResult bindingResult){
		System.out.println(userBean);
	
		if(bindingResult.hasErrors()){
//			List<String> gender = new ArrayList<String>();
//			List<String> desg = new ArrayList<String>();
//			List<String> city = new ArrayList<String>();
//			List<String> tech = new ArrayList<String>();
//			List<String> area =  new ArrayList<String>();
//			model.addAttribute("Date", new Date());
//			gender.add("Male");
//			gender.add("Female");
//			
//			desg.add("Engineer");
//			desg.add("Manager");
//			desg.add("Consultant");
//			desg.add("Director");
//			
//			city.add("Hyderabad");
//			city.add("Bangalore");
//			city.add("Delhi");
//			city.add("Mumbai");
//			
//			tech.add("C");
//			tech.add("CPP");
//			tech.add("Java");
//			tech.add("Oracle");
//			
//			area.add("Nanakramguda");
//			area.add("Gachibowli");
//			area.add("Hitech");
//			area.add("Other");
//			
//			model.addAttribute("gender", gender);
//			model.addAttribute("desg", desg);
//			model.addAttribute("city",city);
//			model.addAttribute("tech",tech);
//			model.addAttribute("area",area);
			return "register";
		}
		else{
			userService.registerUser(userBean);
			return "userhome";
		}
	}
	@RequestMapping("/register")
	public String register(@ModelAttribute UserBean userBean,Model model){
//		ArrayList<String> city = new ArrayList<>();
//		city.add("HYD");
//		model.addAttribute("city", city);
//		List<String> gender = new ArrayList<String>();
//		List<String> desg = new ArrayList<String>();
//		List<String> city = new ArrayList<String>();
//		List<String> tech = new ArrayList<String>();
//		List<String> area =  new ArrayList<String>();
//		model.addAttribute("Date", new Date());
//		gender.add("Male");
//		gender.add("Female");
//		
//		desg.add("Engineer");
//		desg.add("Manager");
//		desg.add("Consultant");
//		desg.add("Director");
//		
//		city.add("Hyderabad");
//		city.add("Bangalore");
//		city.add("Delhi");
//		city.add("Mumbai");
//		
//		tech.add("C");
//		tech.add("CPP");
//		tech.add("Java");
//		tech.add("Oracle");
//		
//		area.add("Nanakramguda");
//		area.add("Gachibowli");
//		area.add("Hitech");
//		area.add("Other");
//		
//		model.addAttribute("gender", gender);
//		model.addAttribute("desg", desg);
//		model.addAttribute("city",city);
//		model.addAttribute("tech",tech);
//		model.addAttribute("area",area);
		return "register";
	}
//	@RequestMapping("/login")
//	public String validateUser(HttpServletRequest request){
//		String pageName = "userhome";
//		String userName = request.getParameter("userName");
//		String password = request.getParameter("password");
//		if(userName.equals("virtusa") && password.equals("polaris")){
//			pageName = "success";
//		}
//		return pageName;
//	}
//	@RequestMapping(value = "/login", method=RequestMethod.GET)
//	public String validateUser(@RequestParam("userName")String userName,@RequestParam("password")String password){
//		String pageName = "userhome";
//		if(userName.equals("virtusa") && password.equals("polaris")){
//			pageName = "success";
//		}
//		return pageName;
//	}
	@RequestMapping(value = "/login", method=RequestMethod.POST)
	public String validateUser1(@RequestParam("userName")String userName,@RequestParam("password")String password){
		String pageName = "userhome";
		if(userName.equals("virtusa") && password.equals("polaris")){
			pageName = "success";
		}
		return pageName;
	}
//	@RequestMapping(value = "/login", method=RequestMethod.GET,params={"age"})//execute if age field is there
//	public String validateUser2(@RequestParam("userName")String userName,@RequestParam("password")String password){
//		String pageName = "userhome";
//		if(userName.equals("virtusa") && password.equals("polaris")){
//			pageName = "success";
//		}
//		return pageName;
//	}
//	@RequestMapping(value = "/login", method=RequestMethod.GET)//execute if age field is there
//	public String validateUser2(@ModelAttribute UserBean userBean){
//		String pageName = "userhome";
//		System.out.println(userBean);
//		return pageName;
//	}
	
	@RequestMapping(value = "/login", method=RequestMethod.GET)
	public String validateUser(@RequestParam("userName")String userName,@RequestParam("password")String password){
		String pageName = "userhome";
		if(userName.equals("virtusa") && password.equals("polaris")){
			pageName = "success";
		}
		return pageName;
	}
	@RequestMapping("/greet")
	//@ResponseBody
	public String greet(Model model){//Model,ModelMap
		model.addAttribute("date", new Date());
		ArrayList<String> list = new ArrayList<>();
		list.add("C");
		list.add("Java");
		list.add("Oracle");
		model.addAttribute("pl", list);
		
		return "welcome";
	}


//	@InitBinder
//	public void initBinder(WebDataBinder dataBinder){
//		System.out.println("InitBinder!!!!!!!!!!!");
//		dataBinder.addValidators(new UserFormValidation());
//	}
}
