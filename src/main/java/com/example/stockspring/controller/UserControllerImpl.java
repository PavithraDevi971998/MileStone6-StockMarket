package com.example.stockspring.controller;

import java.sql.SQLException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.ModelAndView;
import com.example.stockspring.model.Company;
import com.example.stockspring.model.User;
import com.example.stockspring.service.UserService;

@Controller
public class UserControllerImpl {
	@Autowired
	private UserService userService;
	
	@RequestMapping( value = "/addUser", method = RequestMethod.GET)
	public String getEmployeeForm(ModelMap model) {
		System.out.println("add User");
		User u=new User();
		model.addAttribute("u1", u);
		return "register";
	}
	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public String formHandler(@ModelAttribute("u1") @Valid User user, 
			BindingResult result, Model model) throws SQLException {
		System.out.println(user);
		if(result.hasErrors()){
			
			return "register";
		}
		userService.insertUser(user);
		return "redirect:/login";
		}
	@RequestMapping(path="/loginUser")
	public String loginUser(Model model) throws Exception {
	       User user=new User();
	       System.out.println("hii");
	       model.addAttribute("l1", user);
	       return "login";
	}
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String submit(@ModelAttribute("user")  @Valid User user, BindingResult result,Model model) {
	     return "login";
	       
	}
	@RequestMapping(path="/userlanding")
	public String userLanding(Model model) throws Exception {
	       
	       return "UserLandingPage";
	}
	@RequestMapping(path="/welcome")
	public String welcome(Model model) throws Exception {
	       
	       return "welcome";
	}
	@RequestMapping(path = "/login", method = RequestMethod.POST)
    public ModelAndView login1(@Valid @ModelAttribute("user") User user) throws Exception {

           ModelAndView mav = null;

           String name = user.getUserName();
           List<User> user1 = userService.findByuserName(name);
System.out.println(user1);
           User user2 = user1.get(0);

           if ((user.getUserName().equals(user2.getUserName())) && (user.getPassword().equals(user2.getPassword()))) {

                  if (user.getUserName().equals("admin")) {
                        mav = new ModelAndView("AdminLandingPage");
                  } else {
                        mav = new ModelAndView("UserLandingPagejsp");
        }
           } else {

                  mav = new ModelAndView("login", "message", "Invalid Username or Password");
           }

           return mav;

    }
}
