package br.ucsal.eventos.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import br.ucsal.eventos.model.Categoria;
import br.ucsal.eventos.model.Evento;
import br.ucsal.eventos.util.Conexao;

public class EventoDAO {

	
	private Conexao conexao;

	public EventoDAO() {
		this.conexao = Conexao.getConexao();
	}

	public List<Evento> listar() {
		Statement stmt;
		List<Evento> eventos = new ArrayList<Evento>();
		try {
			stmt = conexao.getConnection().createStatement();
			ResultSet rs = stmt.executeQuery("select id,nome,descricao,data,hora,categoria_id from eventos");
			while(rs.next()) {
				Evento e = new Evento();
				e.setId(rs.getInt("id"));
				e.setNome(rs.getString("nome"));
				e.setDescricao(rs.getString("descricao"));
				e.setData(rs.getDate("data").toLocalDate());
				e.setHora(rs.getTime("hora").toLocalTime());
				
				Categoria categoria = new Categoria();
				categoria.setId(rs.getInt("categoria_id"));
				e.setCategoria(categoria);
				
				eventos.add(e);
			}
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return eventos;
	}

	public void inserir(Evento evento) {
		try {

			PreparedStatement ps = conexao.getConnection()
					.prepareStatement("insert into Eventos (nome, descricao, data, hora, categoria_id) values (?,?,?,?,?);");
			ps.setString(1, evento.getNome());
			ps.setString(2, evento.getDescricao());
			ps.setDate(3, Date.valueOf(evento.getData()));
			ps.setTime(4, Time.valueOf(evento.getHora()));
			ps.setInt(5, evento.getCategoria().getId());
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Evento getByID(int id) {
		Evento evento = null;
		CategoriaDAO dao = new CategoriaDAO();
		try {
			PreparedStatement ps = conexao.getConnection().prepareStatement("select id, nome, descricao, data, hora, categoria_id from eventos where id=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				evento = new Evento();
				evento.setId(rs.getInt("id"));
				evento.setNome(rs.getString("nome"));
				evento.setDescricao(rs.getString("descricao"));
				evento.setData(rs.getDate("data").toLocalDate());
				evento.setHora(rs.getTime("hora").toLocalTime());
				
				Categoria categoria = dao.getByID(rs.getInt("categoria_id"));
				evento.setCategoria(categoria);
				
//				Categoria categoria = new Categoria();
//				categoria.setId(rs.getInt("categoria_id"));
//				evento.setCategoria(categoria);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return evento;
	}


}
