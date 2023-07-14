package product;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class ConMapping 
{
	public static void main(String[] args) {
	StandardServiceRegistry registry= new StandardServiceRegistryBuilder().configure().build(); // create service
		
		Metadata metadata=new MetadataSources(registry).getMetadataBuilder().build(); // read the info in hibernate .cfg.xml file
		
		SessionFactory sf=metadata.getSessionFactoryBuilder().build(); // connction with database 
		
		Session session=sf.openSession();
		
		Category c=new Category("soap", "bodywash");
		Product p=new Product("dettol", 45, c);
		Transaction tr=session.beginTransaction(); 
		//session.save(c);// transaction created 
		session.save(p);//saving product in session 
		tr.commit(); // implementing in database
		System.out.println("product saved");
		session.close(); // closing session
		sf.close();
	}

}
