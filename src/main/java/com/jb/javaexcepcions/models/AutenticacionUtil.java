package src.main.java.com.jb.javaexcepcions.models;

public class AutenticacionUtil {

	private String clave;
	
	public boolean iniciarSesion(String clave) {
		return this.clave == clave;
	}
	
	public void setClave(String clave) {
		this.clave = clave;
	}
	
}
