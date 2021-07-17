//increase the salary for the employee with a bonus added
class EmployeeC{
    //data+method-->instance--->using an object
    int empno;
    double salary;
    String name;
    EmployeeC(double bonus){
        System.out.println(salary+bonus);
    }    
}

public class EmpConstructor{
        
public static void main(String[] args) {
        EmployeeC ec=new EmployeeC(2000);
        ec.salary=1000;
        
  }
}
