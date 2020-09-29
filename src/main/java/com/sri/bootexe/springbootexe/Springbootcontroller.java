package com.sri.bootexe.springbootexe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sri.bootexe.springbootexe.Service.Springbootservice;

@Controller
public class Springbootcontroller {
	@Autowired
	private Springbootservice springbootservice;
	
	@RequestMapping("signin")
	public String tosave(SpringbootDto dtocontroller,ModelMap map) {
		try {
			System.out.println("invoked awardee save method in  controller");
			System.out.println(dtocontroller);
			
			
			
			ModelMap success=map.addAttribute("from", "message is from "+dtocontroller.getFromname());
			
			ModelMap failure =map.addAttribute("messageis", "message is  "+dtocontroller.getFullmessage());
			System.out.println("from"+success);
			System.out.println("message is "+failure);
			System.out.println("saving started");
			boolean valid=this.springbootservice.save(dtocontroller);
			System.out.println("saved success");
		
		
		
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		return "message.jsp";

}}
