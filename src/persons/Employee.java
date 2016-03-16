package persons;

public class Employee extends Person {
	private int salary;
	private String jobTitle;

	public Employee(String name, String email, int salary, String jobTitle) {
		super(name, email);
		this.salary = salary;
		this.jobTitle = jobTitle;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String toString() {
		return "Name: " + name + "\nEmail: " + email + "\nSalary: " + salary + "\njobTitle: " + jobTitle;
	}
}
