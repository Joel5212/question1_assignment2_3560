package question1_assignment2_3560;

public class Student {
	
	private String name;
	private String major;
	private double gpa;
	
	Student()
	{
		
	}
	
	
	Student(String name, String major)
	{
		this.name = name;
		this.major = major;
	}
	
	Student(String name, String major, double gpa)
	{
		this.name = name;
		this.major = major;
		this.gpa = gpa;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getMajor() {
		return major;
	}


	public void setMajor(String major) {
		this.major = major;
	}


	public double getGPA() {
		return gpa;
	}


	public void setGPA(double gpa) {;
		this.gpa = gpa;
	}
	
	public String toString()
	{
		return "\nName: " + this.getName() + "\nMajor: " + this.getMajor() + "\nGPA: " + this.getGPA();
	}
	
	public boolean equals(Student student)
	{
		if(this.name.equals(student.getName()) && this.major.equals(student.getMajor()))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	


}
