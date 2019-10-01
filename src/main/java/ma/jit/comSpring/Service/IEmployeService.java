package ma.jit.comSpring.Service;

import java.util.List;

import ma.jit.comSpring.entities.Employe;

public interface IEmployeService {

	public void createEmploye(Employe emplo);
	public List<Employe>getAll();
	public void deleteEmploye(int id);
	public void updateEmploye(int id,double salaire,String nom);
	public Employe getById(int id);
}
