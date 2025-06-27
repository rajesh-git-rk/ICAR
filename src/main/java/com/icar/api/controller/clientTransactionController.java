package com.icar.api.controller;




import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.icar.api.dao.Clientdao;
import com.icar.api.model.ClientTransaction;
import com.icar.api.repository.UserRepo;





@RestController
@RequestMapping("/api")
public class clientTransactionController {

	@Autowired
	Clientdao clientdao;

	@Autowired
	UserRepo userRepo;
	
	@RequestMapping(value="/home")
    public String home(){
    	System.out.println("Welcome Spring===Rajesh==");
        return "hello World!!";
    }
	
	
	 @GetMapping("/user")
	 public List<ClientTransaction> getAllser()
	 { 
		 return	 clientdao.getAlldetails();
		 
	 }
	 
	 
	/* to Register or Save User	*/
	
	@PostMapping("/RegisterUser")
	public String getRegisterUser(@RequestParam (value="firstname",required =false,defaultValue ="") String firstname,
			@RequestParam (value="lastname",required =false,defaultValue ="") String lastname,
			@RequestParam(value="password",required =false,defaultValue ="") String password,
			@RequestParam (value="Email",required =false,defaultValue ="")String Email,
			@RequestParam (value="MobileNumber",required =false,defaultValue ="")String MobileNumber,			
			@RequestParam (value="state",required =false,defaultValue ="")String state,			
			@RequestParam(value="district",required =false,defaultValue ="") String district,
			@RequestParam(value="block",required =false,defaultValue ="") String block,
			@RequestParam(value="Youra",required =false,defaultValue ="") String Youra)
			
	{
//		    	firstname,lastname,,password,Email,MobileNumber,state,district,block,Youra    
	 			
		HashMap<String,String>map=new HashMap<>();
	  
	 	String Success,Message;
	  
		
		ClientTransaction usr=new ClientTransaction();
		usr.setFirstname(firstname);
		usr.setLastname(lastname);
		usr.setPassword(password); 
		usr.setEmail(Email); 
		usr.setMobile(MobileNumber);
		usr.setState(state);
		usr.setDistrict(district);
		usr.setBlock(block);
		usr.setDesignation(Youra);
		
		userRepo.save(usr);
	
			
			map.put("Success", "1");
	   		map.put("Message","Registered successfully!");
		
	
		return map.toString();
		
	} 
	

	
	  @PostMapping("/Login")
	  public String getUserdetailsById(@RequestParam (value="username",required =false)String username
			  ,@RequestParam (value="password",required =false) String 	  password) {
		  
		  HashMap<String,String>map=new HashMap<>();
		  
		  String Success,Message;
		  
		  
	   List<ClientTransaction> client=clientdao.getUserDetails(username,password);
	   
	   

	   if(client.size()>0) { 	   
//		   if(username.equals(client.get(0).getEmail()) && password.equals(client.get(0).getPassword())) 
//		   {
//		   		System.out.println("if---");
			   	map.put("Success", "1"); 
	   			map.put("Message", "Succesfull Login!");  
//	   		}		
//		   else if(!username.equals(client.get(0).getEmail()) ||  !password.equals(client.get(0).getPassword()))
//		   {
//			   System.out.println("else if");
//		   		map.put("Success", "0");
//		   		map.put("Message","Login failed!");
//			 
//		   }
	   }
	   else {
	   		map.put("Success", "0");
	   		map.put("Message","Login failed!");
		   
	   }
	   
	   return map.toString(); 	 
	  }	
}
