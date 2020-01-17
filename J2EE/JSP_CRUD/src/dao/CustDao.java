package dao;

import pojos.Customer;

public interface CustDao {

	Customer validatUser(String em,String pass) throws Exception;
	String register(Customer c) throws Exception;
	Customer getAllCat() throws Exception;
}
