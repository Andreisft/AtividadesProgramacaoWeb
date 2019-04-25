package br.ucsal.eventos.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.ucsal.eventos.model.Evento;
import br.ucsal.eventos.model.Inscricao;
import br.ucsal.eventos.util.Conexao;

public class InscricaoDAO {

	
	private Conexao conexao;

	public InscricaoDAO() {
		this.conexao = Conexao.getConexao();
	}

	public List<Inscricao> listar() {
		Statement stmt;
		List<Inscricao> inscricoes = new ArrayList<Inscricao>();
		try {
			stmt = conexao.getConnection().createStatement();
			ResultSet rs = stmt.executeQuery("select id,nome,cpf,email,evento_id from inscricoes");
			while(rs.next()) {
				Inscricao inscricao = new Inscricao();
				inscricao.setId(rs.getInt("id"));
				inscricao.setNome(rs.getString("nome"));
				inscricao.setCpf(rs.getString("cpf"));
				inscricao.setEmail(rs.getString("email"));
				
				Evento evento = new Evento();
				evento.setId(rs.getInt("evento_id"));
				inscricao.setEvento(evento);
				
				inscricoes.add(inscricao);
			}
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return inscricoes;
	}

	public void inserir(Inscricao inscricao) {
		try {

			PreparedStatement ps = conexao.getConnection()
					.prepareStatement("insert into Inscricoes (nome, cpf, email, evento_id) values (?,?,?,?);");
			ps.setString(1, inscricao.getNome());
			ps.setString(2, inscricao.getCpf());
			ps.setString(3, inscricao.getEmail());
			ps.setInt(4, inscricao.getEvento().getId());
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


}
