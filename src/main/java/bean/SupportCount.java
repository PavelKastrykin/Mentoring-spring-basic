package bean;

public class SupportCount {
	private static int count = 0;

	public SupportCount() {
		count++;
	}

	public static int getCount() {
		return count;
	}

	@Override
	public String toString()
	{
		return "SupportCount " + count + " times";
	}
}
