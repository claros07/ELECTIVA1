package sv.edu.ucad.et1.biblioadmin.data;

import java.util.Date;

import org.hibernate.Session;

import sv.edu.ucad.et1.biblioadmin.entities.Clientes;
import sv.edu.ucad.et1.biblioadmin.entities.Prestamos;


public class UnoaUnoDemo {
	public static void main(String[] args){
		Session sesion = HibernateUtil.getSessionFactory().openSession();
		
		//inicio de la transaccion
		try{
			org.hibernate.Transaction transaccion = sesion.beginTransaction();
		
			Clientes clien = createNewClientes();
			Prestamos prestamo = createNewPrestamos(clien);

			sesion.save(prestamo);
			transaccion.commit();
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			sesion.close();
			HibernateUtil.getSessionFactory().close();
		}
		
	}
	
	//clases empotradas que crean usuarios y deptos
	//crea un nuevo usuario
	
	private static Prestamos createNewPrestamos(Clientes clien) {
		Prestamos prest = new Prestamos();
		prest.setDocpres("Dui");
		prest.setDurpres("1 dias");
		prest.setFecdev(new Date());
		prest.setClien(clien);
		
		
		//modif por la OneToOne Uni nusu.setCodcar((long) 1);
		//prest.setCodcli(int);		
		return prest;
	}
	
	//crea un nuevo depto
	private static Clientes createNewClientes() {
		Clientes ncli = new Clientes();
		ncli.setNomcli("Nahum Geziel ");
		ncli.setApecli("Claros");
		ncli.setCarrcli("Contaduria Publica");
		ncli.setCarcli("Estudiante");
		ncli.setTipcli("Alumno");
		
		return ncli;
	}
	
	

}
