package com.springDemo;

import org.springframework.beans.factory.annotation.Value;

public class OracleCustomerDal implements ICustomerDal
{
	@Value("${database.connectionString}")
	String connectionString;
	
	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

	public void add() {
		System.out.println("Connection String: "+connectionString);
		System.out.println("Oracle Veritabanýna Eklendi");
		
	}

}
