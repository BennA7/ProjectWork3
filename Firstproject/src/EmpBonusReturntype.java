
//increase the salary for the employee with a bonus added

class EmployeeB{
	  //data+method-->instance--->using an object
	  int empno;
	  double salary;
	  String name;
	  //method-->newsalary=salary+bonus;
	    
	  public double increaseSalary(double bonus) {
	  double newsalary;//local variable-->any variable in a method
	        newsalary=salary+bonus;
	        return newsalary; 
	  } 
	}

public class EmpBonusReturntype {
	   
	    public static void main(String[] args) {
	        EmployeeB e=new EmployeeB();
	        e.salary=10000;
	        System.out.println(e.increaseSalary(2000));
	    }	    
	}
