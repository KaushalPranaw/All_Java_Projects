package dao;

import pojos.Customer;
import org.hibernate.*;
import static utils.HibernateUtils.*;

public class CustomerDaoImpl implements CustomerDao {

	@Override
	public String registerCustomer(Customer c) {
		Integer id=null;
		//get session from SF
		Session hibSess=getSf().openSession();
		//begin tx
		Transaction tx=hibSess.beginTransaction();
		try {
			id=(Integer)hibSess.save(c);
			tx.commit(); //insert row
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		} finally {
			if( hibSess != null)
				hibSess.close();
		}
		return "Customer reged with ID "+id;
	}

}
