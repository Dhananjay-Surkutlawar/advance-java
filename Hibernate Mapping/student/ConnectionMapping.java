package studentData;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class ConnectionMapping 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		StandardServiceRegistry registry= new StandardServiceRegistryBuilder().configure().build(); // create service
		Metadata metadata=new MetadataSources(registry).getMetadataBuilder().build(); // read the info in hibernate .cfg.xml file
		SessionFactory sf=metadata.getSessionFactoryBuilder().build(); // connction with database 
		Session session=sf.openSession();
		Address ad=new Address("Nanded","laturhighway","430605");
		Student st=new Student("dhananjay",ad);
		Transaction tr=session.beginTransaction(); // transaction created 
		session.save(st);//saving student in session 
		tr.commit(); // implementing in database
		System.out.println("saved student");
		session.close(); // closing session
		sf.close(); // 
	}

}
