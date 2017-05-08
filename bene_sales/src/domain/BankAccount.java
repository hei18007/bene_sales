package domain;

public class BankAccount
{
	private int customer_id;
	private String first_Name;
	private double credit;

	public BankAccount(int customer_id, String first_Name, double credit)
	{
		this.customer_id = customer_id;
		this.first_Name = first_Name;
		this.credit = credit;
	}

	public int getCustomer_id()
	{
		return customer_id;
	}

	public String getFirst_Name()
	{
		return first_Name;
	}

	public double getCredit()
	{
		return credit;
	}

	public void setCustomer_id(int customer_id)
	{
		this.customer_id = customer_id;
	}

	public void setFirst_Name(String first_Name)
	{
		this.first_Name = first_Name;
	}

	public void setCredit(double credit)
	{
		this.credit = credit;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("BankAccount [customer_id=").append(customer_id).append(", first_Name=").append(first_Name)
				.append(", credit=").append(credit).append("]");
		return builder.toString();
	}

}
