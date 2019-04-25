package br.ucsal.eventos.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.eventos.dao.InscricaoDAO;
import br.ucsal.eventos.model.Evento;
import br.ucsal.eventos.model.Inscricao;

/**
 * Servlet implementation class EventosController
 */
@WebServlet("/InscricaoController")
public class InscricaoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InscricaoController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("eventoDetalhe.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String nome = request.getParameter("nome");
		String cpf = request.getParameter("cpf");
		String email = request.getParameter("email");
		Integer evento_id = Integer.parseInt(request.getParameter("evento_id"));
		
		Boolean existe = false;
		
		Inscricao inscricao = new Inscricao();
		inscricao.setNome(nome);
		inscricao.setCpf(cpf);
		inscricao.setEmail(email);
		
		Evento evento = new Evento();
		evento.setId(evento_id);
		inscricao.setEvento(evento);

		InscricaoDAO dao = new InscricaoDAO();
		
		List<Inscricao> inscricoes = dao.listar();
		
		List<Inscricao> filterInscricoes = new ArrayList<>();
		for (Inscricao e : inscricoes) {
			if (e.getEvento().getId() == evento_id) {
				filterInscricoes.add(e);
			}
		}
		
		for (Inscricao e : filterInscricoes) {
			if (e.getCpf().equals(inscricao.getCpf()) || e.getEmail().equalsIgnoreCase(inscricao.getEmail())) {
				existe = true;
				break;
			}
		}
				
		if (!existe) {
			dao.inserir(inscricao);
		}
		
		request.setAttribute("inscricoes", dao.listar());
		response.sendRedirect(request.getContextPath()+"/detalhe?id=" + evento.getId());
	}

}
