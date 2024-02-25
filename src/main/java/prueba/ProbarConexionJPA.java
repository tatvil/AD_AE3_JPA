package prueba;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ProbarConexionJPA {

	public static void main(String[] args) {
		//Este ejemplo es para probar la conexion
		EntityManagerFactory factoria = Persistence.createEntityManagerFactory("PruebaJPA");
		
		EntityManager em = factoria.createEntityManager();
		
		em.close();
	}
}
