package arrayPrac3;

public class People {

	String name;
	double grade = 0.0;
	
	public People() {
		
	}
	
	public People(String name, double grade) {
		this.name = name;
		this.grade = grade;
	}
	
	public void showPeopleInfo() {
		System.out.println("�̸�: " + this.getName());
		System.out.println("����: " + this.getGrade());
		System.out.println();
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	
	
	
}
