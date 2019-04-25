package br.ucsal.eventos.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.eventos.dao.CategoriaDAO;
import br.ucsal.eventos.model.Categoria;

/**
 * Servlet implementation class CategoriaController
 */
@WebServlet("/CategoriaController")
public class CategoriaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CategoriaController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("categoriaForm.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		Boolean existe = false;
		Categoria categoria = new Categoria();
		categoria.setNome(nome);
		
		CategoriaDAO dao = new CategoriaDAO();
		List<Categoria> categorias = dao.listar();
		
		for (Categoria e : categorias) {
			if(e.getNome().equals(categoria.getNome())) {
				existe = true;
				break;
			}
		}
		
		if(!existe) {
			dao.inserir(categoria);			
		}
	
		response.sendRedirect(request.getContextPath()+"/inicio");
	}

}
