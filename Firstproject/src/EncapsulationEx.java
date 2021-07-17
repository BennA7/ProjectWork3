class Student3 {
	
private int regnum;
private String name;
private String collegename;

public int getRegnum() {
	return regnum;
}
public void setRegnum(int regnum) {
	this.regnum = regnum;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCollegename() {
	return collegename;
}
public void setCollegename(String collegename) {
	this.collegename = collegename;
}


}
public class EncapsulationEx {
	public static void main(String[] args) {
	Student3 sobj = new Student3();
	sobj.setRegnum(100);
	System.out.println(sobj.getRegnum());
	}

}
