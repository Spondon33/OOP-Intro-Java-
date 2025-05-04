public class Student {
	int id;
	String name;
	double cgpa;

	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getCgpa() {
		return cgpa;
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setId(136);
		s1.setName("John");
		s1.setCgpa(3.8);

		System.out.println(s1.getId());
		System.out.println(s1.getName());
		System.out.println(s1.getCgpa());
	}
}
