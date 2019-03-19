package com.app.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.app.dao.IEmployeeDao;
import com.app.jdbc.ConnJdbc;
import com.app.model.Employee;

public class EmployeeDaoImpl implements IEmployeeDao{

	@Override
	public Integer saveEmp(Employee emp) {
		
			String url="insert into student values(?,?,?)";
			Connection con=null;
			PreparedStatement ps=null;
			int count=0;
			try
			{
				//create connection
				con=ConnJdbc.getconn();
				//prepare statement
				ps=con.prepareStatement(url);
				ps.setInt(1, emp.getEid());
				ps.setString(2, emp.geteName());
				ps.setString(3, emp.geteSal());
				count=ps.executeUpdate();
			}
			catch (Exception ex) {
				// TODO: handle exception
				ex.getStackTrace();
			}
				finally {
					con=null;
				}
				
			return (Integer)count;
		}
		

	}

