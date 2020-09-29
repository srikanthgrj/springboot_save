package com.sri.bootexe.springbootexe.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name="spring_boot")
@Data
public class SpringbootEntity implements Serializable{
	 	@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	 	@Column(name = "id")
	    private Long id;
	 	@Column(name = "fromname")
	    private String fromname;
	 	@Column(name = "fullmessage")
	    private String fullmessage;
		public SpringbootEntity() {
			System.out.println("created "+this.getClass().getSimpleName());
		}
		public SpringbootEntity( String fromname, String fullmessage) {
			
			this.fromname = fromname;
			this.fullmessage = fullmessage;
		}
		
		
		
		
		
	    
	    

}
