package com.sri.bootexe.springbootexe.Service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sri.bootexe.springbootexe.SpringbootDto;
import com.sri.bootexe.springbootexe.Entity.SpringbootEntity;
import com.sri.bootexe.springbootexe.repos.SpringbootIMPL;



@Service
public class Springbootservice {
	@Autowired
	private SpringbootIMPL springbootimpl;
	
	public boolean save(SpringbootDto dtoservice) {
		try {
			
			SpringbootEntity entitysercvice= new SpringbootEntity();
			BeanUtils.copyProperties(dtoservice, entitysercvice);
			springbootimpl.save(entitysercvice);
			return true;
		}catch (Exception e) {
			e.printStackTrace();
			
		}
		
		return false;
		
	}
	
	

}
