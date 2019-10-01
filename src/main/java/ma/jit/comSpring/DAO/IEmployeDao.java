package ma.jit.comSpring.DAO;

import java.util.List;

import ma.jit.comSpring.entities.Employe;

public interface IEmployeDao {
	
	public void createEmploye(Employe emplo);
	public List<Employe>getAll();
	public void deleteEmploye(int id);
	public void updateEmploye(int id,double salaire,String nom);
	public Employe getById(int id);
//	public Employe

}
