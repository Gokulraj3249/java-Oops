package Day_15;

class ClassFirst{
	public void display() {
		System.out.println("Class First: display");
	}
	public void show() {
		System.out.println("Class First: show");
	}
}
class ClassSecond extends ClassFirst{
	public void display() {
	          System.out.println("Class Second: display");
	}
	public void show() {
		System.out.println("Class Second: show");
	}
}
public class UseFirstSecond {

	public static void main(String[] args) {
	    ClassSecond cs=new ClassSecond();
	    cs.display();
	    cs.show();
	    
	}

}
