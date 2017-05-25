package hbt;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import entities.*;

public class HibernateUtil {
	private static final SessionFactory sessionFactory;
	static
	{
		try{
			AnnotationConfiguration config=new AnnotationConfiguration();
			config.addAnnotatedClass(PedidoEntity.class);
			config.addAnnotatedClass(ItemPedidoEntity.class);
			config.addAnnotatedClass(PrendaEntity.class);
			config.addAnnotatedClass(ItemMaterialPrendaEntity.class);
			config.addAnnotatedClass(MateriaPrimaEntity.class);
			config.addAnnotatedClass(TalleEntity.class);
			config.addAnnotatedClass(ColorEntity.class);
			config.addAnnotatedClass(ClienteEntity.class);
			config.addAnnotatedClass(EmpleadoEntity.class);
			config.addAnnotatedClass(SucursalEntity.class);
			config.addAnnotatedClass(FacturaEntity.class);
			config.addAnnotatedClass(ItemFacturaEntity.class);
			sessionFactory=config.buildSessionFactory();
		}catch(Throwable ex){
			System.err.println("Initial SessionFactory creation failed." +ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
}
