package Day_14;
class Person{
	String name;
	int age;
	void getPerInfo(String str,int ag) {
		name=str;
		ag=age;
	}
	void putPerInfo() {
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
	}
}
class Student extends Person{
	int total;
	char grade;
	void getStuInfo(String n,int ag,int tot,char gr) {
		getPerInfo(n,ag);
		total=tot;
		grade=gr;
	}
	void putStuInfo() {
		System.out.println("Total:"+total);
		System.out.println("Grade:"+grade);
	}
}
public class Single_Inheritances {

	public static void main(String[] args) {
		Student s=new Student();
		s.getStuInfo("Alex", 17, 49, 'B');
		s.putStuInfo();
		

	}

}
