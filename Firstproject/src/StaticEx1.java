class Student{
    int regno;
    String name;
    static String colzname="IIT";
    public Student(int regno, String name) {
        
        this.regno = regno;
        this.name = name;
        
    }
    void change(String colzname) {
        this.colzname=colzname;
    }
    
    void display() {
        System.out.println(regno+"  "+name+"  "+colzname);
    }
    
    
}
public class StaticEx1 {
    public static void main(String[] args) {
            Student s1=new Student(101,"kk");
            s1.change("NIT");
            Student s2=new Student(102,"pp");
            Student s3=new Student(103,"ll");
            s1.display();
            s2.display();
            s3.display();
    }

}

