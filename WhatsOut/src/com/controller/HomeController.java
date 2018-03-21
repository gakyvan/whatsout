package com.controller;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Address;
import com.model.WhatsOutUser;
import com.sun.org.apache.xml.internal.security.utils.Base64;

@WebServlet("/Home")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public HomeController() {
        super();
    }

//	
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//    	request.getServletContext().getRequestDispatcher("/views/home/home.jsp").forward(request,response);
//	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName = request.getParameter("firstname");
		String middleName = request.getParameter("middlename");
		String lastName = request.getParameter("lastname");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String userName =  request.getParameter("username");
		String password = Base64.encode(request.getParameter("password").getBytes()).toString();
		WhatsOutUser currentUser = new WhatsOutUser(1,userName, password, firstName, lastName, middleName,
				email,phone,"", LocalDate.now(),new Address(1,city, state));
		System.out.println(currentUser);
		request.getServletContext().getRequestDispatcher("/views/home/home.jsp").forward(request,response);
	}

}
