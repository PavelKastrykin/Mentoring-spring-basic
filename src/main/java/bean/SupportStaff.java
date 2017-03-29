package bean;

import java.util.Objects;

public abstract class SupportStaff
{
	private String supportName;

	public SupportStaff(){}

	public String getSupportName() {
		return supportName;
	}

	public void setSupportName(String supportName) {
		this.supportName = supportName;
	}

	protected abstract SupportCount getStaffCount();

	@Override
	public String toString()
	{
		return "SupportStaff{" +
				"supportName='" + supportName + '\'' +
				", count=" + getStaffCount() +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		SupportStaff that = (SupportStaff) o;
		return Objects.equals(supportName, that.supportName) &&
				Objects.equals(getStaffCount() , that.getStaffCount() );
	}

	@Override
	public int hashCode() {
		return Objects.hash(supportName, getStaffCount() );
	}
}
