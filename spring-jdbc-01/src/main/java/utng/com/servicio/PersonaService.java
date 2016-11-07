package utng.com.servicio;

import java.util.List;
import utng.com.jdbc.Persona;

public interface PersonaService {
	public List<Persona> listarPersonas();
	public Persona recuperarPersona(Persona persona);
	public void agregarPersona(Persona persona);
	public void modificarPersona(Persona persona);
	public void eliminarPersona(Persona persona);
}
