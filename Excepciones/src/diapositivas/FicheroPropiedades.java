package diapositivas;

import java.util.ResourceBundle;

public class FicheroPropiedades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResourceBundle configuracion = ResourceBundle.getBundle("configuracion.properties");
		String usuario = configuracion.getString("login");
		String password = configuracion.getString("clave");
		System.out.println("valores obtenidos:"+usuario+"--"+password);
	}

}
