package Automovil;

public class Cliente {

	    private String nombresCompletos;
	    private String presupuesto;
	    private String direccion;
	    private String contacto;

	    public Cliente(String nombresCompletos, String presupuesto, String direccion, String contacto) {
	        this.nombresCompletos = nombresCompletos;
	        this.presupuesto = presupuesto;
	        this.direccion = direccion;
	        this.contacto = contacto;
	    }

	    public String getNombresCompletos() {
	        return nombresCompletos;
	    }

	    public String getPresupuesto() {
	        return presupuesto;
	    }

	    public String getDireccion() {
	        return direccion;
	    }

	    public String getContacto() {
	        return contacto;
	    }
	}