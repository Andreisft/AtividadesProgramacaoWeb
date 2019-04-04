package br.ucsal.bes.atividades.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletExercicio1")
public class ServletExercicio1 extends HttpServlet {

	private static final long serialVersionUID = -990300757893955302L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		Calendar calendar = Calendar.getInstance();
		PrintWriter out = response.getWriter();
		out.print(df.format(calendar.getTime()));
	}
}
