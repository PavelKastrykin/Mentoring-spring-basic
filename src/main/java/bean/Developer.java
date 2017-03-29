package bean;

import java.util.List;
import java.util.Objects;

public class Developer {
	private String name;
	private int age;
	private int experience;
	private List<String> employmentHistory;

	public Developer(String name, int age, int experience) {
		this.name = name;
		this.age = age;
		this.experience = experience;
	}

	public Developer(){}

	@Override public boolean equals(Object o)
	{
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Developer developer = (Developer) o;
		return age == developer.age &&
				experience == developer.experience &&
				Objects.equals(name, developer.name);
	}

	@Override public int hashCode()
	{
		return Objects.hash(name, age, experience);
	}

	@Override public String toString()
	{
		return "Developer{" +
				"name='" + name + '\'' +
				", age=" + age +
				", experience=" + experience +
				", employmentHistory=" + employmentHistory +
				'}';
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

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public List<String> getEmploymentHistory() {
		return employmentHistory;
	}

	public void setEmploymentHistory(List<String> employmentHistory) {
		this.employmentHistory = employmentHistory;
	}
}
