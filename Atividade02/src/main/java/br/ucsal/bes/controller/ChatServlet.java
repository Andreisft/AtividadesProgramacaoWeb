package br.ucsal.bes.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.bes.model.Channel;
import br.ucsal.bes.model.Message;
import br.ucsal.bes.model.User;

@WebServlet("/ChatServlet")
public class ChatServlet extends HttpServlet {

	private static final long serialVersionUID = -2395441569997672629L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String text = request.getParameter("message");
		String destiny = request.getParameter("destiny");

		Channel channel = (Channel) request.getServletContext().getAttribute("channel");
		User user = (User) request.getSession().getAttribute("user");

		if (text != null && text.trim().length() > 0) {
			Message message = new Message();
			message.setText(text);
			message.setOrigin(user);
			if (destiny != null && !destiny.equalsIgnoreCase("All")) {
				User userDestiny = null;

				for (User userForEach : channel.getUsers()) {
					if (userForEach.getLogin().equals(destiny)) {
						userDestiny = userForEach;
					}
				}
				message.setDestiny(userDestiny);
			}
			channel.getPosts().add(message);
			request.getServletContext().setAttribute("channel", channel);
		}
		response.sendRedirect("/chat/chat.jsp");
	}

}
