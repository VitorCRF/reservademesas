package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Mesa;
import view.ConferirReservasView;

public class MesaDAO {
	private Conexao conexao;
	private String query;
	private PreparedStatement ps;
	private ResultSet rs;
	public MesaDAO() {
		conexao = conexao.getInstance();
	}

	public ResultSet conferirReservas(Mesa mesa) {
		try {
			query = "SELECT * FROM cliente INNER JOIN mesas ON mesas.rg = cliente.rg where cliente.rg = ?";
			ps = conexao.getConexao().prepareStatement(query);
			ps.setString(1, mesa.getRgCliente());
			rs = ps.executeQuery();

			return rs;
		}catch (SQLException e) {

		}return null;
	}


	public void insereMesa(Mesa mesa) {
		
		try {
			query = "INSERT INTO mesas (numero, disponibilidade) VALUES (?, true)";
			ps = conexao.getConexao().prepareStatement(query);

			ps.setInt(1, mesa.getNumero());
			ps.executeUpdate();
			
			ps.close();
		} catch (SQLException e) {

		}
	}
	public void atualizaMesa(Mesa mesa) {

		try {
			//query = "INSERT INTO mesas (numero, rg, disponibilidade) VALUES (?, ?, ?)";
			query = "UPDATE mesas SET rg = ?, disponibilidade = false WHERE numero = ?";
			ps = conexao.getConexao().prepareStatement(query);

			ps.setString(1, mesa.getRgCliente());
			ps.setInt(2, mesa.getNumero());
			ps.executeUpdate();

			ps.close();
		} catch (SQLException e) {

		}
	}
	public ResultSet listarMesasDisponiveis() {
		try {
			query = "SELECT * FROM mesas where disponibilidade = true";
			ps = conexao.getConexao().prepareStatement(query);
			rs = ps.executeQuery();
			
			return rs;
		}catch (SQLException e) {

		}return null;
	}
	public ResultSet listarTodasMesas() {
		try {
			query = "SELECT * FROM mesas";
			ps = conexao.getConexao().prepareStatement(query);
			rs = ps.executeQuery();

			return rs;
		}catch (SQLException e) {

		}return null;
	}
}
