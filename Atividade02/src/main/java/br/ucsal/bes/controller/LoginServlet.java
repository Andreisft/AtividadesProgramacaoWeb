package br.ucsal.bes.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.bes.business.ChatBO;
import br.ucsal.bes.exception.InputUserEmptyException;
import br.ucsal.bes.model.Channel;
import br.ucsal.bes.model.User;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1312957497219382428L;
	private ChatBO chatBo = new ChatBO();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String login = request.getParameter("username");
		User user = new User(login);
		try {
			chatBo.InputUser(user);
		} catch (InputUserEmptyException e) {
//			e.getMessage(); Lançar exception por meio de um alert
			System.out.println(e.getMessage());
		}
		Channel channel = (Channel) request.getServletContext().getAttribute("channel");
		channel.getUsers().add(user);
		request.getSession().setAttribute("user", user);
		response.sendRedirect("/chat/chat.jsp");
	}

}
