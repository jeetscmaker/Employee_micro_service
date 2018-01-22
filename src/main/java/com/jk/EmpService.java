package com.jk;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {
	@Autowired
	EmpDao empDao;
	
	public List<Employee> getFullList(){
		List<Employee> list = new ArrayList<>();
		for(Employee e:empDao.getFullList().values()){
			list.add(e);
		}
		return list;
	}

	public String getEmployeeName(int id) {
		String name = empDao.getEmpName(id);
		return name;
	}
}
