package br.ucsal.bes.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.bes.business.UserBO;
import br.ucsal.bes.model.User;

@WebServlet("/InsertServlet")
public class InsertServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    private UserBO userBO = new UserBO();
	
    public InsertServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		registerUser(request);
	}

	private void registerUser(HttpServletRequest request) {
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String name = request.getParameter("name");
		
		User user = new User(login, password, email, name);
		
		try {
			userBO.insertUser(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
