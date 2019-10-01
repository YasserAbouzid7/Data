package ma.jit.comSpring.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.jit.comSpring.DAO.IEmployeDao;
import ma.jit.comSpring.entities.Employe;



//@service comme Component dans service
@Service
public class EmployeService implements IEmployeService{
	@Autowired
	IEmployeDao dao;
	
	public void createEmploye(Employe emplo) {
		dao.createEmploye(emplo);
	}
	
	public List<Employe>getAll(){
		
		return dao.getAll();
	}
	
	public void deleteEmploye(int id){
		
		dao.deleteEmploye(id);
	}
	public void updateEmploye(int id,double salaire,String nom ){
		
		dao.updateEmploye(id, salaire,nom);
	}

	public Employe getById(int id) {
		return dao.getById(id);
 
	}

}
