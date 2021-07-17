//increase the salary for the employee with a bonus added

class EmployeeA{
    //data+method-->instance--->using an object
    int empno;
    double salary;
    String name;
    //method-->newsalary=salary+bonus;
    
    public void increaseSalary(double bonus) {
        double newsalary;//local variable-->any variable in a method
        newsalary=salary+bonus;
        System.out.println(newsalary);
        
    }
    
}
public class EmpBonous{

    
    public static void main(String[] args) {
        EmployeeA e=new EmployeeA();
        e.salary=10000;
        e.increaseSalary(2000);

        
    }
    
}

