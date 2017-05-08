package domain;

import java.util.ArrayList;

public class Bank
{
	private ArrayList<BankAccount> accounts;

	public Bank(ArrayList<BankAccount> accounts)
	{
		this.accounts = accounts;
	}

	/**
	 * @return the accounts
	 */
	public ArrayList<BankAccount> getAccounts()
	{
		return accounts;
	}

	/**
	 * @param accounts
	 *            the accounts to set
	 */
	public void setAccounts(ArrayList<BankAccount> accounts)
	{
		this.accounts = accounts;
	}

}
