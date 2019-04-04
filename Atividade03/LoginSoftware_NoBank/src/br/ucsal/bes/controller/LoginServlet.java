package br.ucsal.bes.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.bes.model.User;
import br.ucsal.bes.persistence.UserDAO;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 8854103683741659859L;
	private UserDAO userDAO = new UserDAO();

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String pwd = userDAO.md5(password);
		
		User user = userReturn(name, pwd);
		request.getSession().setAttribute("user", user);
		login(request, response, name, pwd);
	}

	private void login(HttpServletRequest request, HttpServletResponse response, String name, String pwd)
			throws IOException, ServletException {
		if (checkUser(name, pwd) == true) {
			request.getSession().setAttribute("name", name);
			response.sendRedirect("admin/home.jsp");
		} else {
			request.setAttribute("erro", "Usuario ou senha inválidos");
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
	}
	
	private Boolean checkUser(String name, String pwd) {
		Boolean found = false;
		for (User user : userDAO.getAll()) {
			if (name.equalsIgnoreCase(user.getName()) && pwd.equals(user.getPassword())) {
				found = true;
			}
		}
		return found;
	}
	
	private User userReturn(String name, String pwd) {
		User user = new User(name, pwd);
		if (checkUser(name, pwd) == true) {
			return user;
		}
		return null;
	}

}
