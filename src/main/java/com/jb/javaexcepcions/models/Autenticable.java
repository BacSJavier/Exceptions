package src.main.java.com.jb.javaexcepcions.models;

public interface Autenticable {
	
	public void setClave(String clave);
	
	public boolean iniciarSesion(String clave);

}
