package Automovil;

import java.util.List;

public class EmpresaTesla {

	    private String nombre;
	    private String direccion;
	    private String industria;
	    private List<Automovil> automoviles;
	    private List<Empleado> empleados;
	    private List<Cliente> clientes;
	    private List<Proveedor> proveedores;

	    public EmpresaTesla(String nombre, String direccion, String industria, List<Automovil> automoviles,
	                        List<Empleado> empleados, List<Cliente> clientes, List<Proveedor> proveedores) {
	        this.nombre = nombre;
	        this.direccion = direccion;
	        this.industria = industria;
	        this.automoviles = automoviles;
	        this.empleados = empleados;
	        this.clientes = clientes;
	        this.proveedores = proveedores;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public String getDireccion() {
	        return direccion;
	    }

	    public String getIndustria() {
	        return industria;
	    }

	    public List<Automovil> getAutomoviles() {
	        return automoviles;
	    }

	    public List<Empleado> getEmpleados() {
	        return empleados;
	    }

	    public List<Cliente> getClientes() {
	        return clientes;
	    }

	    public List<Proveedor> getProveedores() {
	        return proveedores;
	    }
	}


