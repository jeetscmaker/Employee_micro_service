package com.jk;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/employee")
public class EmpController {
	@Autowired
	EmpService empService;
	
	@ResponseBody
	@Produces("application/json")
	@GetMapping(value="/getFullList")
	public List<Employee> getFullList(HttpServletRequest request){
		System.out.println("Inside Employee Controller.........");
		//http localhost 8772 /employee/getFullList null
		System.out.println(request.getScheme()+" "+request.getServerName()
		+" "+request.getServerPort()+" "+request.getRequestURI()
		+" "+request.getQueryString());
		System.out.println("\n*****************");
		//http://localhost:8772/employee/getFullList
		System.out.println(request.getRequestURL());
		return empService.getFullList();
	}
	
	@PostMapping(value="/getEmployeeName")
	public String getEmployeeName(@RequestParam("employeeId") int id){
		String name = empService.getEmployeeName(id);
		return name;
	}
}
