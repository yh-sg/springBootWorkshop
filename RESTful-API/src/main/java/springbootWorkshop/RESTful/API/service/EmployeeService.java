package springbootWorkshop.RESTful.API.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import springbootWorkshop.RESTful.API.model.Employee;

@Service
public class EmployeeService {
	static Map<Long, Employee> employees = Collections.synchronizedMap(new HashMap<Long, Employee>());
	
	public List<Employee> getEmployeeList(){
		List<Employee> r = new ArrayList<Employee>(employees.values());
		return r;
	}
	
	public Employee getEmployee(Long id) {
		if(!employees.containsKey(id))
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Employee not found: id=" + id);
		return employees.get(id);
	}
	
	public Employee postEmployee(Employee employee) {
		employees.put(employee.getId(), employee);
		return employee;
	}
	
	
}
