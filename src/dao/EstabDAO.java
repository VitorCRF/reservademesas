package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Estabelecimento;


public class EstabDAO {
	private Conexao conexao;
	private String query;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public EstabDAO() {
		conexao = conexao.getInstance();
	}
	
	public void insereEstab(Estabelecimento estab) {

		try {
			query = "INSERT INTO estabelecimento (nome, telefone) VALUES (?, ?)";
			ps = conexao.getConexao().prepareStatement(query);

			ps.setString(1, estab.getNome());
			ps.setString(2, estab.getTelefone());

			ps.executeUpdate();
			
			ps.close();
		} catch (SQLException e) {

		}
	}
	public ResultSet listarEstabelecimentos() {
		try {
			query = "SELECT * FROM estabelecimentos";
			ps = conexao.getConexao().prepareStatement(query);
			
			rs = ps.executeQuery();
			
			return rs;
		}catch (SQLException e) {

		}return null;
	}
}