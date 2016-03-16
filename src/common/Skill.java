package common;

public class Skill {
	String name;
	String descripiton;
	double rate;

	public Skill(String name, String descripiton) {
		this.name = name;
		this.descripiton = descripiton;

	}

	public String getName() {
		return name;
	}

	public String getDescripiton() {
		return descripiton;
	}

	public double getRate() {
		return rate;
	}
}
