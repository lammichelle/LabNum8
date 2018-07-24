
public class Robot {

	private String name;
	private int age;

	public Robot(String name, int age) { //2 variables 
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Robot [name=" + name + ", age=" + age + "]";
	}

}