package br.ucsal.bes.atividades.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.bes.atividades.model.User;
import br.ucsal.bes.atividades.persistence.UserDAO;

@WebServlet("/ServletExercicio2")
public class ServletExercicio2 extends HttpServlet {

	private static final long serialVersionUID = -4485014002077921869L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		UserDAO usuarioDAO = new UserDAO();
		PrintWriter out = response.getWriter();
		for (User userForEach : usuarioDAO.getAll()) {
			out.print(userForEach + "\n");
			/* Adicionar toString na classe "User"
			Para melhor visualização*/
		}
	}

}
