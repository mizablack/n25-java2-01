package br.com.senaisp.bauru.mizael.classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Produto {
	private int id;
	private String descricao;
	private double saldo;
	private double preco;
	private ConectorBancoDados conn;

	// Contructor
	public Produto(String descricao, double saldo, double preco) throws SQLException {
		this.id = 0;
		this.descricao = descricao;
		this.saldo = saldo;
		this.preco = preco;
		conn = ConectorBancoDados.getInstancia();

	}

	public int getId() {

		return id;
	}

	public String getDescricao() {
		return descricao;
	}

	public double getSaldo() {
		return saldo;
	}

	public double getPreco() {
		return preco;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public ConectorBancoDados getConn() {
		return conn;
	}

	private void setId(int value) {
		id = value;

	}

	// Metodos
	public void atualizarBanco() {
		String sql = "update produto set descricao= ? , saldo = ?, peco = ?, where id = ?";
		// PARA SALVAR O REGISTRO, O ID DEVE SER MAIOR QUE ZERO
		if (id > 0) {
			try {
				PreparedStatement stmt = conn.getConnection().prepareStatement(sql);
				// PASSANDO OS PARAMENTRO PARA SQL
				stmt.setString(1, getDescricao());
				stmt.setDouble(2, getSaldo());
				stmt.setDouble(3, getPreco());
				stmt.setInt(4, id);
				// EXECUTANDO A QUERY
				int numLin = stmt.executeUpdate();
				System.out.println("From afetadas " + numLin + " linhas");

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	public void apagarRegistro() {
		String sql = "delete from produto where id = ?";
		// PARA SALVAR O REGISTRO, O ID DEVE SER MAIOR QUE ZERO
		if (id > 0) {
			try {
				PreparedStatement stmt = conn.getConnection().prepareStatement(sql);
				// PASSANDO OS PARAMENTRO PARA SQL
				stmt.setInt(1, id);
				// EXECUTANDO A QUERY
				int numLin = stmt.executeUpdate();
				System.out.println("From afetadas " + numLin + " linhas");
				//LIMPANDO OS CONTEUDOS DO OBJETO
				descricao = null;
				preco = 0;
				saldo = 0;
				id = 0;

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	// metodos estaticos
	public static Produto create(String descricao, double saldo, double preco) throws SQLException {
		Produto prd = new Produto(descricao, saldo, preco);
		// Disparando o sql para inserir o registro
		Connection co = prd.getConn().getConnection();
		String sql = "insert into produto(descricao,saldo,preco) " + "values(?, ?, ?)";
		// preparando para executar
		PreparedStatement stmt = co.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
		// Setar os valores das ?
		stmt.setString(1, descricao);
		stmt.setDouble(2, saldo);
		stmt.setDouble(3, preco);
		// Disparando o SQL
		int linhasAfetadas = stmt.executeUpdate();
		System.out.println("Insere " + linhasAfetadas + " no banco ");
		// obtendo o id gerado
		ResultSet res = stmt.getGeneratedKeys();
		res.next();
		// obtendo o valor do id e sentando no field id do Produto
		prd.setId(res.getInt(1));

		return prd;

	}

	public static List<Produto> listarProdutos() {
		ArrayList<Produto> prd = new ArrayList<Produto>();
		try {
			Connection co = ConectorBancoDados.getInstancia().getConnection();
			String sql = "select id, descricao, saldo, preco from produto order by id";
			PreparedStatement stmt = co.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Produto prod = parseResultado(rs);
				prd.add(prod);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return prd;
	}

	// CONSULTAR UM PRODUTO PELO ID
	public static Produto consultarProdutoPorId(int pId) {
		Produto ret = null;
		try {
			Connection conn = ConectorBancoDados.getInstancia().getConnection();
			String sql = "select id, descricao, saldo, preco from produto where id = ?";
			PreparedStatement stmt = conn.prepareStatement(sql);

			// ATRIBUIR O ID PARA DISPARAR A QUERY
			stmt.setInt(1, pId);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				ret = parseResultado(rs);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ret;

	}

	private static Produto parseResultado(ResultSet rs) throws SQLException {
		Produto prod = new Produto(rs.getString(2), rs.getDouble(3), rs.getDouble(4));
		prod.setId(rs.getInt(1));
		return prod;
	}

}
