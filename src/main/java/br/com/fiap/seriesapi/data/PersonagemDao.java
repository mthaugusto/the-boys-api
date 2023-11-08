package br.com.fiap.seriesapi.data;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.seriesapi.model.Personagem;

public class PersonagemDao {

	
	private final String USER = "rm99697";
	private final String PASS = "111294";
	private final String URL = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl";

	List<Personagem> personagens = new ArrayList<>();


	public List<Personagem> findAll() throws SQLException, ClassNotFoundException {
		classForName();
	    var con = DriverManager.getConnection(URL, USER, PASS);
	    String sql = "SELECT * FROM PERSONAGENS";
	    var instrucao = con.prepareStatement(sql);
	    var resultSet = instrucao.executeQuery();

	    List<Personagem> personagens = new ArrayList<>();

	    while (resultSet.next()) {
	        Personagem personagem = new Personagem(
	            resultSet.getLong("id"),
	            resultSet.getString("nome"),
	            resultSet.getString("nomeReal"),
	            resultSet.getString("idade"),
	            resultSet.getString("especie"),
	            resultSet.getString("genero"),
	            resultSet.getString("corDoCabelo"),
	            resultSet.getString("corDosOlhos"),
	            resultSet.getString("altura"),
	            resultSet.getString("peso"),
	            resultSet.getString("status")
	        );
	        personagens.add(personagem);
	    }

	    con.close();

	    return personagens;
	}
	

	public Personagem findById(Long id) throws SQLException, ClassNotFoundException {
		classForName();
	    var con = DriverManager.getConnection(URL, USER, PASS);
	    String sql = "SELECT * FROM PERSONAGENS WHERE ID = ?";
	    var instrucao = con.prepareStatement(sql);
	    instrucao.setLong(1, id);
	    var resultSet = instrucao.executeQuery();
	    
	    Personagem personagem = null;
	    
	    if (resultSet.next()) {
	        personagem = new Personagem(
	            resultSet.getLong("id"),
	            resultSet.getString("nome"),
	            resultSet.getString("nomeReal"),
	            resultSet.getString("idade"),
	            resultSet.getString("especie"),
	            resultSet.getString("genero"),
	            resultSet.getString("corDoCabelo"),
	            resultSet.getString("corDosOlhos"),
	            resultSet.getString("altura"),
	            resultSet.getString("peso"),
	            resultSet.getString("status")
	        );
	    }
	    
	    con.close();
	    
	    return personagem;
	}
	
	public void delete(Personagem personagem) throws SQLException, ClassNotFoundException {
		classForName();
	    var con = DriverManager.getConnection(URL, USER, PASS);
	    String sql = "DELETE FROM PERSONAGENS WHERE ID = ?";
	    var instrucao = con.prepareStatement(sql);
	    instrucao.setLong(1, personagem.id());
	    instrucao.executeUpdate();
	    con.close();
	}


	public void create(Personagem personagem) throws SQLException, ClassNotFoundException {
		classForName();
	    var con = DriverManager.getConnection(URL, USER, PASS);
	    String sql = "INSERT INTO PERSONAGENS (nome, nomeReal, idade, especie, genero, corDoCabelo, corDosOlhos, altura, peso, status) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	    var instrucao = con.prepareStatement(sql);
	    instrucao.setString(1, personagem.nome());
	    instrucao.setString(2, personagem.nomeReal());
	    instrucao.setString(3, personagem.idade());
	    instrucao.setString(4, personagem.especie());
	    instrucao.setString(5, personagem.genero());
	    instrucao.setString(6, personagem.corDoCabelo());
	    instrucao.setString(7, personagem.corDosOlhos());
	    instrucao.setString(8, personagem.altura());
	    instrucao.setString(9, personagem.peso());
	    instrucao.setString(10, personagem.status());
	    instrucao.executeUpdate();
	
	    con.close();
	}

	
	public void update(Personagem personagem) throws SQLException, ClassNotFoundException {
		classForName();
	    var con = DriverManager.getConnection(URL, USER, PASS);
	    String sql = "UPDATE PERSONAGENS SET nome=?, nomeReal=?, idade=?, especie=?, genero=?, corDoCabelo=?, corDosOlhos=?, altura=?, peso=?, status=? WHERE id=?";
	    var instrucao = con.prepareStatement(sql);
	    instrucao.setString(1, personagem.nome());
	    instrucao.setString(2, personagem.nomeReal());
	    instrucao.setString(3, personagem.idade());
	    instrucao.setString(4, personagem.especie());
	    instrucao.setString(5, personagem.genero());
	    instrucao.setString(6, personagem.corDoCabelo());
	    instrucao.setString(7, personagem.corDosOlhos());
	    instrucao.setString(8, personagem.altura());
	    instrucao.setString(9, personagem.peso());
	    instrucao.setString(10, personagem.status());
	    instrucao.setLong(11, personagem.id());
	    instrucao.executeUpdate();
	
	    con.close();
		}
	
	public void classForName() throws ClassNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
	}
}

