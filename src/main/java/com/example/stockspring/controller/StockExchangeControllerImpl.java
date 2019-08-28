package com.example.stockspring.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.stockspring.model.Company;
import com.example.stockspring.model.StockExchange;
import com.example.stockspring.service.CompanyService;
import com.example.stockspring.service.StockExchangeService;
@Controller
public class StockExchangeControllerImpl {
	@Autowired
	private StockExchangeService stockExchangeService;
	@RequestMapping( value = "/addstockExchange", method = RequestMethod.GET)
	public String getEmployeeForm(ModelMap model) {
		System.out.println("add employee");
		StockExchange e=new StockExchange();
		model.addAttribute("se1", e);
		return "stockExchange";
	}
	@RequestMapping(value = "/addstockExchange", method = RequestMethod.POST)
	public String formHandler(@ModelAttribute("se1") @Valid StockExchange stockExchange, 
			BindingResult result, Model model) throws SQLException {
		System.out.println(stockExchange);
		if(result.hasErrors()){
			
			return "stockExchange";
		}
		stockExchangeService.insert(stockExchange);
		return "redirect:/stockexchangelist";
		}
	@RequestMapping(path="/stockexchangelist")
	public ModelAndView getCompanyList() throws Exception {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("stockexchangelist");
		mv.addObject("stockexchangelist",stockExchangeService.getCompanyList());
		return mv;
	}
	@RequestMapping("/update1")
    public ModelAndView stockExchangeUpdation(@RequestParam("stockexchangeid") int stockexchangeid, ModelMap map, HttpServletRequest request,
                  @ModelAttribute("se2") StockExchange stockExchange) throws ClassNotFoundException, SQLException {
           ModelAndView mav = null;
           stockExchange= stockExchangeService.getStockexchangeid(stockexchangeid) ; 
                    map.addAttribute("stockexchangelist",stockExchange);
                    
                    System.out.println(stockExchange);
                    mav = new ModelAndView("updateStockExchange");
                    return mav;
           
    }
	@RequestMapping(value="/delete1")
    public ModelAndView stockexchangedelete(@RequestParam("stockexchangeid") int stockexchangeid) throws ClassNotFoundException, SQLException {
           ModelAndView mav = null;
           stockExchangeService.getdeleteid(stockexchangeid);
                    
                    mav = new ModelAndView("redirect:/stockexchangelist");
                    return mav;

           
    }
       @RequestMapping(value = "/updateStockExchange", method = RequestMethod.POST)
       public String updatestockExchange(@ModelAttribute("se2")@Valid  StockExchange stockExchange,BindingResult result,Model model) throws SQLException {
              if(result.hasErrors()){
                     System.out.println("errors");
                     System.out.println(result.getAllErrors());
                     model.addAttribute("e1",stockExchange );
                     return "updateStockExchange";
              }
              stockExchangeService.updatestockExchange(stockExchange);
              return "redirect:/stockexchangelist";  
       }
}
