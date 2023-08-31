package Utill;

import Dto.RoomDto;

import Entity.Rooms;
import Entity.RoomsType;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryConfiguration {
    private static SessionFactoryConfiguration factoryConfiguration;

   
    private final SessionFactory sessionFactory;
    public static SessionFactoryConfiguration getInstance() {
        return factoryConfiguration == null
                ? factoryConfiguration = new SessionFactoryConfiguration()
                : factoryConfiguration;
    }

    private SessionFactoryConfiguration() {
//        sessionFactory = new MetadataSources(new StandardServiceRegistryBuilder().configure().build())
//                .addAnnotatedClass(Customer.class).getMetadataBuilder().
//                        applyImplicitNamingStrategy(ImplicitNamingStrategyJpaCompliantImpl.INSTANCE).build()
//                .getSessionFactoryBuilder().build();

        Configuration configure = new Configuration().configure()
                .addAnnotatedClass(RoomDto.class)
                .addAnnotatedClass(RoomsType.class)
                .addAnnotatedClass(Rooms.class);
        sessionFactory = configure.buildSessionFactory();
    }

    public Session getSession() throws HibernateException {
        return sessionFactory.openSession();
    }
}
