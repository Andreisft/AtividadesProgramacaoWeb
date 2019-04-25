package br.ucsal.eventos.controller;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.eventos.dao.CategoriaDAO;
import br.ucsal.eventos.dao.EventoDAO;
import br.ucsal.eventos.model.Categoria;
import br.ucsal.eventos.model.Evento;

/**
 * Servlet implementation class EventosController
 */
@WebServlet("/eventos")
public class EventosController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EventosController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CategoriaDAO dao = new CategoriaDAO();
		request.setAttribute("categorias", dao.listar());
		request.getRequestDispatcher("eventoForm.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CategoriaDAO categoriaDAO = new CategoriaDAO();
		String nome = request.getParameter("nome");
		String descricao = request.getParameter("descricao");
		String data = request.getParameter("data");
		String hora = request.getParameter("hora");
		Integer categoria_id = Integer.parseInt(request.getParameter("categoria"));
		
		Evento evento = new Evento();
		evento.setNome(nome);
		evento.setDescricao(descricao);
		try {
			DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			evento.setData(LocalDate.parse(data, dateFormat));
			DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("H:mm");
			evento.setHora(LocalTime.parse(hora, timeFormat));
			Categoria categoria = categoriaDAO.getByID(categoria_id);
			evento.setCategoria(categoria);
			
			EventoDAO dao = new EventoDAO();
					
			dao.inserir(evento);
			response.sendRedirect(request.getContextPath()+"/inicio");
		} catch (DateTimeParseException e) {
			System.out.println("trocar o type de data e hora que está type='date' e type='time'"
					+ "respectivamente, para type='text' em ambas");
		}	
	}
}
