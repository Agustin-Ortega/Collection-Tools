package implementacion;

public class Cliente {

	private int id;
	private String nombre;
	private String apellido;
	
	
	public Cliente(int id, String nombre) {
		setId(id);
		setNombre(nombre);	
	}
	
	public Cliente(int id, String nombre, String apellido) {
		setId(id);
		setNombre(nombre);
		setApellido(apellido);
	}
	
	public int getId() {
		return id;
	}
	private void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	private void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
	
	
	
	
}
