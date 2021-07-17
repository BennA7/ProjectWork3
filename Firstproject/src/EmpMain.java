class Employee{
    
    //instance varaibles
    int empno;
    double salary;
    String name;//String is a predefined class -->"abcd"
}
public class EmpMain{

    //main -->cntl+spacebar enter
    public static void main(String[] args) {
        Employee e=new Employee();
//new -->it creates memory for the obj
//Employee();->constructor -->create the reference
            e.empno=101;
            e.name="kk";
            e.salary=10000;
            System.out.println(e.empno);    
            Employee e1=new Employee();    
            e1.empno=102;
            System.out.println(e1.empno);
        
    }
    
}
