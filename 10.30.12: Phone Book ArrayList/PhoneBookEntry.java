
public class PhoneBookEntry
{
	private String name;
	private String phoneNumber;
	
	public PhoneBookEntry(String name, String phoneNumber)
	{
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	public PhoneBookEntry(PhoneBookEntry entry)
	{
		this.name = entry.getName();
		this.phoneNumber = entry.getPhoneNumber();
	}
	
	public PhoneBookEntry()
	{
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getPhoneNumber()
	{
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString()
	{
		return "PhoneBookEntry [name=" + name + ", phoneNumber=" + phoneNumber
				+ "]";
	}
}
