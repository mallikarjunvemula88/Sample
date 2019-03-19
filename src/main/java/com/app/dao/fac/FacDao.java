package com.app.dao.fac;

import com.app.dao.IEmployeeDao;
import com.app.dao.impl.EmployeeDaoImpl;

public class FacDao 
{
	public static IEmployeeDao getDao()
	{
		EmployeeDaoImpl impl=new EmployeeDaoImpl();
		return impl;
	}
}

