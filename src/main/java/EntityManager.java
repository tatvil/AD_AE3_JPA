
public interface EntityManager {
	public void main(String[] args);

	public void setId(int id);

	public void setTitulo(String titulo);

	public void setPrecio(double precio);

	public void setEditorial(Editorial editorial);

	public void setAutor(Autor autor);

	public void setNombre(String nombre);

	public void setDireccion(String direccion);

	public void setApellido1(String apellido1);

	public void setApellido2(String apellido2);

	public void setFechaNacimiento(Date fechaNacimiento);

	public int getId();

	public String getTitulo();

	public double getPrecio();

	public Editorial getEditorial();

	public Autor getAutor();

	public String getNombre();

	public String getDireccion();

	public String getApellido1();

	public String getApellido2();

	public Date getFechaNacimiento();


}
