package Automovil;

public class Empleado {

	    private String cargo;
	    private double sueldo;
	    private String horasTrabajadas;
	    private String dependencia;

	    public Empleado(String cargo, double sueldo, String horasTrabajadas, String dependencia) {
	        this.cargo = cargo;
	        this.sueldo = sueldo;
	        this.horasTrabajadas = horasTrabajadas;
	        this.dependencia = dependencia;
	    }

	    public String getCargo() {
	        return cargo;
	    }

	    public double getSueldo() {
	        return sueldo;
	    }

	    public String getHorasTrabajadas() {
	        return horasTrabajadas;
	    }

	    public String getDependencia() {
	        return dependencia;
	    }
	}