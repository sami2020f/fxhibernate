package control;

import org.hibernate.Session;

import utils.HibernateUtil;

public class MainHibernate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
//			
		Session session = HibernateUtil.getSessionFactory();

        session.getTransaction().begin();
		
		Username prueba=new Username("sami", "sami");
		 session.save(prueba);
       session.getTransaction().commit();

		}

		finally {
			
			HibernateUtil.closeSession();
			HibernateUtil.closeSessionFactory();
		}
	}

}
