package br.ucsal.eventos.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.ucsal.eventos.model.Categoria;
import br.ucsal.eventos.model.Categoria;
import br.ucsal.eventos.util.Conexao;

public class CategoriaDAO {

	
	private Conexao conexao;

	public CategoriaDAO() {
		this.conexao = Conexao.getConexao();
	}

	public List<Categoria> listar() {
		Statement stmt;
		List<Categoria> categorias = new ArrayList<Categoria>();
		try {
			stmt = conexao.getConnection().createStatement();
			ResultSet rs = stmt.executeQuery("select id,nome from categorias");
			while(rs.next()) {
				Categoria categoria = new Categoria();
				categoria.setId(rs.getInt("id"));
				categoria.setNome(rs.getString("nome"));
				categorias.add(categoria);
			}
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return categorias;
	}

	public void inserir(Categoria categoria) {
		try {

			PreparedStatement ps = conexao.getConnection()
					.prepareStatement("insert into Categorias (nome) values (?);");
			ps.setString(1, categoria.getNome());
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Categoria getByID(int id) {
		Categoria categoria = null;
		try {
			PreparedStatement ps = conexao.getConnection().prepareStatement("select id, nome from categorias where id=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				categoria = new Categoria();
				categoria.setId(rs.getInt("id"));
				categoria.setNome(rs.getString("nome"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return categoria;
	}

}
