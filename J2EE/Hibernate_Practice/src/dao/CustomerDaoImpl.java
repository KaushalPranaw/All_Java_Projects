package dao;

import static utils.HibernateUtils.getSf;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import pojos.Customer;

public class CustomerDaoImpl implements CustomerDao {

	@Override
	public String registerCustomer(Customer c) {

		Integer id=null;
		Session hiberSession=getSf().openSession();
		
		 Transaction tx=hiberSession.beginTransaction();
		 try {
			 id=(Integer)hiberSession.save(c);
			 tx.commit();
			 
		 }
		 catch(HibernateException e) 
		 {
			 if(tx!=null)
				 tx.rollback();
			 throw e;
		 }
		 finally {
			if(hiberSession!=null)
				hiberSession.close();
		 }
		return null;
	}

}
