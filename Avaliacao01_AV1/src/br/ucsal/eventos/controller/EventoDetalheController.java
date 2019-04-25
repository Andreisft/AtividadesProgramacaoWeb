package br.ucsal.eventos.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.eventos.dao.EventoDAO;
import br.ucsal.eventos.dao.InscricaoDAO;
import br.ucsal.eventos.model.Evento;
import br.ucsal.eventos.model.Inscricao;

/**
 * Servlet implementation class EventoDetalheController
 */
@WebServlet("/detalhe")
public class EventoDetalheController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EventoDetalheController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Integer id = Integer.parseInt(request.getParameter("id"));
		EventoDAO dao = new EventoDAO();
		
		Evento evento = dao.getByID(id);
		request.setAttribute("evento", evento);
		
		InscricaoDAO daoInscricao = new InscricaoDAO();
		List<Inscricao> inscricoes = daoInscricao.listar();
		
		List<Inscricao> filterInscricoes = new ArrayList<>();
		for (Inscricao e : inscricoes) {
			if (e.getEvento().getId() == id) {
				filterInscricoes.add(e);
			}
		}
		
		request.setAttribute("inscricoes", filterInscricoes);
		
		request.getRequestDispatcher("eventoDetalhe.jsp").forward(request, response);
		
		

		
	}

}
