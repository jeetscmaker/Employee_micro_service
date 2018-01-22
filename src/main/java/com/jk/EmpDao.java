package com.jk;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class EmpDao {
	private Map<Integer, Employee> empMap = new HashMap<>();
	{
		Employee e1 = new Employee(1, "Employee Ramesh", "ramesh@gmail.com", "9876543210");
		Employee e2 = new Employee(2, "Employee Suresh", "suresh@gmail.com", "9999999999");
		Employee e3 = new Employee(3, "Employee Somesh", "somesh@gmail.com", "8888888888");
		Employee e4 = new Employee(4, "Employee Ganesh", "ganesh@gmail.com", "7777777777");
		empMap.put(e1.getId(), e1);
		empMap.put(e2.getId(), e2);
		empMap.put(e3.getId(), e3);
		empMap.put(e4.getId(), e4);
	}
	
	public Map<Integer, Employee> getFullList(){
		return empMap;
	}

	public String getEmpName(int id) {
		Employee emp = empMap.get(id);
		if(emp == null){
			return null;
		}else{
			return emp.getName();
		}
	}
}
