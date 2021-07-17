class EmployeeD{
    //data+method-->instance--->using an object
    int empno;
    double salary;
    String name;
    EmployeeD(int empno,double salary,String name){
    //LHS =RHS-->name collision-->this
        //this.empno-->instance variable
        this.empno=empno;
        this.salary=salary;
        this.name=name;      
    }
    
    void display() {
        System.out.println(empno+"  "+salary+"   "+name);
    }
    
}
public class EmpThisKeyword{
	
    public static void main(String[] args) {
              
        //int empno,double salary,String name
        EmployeeD ed=new EmployeeD(101,20000,"karthik");
        ed.display();               
    }    
}

