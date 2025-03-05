package overview;

public class Student extends Person {
	private int admitYear;
	private double gpa;

	public Student(String name, int id, int admitYear, double gpa) {
		super(name, id); /* Calls super/base class constructor */
		this.admitYear = admitYear;
		this.gpa = gpa;
	}

	/* What would happen if we remove the Person default constructor? */
	public Student() {
		super(); /* Calls super/base class constructor (what if we remove it?) */
		admitYear = -1;
		gpa = 0.0;
	}

	public Student(Student s) {
		super(s); /* Calls super class copy constructor */
		admitYear = s.admitYear;
		gpa = s.gpa;
	}

	public int getAdmitYear() {
		return admitYear;
	}

	public double getGpa() {
		return gpa;
	}

	public void setAdmitYear(int admitYear) {
		this.admitYear = admitYear;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public String toString() {
		/* Using super to call super class method */
		return super.toString() + " " + admitYear + " " + gpa;
	}

	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Student))
			return false;
		Student student = (Student) obj;

		/* Relying on Person equals; passing student */
		return super.equals(student) && admitYear == student.admitYear;
	}

	public static void main(String[] args) {
		Student bob = new Student("Bob", 457, 2004, 4.0);
		Student robert = new Student(bob);
		Student tom = new Student("Tom", 457, 2004, 4.0);

		System.out.println(bob);
		System.out.println("Same:" + bob.equals(robert));
		System.out.println("Same:" + tom.equals(robert));
	}
}
