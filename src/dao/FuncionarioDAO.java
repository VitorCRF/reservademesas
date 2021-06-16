package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Funcionario;


public class FuncionarioDAO {
	private Conexao conexao;
	private String query;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public FuncionarioDAO() {
		conexao = conexao.getInstance();
	}
	
	public void insereFuncionario(Funcionario funcionario) {

		try {
			query = "INSERT INTO funcionario (nome) VALUES (?)";
			ps = conexao.getConexao().prepareStatement(query);

			ps.setString(1, funcionario.getNome());

			ps.executeUpdate();
			
			ps.close();
		} catch (SQLException e) {

		}
	}
	public ResultSet listarFuncionarios() {
		try {
			query = "SELECT * FROM funcionario";
			ps = conexao.getConexao().prepareStatement(query);
			
			rs = ps.executeQuery();
			
			return rs;
		}catch (SQLException e) {

		}return null;
	}
}
