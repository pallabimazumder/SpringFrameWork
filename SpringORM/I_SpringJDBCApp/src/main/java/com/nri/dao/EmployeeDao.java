package com.nri.dao;

import java.util.List;

import com.nri.entities.Employee;

public interface EmployeeDao {

	public int rcrInsert(Employee empobj);
	public int rcrUpdate(Employee empobj);
	public int rcrDelete(int empid);
	public Employee getEmployee(int empid);
	public List<Employee> getAllEmployee();
}
