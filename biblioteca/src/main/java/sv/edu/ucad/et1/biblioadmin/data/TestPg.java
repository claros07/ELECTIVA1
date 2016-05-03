package sv.edu.ucad.et1.biblioadmin.data;

import org.hibernate.Session;

public class TestPg {
	public static void main(String[] args){
		System.out.println("Iniciando la prueba de configuracion");
		Session sesion = HibernateUtil.getSessionFactory().openSession();
		sesion.beginTransaction();
		sesion.close();
	}

}
