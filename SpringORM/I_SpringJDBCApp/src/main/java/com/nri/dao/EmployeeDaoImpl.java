package com.nri.dao;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.nri.entities.Employee;

@Component("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int rcrInsert(Employee empobj) {
		
		String query  = "insert into tblemployee(eid,ename,ecity) values (?,?,?)";
		int status = jdbcTemplate.update(query, empobj.getEmpid(),empobj.getEmpname(),empobj.getEmpcity());
		return status;
	}

	public int rcrUpdate(Employee empobj) {
		
		String query = "update tblemployee set ename=?, ecity=? where  eid=?";
		int status = jdbcTemplate.update(query, empobj.getEmpname(),empobj.getEmpcity(),empobj.getEmpid());
		return status;
	}

	public int rcrDelete(int empid) {
		String query = "delete from tblemployee where  eid=?";
		int status = jdbcTemplate.update(query,empid);
		return status;
	}

	public Employee getEmployee(int empid) {
		
		String query = "select * from tblemployee where eid=?";
		
		RowMapper<Employee> rowMapper = new RowMapperImpl();
		
		Employee e = jdbcTemplate.queryForObject(query,rowMapper,empid);
		
		return e;
	}

	public List<Employee> getAllEmployee() {
		
		String q = "select * from tblemployee";
		List<Employee> emprowobjcol = jdbcTemplate.query(q, new RowMapperImpl());
		return emprowobjcol;
	}

}
