package studentData;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class FetchData 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				StandardServiceRegistry registry= new StandardServiceRegistryBuilder().configure().build(); // create service
				Metadata metadata=new MetadataSources(registry).getMetadataBuilder().build(); // read the info in hibernate .cfg.xml file
				SessionFactory sf=metadata.getSessionFactoryBuilder().build(); // connction with database 
				Session session=sf.openSession();
				 Student st= session.get(Student.class,1);
				 System.out.println(st.getName()+" "+st.address);
				 session.close();
	}

}
