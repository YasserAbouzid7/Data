package ma.jit.comSpring.Springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ma.jit.comSpring.Service.EmployeService;
import ma.jit.comSpring.Service.IEmployeService;
import ma.jit.comSpring.entities.Employe;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("AppContext.xml");
        IEmployeService employeService = context.getBean(EmployeService.class);
        
        //employeService.createEmploye(new Employe(6,"nabila", 9500.00, "nabila@gmail.com"));
        employeService.createEmploye(new Employe(1,"nabila", 9500.00, "nabila@gmail.com"));
        employeService.createEmploye(new Employe("yasser", 11199.00, "yasser@gmail.com"));
        employeService.createEmploye(new Employe("Anas", 345.00, "Anas@gmail.com"));
        
       // Employe emp=employeService.getById(1);
        employeService.updateEmploye(1, 50, "Mohamed");
        
        
    }
    
}
