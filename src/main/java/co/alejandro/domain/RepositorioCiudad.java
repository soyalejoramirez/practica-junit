package co.alejandro.domain;

import java.util.ArrayList;
import java.util.List;

public class RepositorioCiudad implements CRUD {
	
	private List<Ciudad> ciudades;
	
	public RepositorioCiudad() {
		ciudades = new ArrayList<>();
	}

	@Override
	public boolean agregar(Object o) {
		Ciudad ciudadAAgregar = (Ciudad) o;
		
		for (Ciudad city : ciudades) {
			if (city.getNombre().equalsIgnoreCase(ciudadAAgregar.getNombre())) {
				return false;
			}
		}
		
		this.ciudades.add(ciudadAAgregar);
		return true;
	}

	@Override
	public Object recuperar(String nombre) {
		for (Ciudad ciudad : ciudades) {
			if (ciudad.getNombre().equalsIgnoreCase(nombre)) {
				return ciudad;
			}
		}
		return null;
	}

	@Override
	public boolean actualizar(Object o) {
		Ciudad ciudadAActualizar = (Ciudad) o;
		
		for (int i = 0; i < this.ciudades.size(); i++) {
			if(this.ciudades.get(i).getNombre().equalsIgnoreCase(ciudadAActualizar.getNombre())) {
				this.ciudades.set(i, ciudadAActualizar);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean borrar(Object o) {
		Ciudad ciudadAActualizar = (Ciudad) o;
		
		for (int i = 0; i < this.ciudades.size(); i++) {
			if(this.ciudades.get(i).getNombre().equalsIgnoreCase(ciudadAActualizar.getNombre())) {
				this.ciudades.remove(i);
				return true;
			}
		}
		return false;
	}

}
