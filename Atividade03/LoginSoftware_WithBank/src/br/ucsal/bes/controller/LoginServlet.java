package br.ucsal.bes.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.bes.business.UserBO;
import br.ucsal.bes.model.User;
import br.ucsal.bes.persistence.UserDAO;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 8854103683741659859L;
	private UserDAO userDAO = new UserDAO();
	private UserBO userBO = new UserBO();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String pwd = userDAO.md5(password);

		login(request, response, name, pwd);
	}

	private void login(HttpServletRequest request, HttpServletResponse response, String name, String pwd)
			throws IOException, ServletException {
		User user = new User(name, pwd);
		
		if (userBO.userAdmin(user)) {
			request.getSession().setAttribute("user", user);
			response.sendRedirect("admin/home_admin.jsp");
		} else if (userBO.getLoginUser(user)) {
			request.getSession().setAttribute("user", user);
			response.sendRedirect("admin/home.jsp");
		} else {
			request.setAttribute("erro", "Usuario ou senha inválidos");
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
	
	}
}
