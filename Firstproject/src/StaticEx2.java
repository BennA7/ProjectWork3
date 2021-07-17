class Student2{
    int regno;
    String name;
    static String colzname="IIT";
    public Student2(int regno, String name) {
        
        this.regno = regno;
        this.name = name;
        
    }
    void change(String colzname) {
        this.colzname=colzname;
    }
    
    static void display() {
        System.out.println(colzname);
    }
    
    
}
public class StaticEx2 {
    public static void main(String[] args) {
            Student2 s1=new Student2(101,"kk");
            s1.change("NIT");
            Student2 s2=new Student2(102,"pp");
            Student2 s3=new Student2(103,"ll");
            
            Student2.display();
      
    }

}


