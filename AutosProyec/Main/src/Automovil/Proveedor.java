package Automovil;

import java.util.List;

public class Proveedor {

	    private List<String> productosSuministrados;
	    private String direccion;
	    private String contacto;

	    public Proveedor(List<String> productosSuministrados, String direccion, String contacto) {
	        this.productosSuministrados = productosSuministrados;
	        this.direccion = direccion;
	        this.contacto = contacto;
	    }

	    public List<String> getProductosSuministrados() {
	        return productosSuministrados;
	    }

	    public String getDireccion() {
	        return direccion;
	    }

	    public String getContacto() {
	        return contacto;
	    }
	}
