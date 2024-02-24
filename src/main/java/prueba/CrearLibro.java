package prueba;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import modelo.entidad.Libro;

public class CrearLibro {
	public static void main(String[] args) {
		
		//Siempre trabajamos con un objeto EntityManager
		EntityManagerFactory factoria = Persistence.createEntityManagerFactory("PruebaJPA");
		EntityManager em = factoria.createEntityManager();
		
		//notese que no le pongo el id ya que la bbdd me lo asignar�
		Libro libro = new Libro();
		libro.setTitulo("El Quijote");
		libro.setAutor("Cervantes");
		libro.setEditorial("Anaya");
		libro.setPrecio(20);
		
		//Siempre que modifiquemos la bbdd, ya sea por inserts, updates, deletes, etc.
		//debemos de abrir un contexto de transaccionalidad
		EntityTransaction et = em.getTransaction();
		et.begin();//empezamos la transaccion
		em.persist(libro);//con este metodo, guardaremos el objeto persona en la tabla de bbdd
		et.commit();//Persistimos los cambios
		
		em.close();//cerrar el entity manager
		
		//Una vez salvada la persona podemos ver su id de BBDD		
		System.out.println("Libro creado con id: " + libro.getId());
	}
}