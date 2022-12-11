package com.nri;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nri.dao.EmployeeDao;
import com.nri.entities.Employee;
import com.nri.jdbc.jdbcConfig;

public class App {
	public static void main(String[] args) {
		ApplicationContext iocobj = new AnnotationConfigApplicationContext(jdbcConfig.class);

		EmployeeDao empDao = iocobj.getBean("employeeDao", EmployeeDao.class);

		// INSERT
		/*
		 * Employee empone = new Employee(); empone.setEmpid(23);
		 * empone.setEmpname("Mini"); empone.setEmpcity("Chennai");
		 * 
		 * 
		 * int result = empDao.rcrInsert(empone);
		 * System.out.println(result+" employee record got added");
		 */

		// Update
		
		/*
		 * Employee empone = new Employee(); empone.setEmpid(23);
		 * empone.setEmpname("Mini Mathur"); empone.setEmpcity("Mumbai");
		 * 
		 * 
		 * int result = empDao.rcrInsert(empone);
		 * System.out.println(result+" employee record got Updated");
		 */
		
		//DELETE
		
		/*
		 * int result = empDao.rcrDelete(23);
		 * System.out.println(result+" record got deleted");
		 */
		
		//SELECT WITH FILTER
		/*
		 * Employee eobj = empDao.getEmployee(23); System.out.println(eobj);
		 */
		
		//SELECT ALL THE RECORDS
		List<Employee> list = empDao.getAllEmployee();
		for(Employee e:list) {
			System.out.println(e);
		}
		
	}
}
