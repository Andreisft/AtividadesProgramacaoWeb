package br.ucsal.bes.atividades.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.bes.atividades.model.User;
import br.ucsal.bes.atividades.persistence.UserDAO;

@WebServlet("/ServletExercicio9")
public class ServletExercicio9 extends HttpServlet {

	private static final long serialVersionUID = -5896425314536616969L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		UserDAO userDAO = new UserDAO();
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String pwd = userDAO.md5(password);
		Boolean found = false;
		
		for (User userForEach : userDAO.getAll()) {
			if (name.equalsIgnoreCase(userForEach.getName()) && 
					pwd.equals(userForEach.getPassword())) {
				found = true;
			}
		}
		
		if (found == true) {			
			request.getRequestDispatcher("Menu.jsp").forward(request, response);
		} else {			
			response.sendRedirect("LoginInvalido.jsp");
		}
		
	}

}
