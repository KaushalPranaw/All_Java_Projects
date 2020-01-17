package dao;

import pojo.Customer;

public interface CustomerDao {

	Customer validateCust(String em,String pass) throws Exception;
}
