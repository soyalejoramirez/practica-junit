package co.alejandro.domain;

public interface CRUD {
	// Create
	public boolean agregar(Object o);
	// Read
	public Object recuperar(String nombre);
	// Update
	public boolean actualizar(Object o);
	// Delete
	public boolean borrar(Object o);
}
