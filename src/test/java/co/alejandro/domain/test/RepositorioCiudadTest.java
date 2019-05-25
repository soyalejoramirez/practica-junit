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
}









