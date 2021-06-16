package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Cliente;


public class ClienteDAO {
	private Conexao conexao;
	private String query;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public ClienteDAO() {
		conexao = conexao.getInstance();
	}
	
	public void insereCliente(Cliente cliente) {

		try {
			query = "INSERT INTO cliente (nome, telefone, email) VALUES (?, ?, ?)";
			ps = conexao.getConexao().prepareStatement(query);

			ps.setString(1, cliente.getNome());
			ps.setString(2, cliente.getTelefone());
			ps.setString(3, cliente.getEmail());

			ps.executeUpdate();
			
			ps.close();
		} catch (SQLException e) {

		}
	}
	public ResultSet listarClientes() {
		try {
			query = "SELECT * FROM cliente";
			ps = conexao.getConexao().prepareStatement(query);
			
			rs = ps.executeQuery();
			
			return rs;
		}catch (SQLException e) {

		}return null;
	}
}
