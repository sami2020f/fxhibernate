package utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;



public class HibernateUtil {
      private static Session session;
      private static SessionFactory sessionFactory;
 
      public static synchronized SessionFactory buildSessionFactory() {
          if (sessionFactory == null) {

//              StandardServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
              StandardServiceRegistry sr = new StandardServiceRegistryBuilder().configure().build();
              sessionFactory  = new MetadataSources(sr).buildMetadata().buildSessionFactory();

//             sessionFactory = configuration.buildSessionFactory(serviceRegistry);
         }
          return sessionFactory;
     }

     private static Session openSession() {
          Session session = sessionFactory.openSession();
          return session;
     }


     public static Session getSessionFactory() {
         if (sessionFactory==null)  {
             sessionFactory =  buildSessionFactory();
            session = openSession();
         }
         return session;
     }

     public static void closeSession() {

         if (session!=null) {
             session.close();
         }
     }

     public static void closeSessionFactory() {
         if (sessionFactory!=null) {
             sessionFactory.close();
         }
     }

	
 }