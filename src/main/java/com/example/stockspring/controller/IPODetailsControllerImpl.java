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

import com.example.stockspring.model.IPODetails;
import com.example.stockspring.model.StockExchange;
import com.example.stockspring.service.IPODetailsService;
@Controller
public class IPODetailsControllerImpl {
@Autowired
private IPODetailsService ipoDetailsService;
	@RequestMapping( value = "/addIpodetails", method = RequestMethod.GET)
	public String getEmployeeForm(ModelMap model) {
		System.out.println("add employee");
		IPODetails e=new IPODetails();
		model.addAttribute("ipo1", e);
		return "IPODetails";
	}
	@RequestMapping(value = "/addIpodetails", method = RequestMethod.POST)
	public String formHandler(@ModelAttribute("ipo1") @Valid IPODetails ipoDetails, 
			BindingResult result, Model model) throws SQLException {
		System.out.println(ipoDetails);
if(result.hasErrors()){
			
			return "addIpodetails";
		}
ipoDetailsService.insertIpoDetails(ipoDetails);
return "redirect:/ipoDetailsList";
		}
		
	@RequestMapping(path="/ipoDetailsList")
	public ModelAndView getCompanyList() throws Exception {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("ipoDetailsList");
		mv.addObject("ipoDetailsList",ipoDetailsService.getIPODetailsList());
		return mv;
	}
	@RequestMapping("/update2")
    public ModelAndView ipodetailsUpdation(@RequestParam("id") int id, ModelMap map, HttpServletRequest request,
                  @ModelAttribute("ipo2") IPODetails ipoDetails) throws ClassNotFoundException, SQLException {
           ModelAndView mav = null;
           ipoDetails= ipoDetailsService.getId(id) ; 
                    map.addAttribute("ipoDetailsList",ipoDetails);
                    
                    System.out.println(ipoDetails);
                    mav = new ModelAndView("updateipo");
                    return mav;

           
    }
	@RequestMapping(value="/delete2")
    public ModelAndView ipodelete(@RequestParam("id") int id) throws ClassNotFoundException, SQLException {
           ModelAndView mav = null;
           
           ipoDetailsService.getdeleteipoCode(id);
                    
                    mav = new ModelAndView("redirect:/ipoDetailsList");
                    return mav;

           
    }
       @RequestMapping(value = "/updateipo", method = RequestMethod.POST)
       public String updateipodetails(@ModelAttribute("ipo2")@Valid  IPODetails ipoDetails,BindingResult result,Model model) throws SQLException {
              if(result.hasErrors()){
                     System.out.println("errors");
                     System.out.println(result.getAllErrors());
                     model.addAttribute("e1",ipoDetails );
                     return "updateipo";
              }
              ipoDetailsService.updateipodetail(ipoDetails);
              return "redirect:/ipoDetailsList";  
       }
}
