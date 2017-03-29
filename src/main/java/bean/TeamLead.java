package bean;

import java.util.Objects;

public class TeamLead {

	private String projectName;
	private Developer developer;
	private int managerLevel;

	public TeamLead(){}

	public TeamLead(String projectName, Developer developer, int managerLevel) {
		this.projectName = projectName;
		this.developer = developer;
		this.managerLevel = managerLevel;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		TeamLead teamLead = (TeamLead) o;
		return managerLevel == teamLead.managerLevel &&
				Objects.equals(projectName, teamLead.projectName) &&
				Objects.equals(developer, teamLead.developer);
	}

	@Override
	public int hashCode() {
		return Objects.hash(projectName, developer, managerLevel);
	}

	@Override public String toString()
	{
		return "TeamLead{" +
				"projectName='" + projectName + '\'' +
				", developer=" + developer +
				", managerLevel=" + managerLevel +
				'}';
	}
}
