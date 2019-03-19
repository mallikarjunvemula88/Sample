package com.app.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.util.concurrent.Executor;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.app.dao.IEmployeeDao;
import com.app.dao.fac.FacDao;
import com.app.model.Employee;
import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

public class EmployeeServlet extends GenericServlet{
	@Override
	public void service(ServletRequest req, ServletResponse res) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
			String str=req.getParameter("eid");
			int id=Integer.parseInt(str);
			String name=req.getParameter("eName") ;
			String sal=req.getParameter("eSal") ;
			//set employee data
			Employee emp=new Employee();
			emp.setEid(id);
			emp.seteName(name);
			emp.seteSal(sal);
			//create dao factory method;
			IEmployeeDao dao=FacDao.getDao();
			//call insert method
			int count=dao.saveEmp(emp);
			
			PrintWriter out=res.getWriter();
			if(count==1)
			{
			out.println("save successfully\t"+id);
	}
			else
			{
				out.println("fail the data");
			}
		
		  RequestDispatcher rd=req.getRequestDispatcher("Employee.html");
		  rd.forward(req, res);
		 
		}

}