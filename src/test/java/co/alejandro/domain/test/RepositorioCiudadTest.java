package co.alejandro.domain.test;

import org.junit.Assert;
import org.junit.Test;

import co.alejandro.domain.Ciudad;
import co.alejandro.domain.RepositorioCiudad;

public class RepositorioCiudadTest {
	
	@Test
	public void agregarUnaCiudadYQueSeAgregueCorrectamente() {
		// Arrange
		RepositorioCiudad repo = new RepositorioCiudad();
		Ciudad ciudad = new Ciudad("Rionegro", "Tutucán");
		
		// Act
		boolean resultado = repo.agregar(ciudad);
		
		// Assert
		Assert.assertTrue(resultado);
	}
	
	@Test
	public void agregarUnaCiudadYQueYaExistanCiudadesYQueSeAgregueCorrectamente() {
		// Arrange
		RepositorioCiudad repo = new RepositorioCiudad();
		Ciudad ciudad = new Ciudad("Rionegro", "Tutucán");
		Ciudad ciudad2 = new Ciudad("El Retiro", "Represa de La Fé");
		repo.agregar(ciudad2);
		
		// Act
		boolean resultado = repo.agregar(ciudad);
		
		// Assert
		Assert.assertTrue(resultado);
	}
	
	@Test
	public void agregarUnaCiudadYQueYaExista() {
		// Arrange
		RepositorioCiudad repo = new RepositorioCiudad();
		Ciudad ciudad = new Ciudad("Rionegro", "Tutucán");
		repo.agregar(ciudad);
		
		// Act
		boolean resultado = repo.agregar(ciudad);
		
		// Assert
		Assert.assertFalse(resultado);
	}
}









