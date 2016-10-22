package hibernate;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class InsertEmployee {

	public static void main(String[] args) {
		Configuration cfg = new configuration();
		cfg.getAppConfigurationEntry("Hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("Eric");
		emp.setMobile(4220119);
		emp.setEmail("min15010@byui.edu");
		s.save(emp);
		s.flush();
		tx.commit();
		s.close();
	}

}
