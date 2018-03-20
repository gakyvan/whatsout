package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.xml.internal.messaging.saaj.util.Base64;


/**
 *
 * @author Rupendra MAHARJAN
 * Date: March 19, 2018
 */

@WebServlet("/VerifyCredential")
public class VerifyCredential extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public VerifyCredential() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName= (String) request.getAttribute("user");
		System.out.println(userName);
		byte[] encodePassword = Base64.encode(request.getParameter("password").getBytes());
		System.out.println(encodePassword);
	}

}
