package com.nri.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.nri.entities.Employee;

public class RowMapperImpl implements RowMapper<Employee>{

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Employee eobj = new Employee();
		eobj.setEmpid(rs.getInt(1));
		eobj.setEmpname(rs.getString(2));
		eobj.setEmpcity(rs.getString(3));
		
		return eobj;
	}


}
