package ma.jit.comSpring.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import ma.jit.comSpring.entities.Employe;

public class RowMappEmploye implements RowMapper <Employe>{

	public Employe mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employe employe=new Employe();
		employe.setId(rs.getInt("id"));
		employe.setNom(rs.getString("nom"));
		employe.setSalaire(rs.getDouble("salaire"));
		employe.setEmail(rs.getString("email"));
		return employe;
	}

}
