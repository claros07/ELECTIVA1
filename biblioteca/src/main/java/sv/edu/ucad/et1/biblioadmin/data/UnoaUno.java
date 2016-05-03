package sv.edu.ucad.et1.biblioadmin.data;


import java.util.Date;

import org.hibernate.Session;

import sv.edu.ucad.et1.biblioadmin.entities.Biblio;
import sv.edu.ucad.et1.biblioadmin.entities.Editorial;



public class UnoaUno {
	public static void main(String[] args){
		Session sesion = HibernateUtil.getSessionFactory().openSession();
		
		//inicio de la transaccion
		try{
			org.hibernate.Transaction transaccion = sesion.beginTransaction();
		
			Editorial edit = createNewEditorial();
			Biblio bib = createNewBiblio(edit);

			sesion.save(bib);
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
	
	private static Biblio createNewBiblio(Editorial edit) {
		Biblio bib = new Biblio();
		bib.setEdibib("Messi");
		bib.setFpubib(new Date());
		bib.setIsbbib(2566);
		bib.setEjbib(4);
		bib.setVolbib(1);
		bib.setPagbib(200);
		bib.setTitbib("12345");
		bib.setCvñbib("rojo");
		bib.setDewbib("mtu2");
		bib.setCuttbib("102jk");
		bib.setUbibib("arriba");
		bib.setViadbib("donado");
		bib.setEdit(edit);
		
		
		return bib;
	}
	
	
	private static Editorial createNewEditorial() {
		Editorial nedit = new Editorial();
		nedit.setNomedit("Santillana");
		nedit.setCiuedit("San Salvador");
		nedit.setPaiedit("El Salvador");
		nedit.setWebedit("www.ucad.edu.sv");
		
		return nedit;
	}

}
