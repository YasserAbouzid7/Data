package ma.jit.comSpring.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ma.jit.comSpring.entities.Employe;
//@Repository  la partie de dao in service
@Repository 
public class EmployeDaoImpl implements IEmployeDao {
	
	
	 JdbcTemplate jdbcTemplate;
	    private final String SQL_FIND_EMPLOYE = "select * from employe where id = ?";
	   private final String SQL_DELETE_EMPLOYE = "delete from employe where id = ?";
	   private final String SQL_UPDATE_EMPLOYE = "update employe set salaire = ?,nom=? where id = ?";
	   private final String SQL_GET_ALL = "select * from employe";
	   private final String SQL_INSERT_EMPLOYE = "insert into employe(nom,salaire, email) values(?,?,?)";

	   
	  
	public EmployeDaoImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	public void createEmploye(Employe emplo) {
		  jdbcTemplate.update(SQL_INSERT_EMPLOYE,emplo.getNom(),emplo.getSalaire(),emplo.getEmail());
	}

	public List<Employe> getAll() {
		  List<Employe> listemployes =jdbcTemplate.query(SQL_GET_ALL,new RowMappEmploye());
	        return listemployes;
		
	}

	public void deleteEmploye(int id) {
		   jdbcTemplate.update(SQL_DELETE_EMPLOYE,id);

	}

	public void updateEmploye(int id, double salaire,String nom) {
	    jdbcTemplate.update(SQL_UPDATE_EMPLOYE,salaire,nom,id);
	}

	public Employe getById(int id) {
		return	(Employe) jdbcTemplate.query(SQL_FIND_EMPLOYE,new RowMappEmploye(), id);
		
	}

	

}
