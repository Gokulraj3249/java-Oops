package Day_14;
class Encapsulation{
	private String name;
	private int age;
	private String country;
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getCountry() {
		return country;
	}
	public void setAge(int newValue) {
		age=newValue;
	}
	public void setName(String newValue) {
		name=newValue;
	}
	public void setCountry(String newValue) {
		country=newValue;
	}
}
public class Encapsulation_ex {

	public static void main(String[] args) {
		Encapsulation obj=new  Encapsulation();
		 obj.setName("Alex");
		 obj.setAge(20);
		 obj.setCountry("Dubai");
		 System.out.println("Name:"+obj.getName());
		 System.out.println("Age:"+obj.getAge());
		 System.out.println("Country:"+obj.getCountry());
		 

	}

}
