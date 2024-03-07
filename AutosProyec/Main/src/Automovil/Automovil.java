package Automovil;

public class Automovil {
    private String marca;
    private String modelo;
    private String motorYPropulsion;
    private String dise�o;
    private String seguridadYTecnologia;

    /**
     * Constructor de la clase Automovil.
     *
     * @param marca                La marca del autom�vil.
     * @param modelo               El modelo del autom�vil.
     * @param motorYPropulsion    El tipo de motor y propulsi�n del autom�vil.
     * @param dise�o               El dise�o del autom�vil.
     * @param seguridadYTecnologia  Las caracter�sticas de seguridad y tecnolog�a del autom�vil.
     */
    public Automovil(String marca, String modelo, String motorYPropulsion, String dise�o, String seguridadYTecnologia) {
        this.marca = marca;
        this.modelo = modelo;
        this.motorYPropulsion = motorYPropulsion;
        this.dise�o = dise�o;
        this.seguridadYTecnologia = seguridadYTecnologia;
    }

    /**
     * Obtiene la marca del autom�vil.
     *
     * @return La marca del autom�vil.
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Obtiene el modelo del autom�vil.
     *
     * @return El modelo del autom�vil.
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Obtiene el tipo de motor y propulsi�n del autom�vil.
     *
     * @return El tipo de motor y propulsi�n del autom�vil.
     */
    public String getMotorYPropulsion() {
        return motorYPropulsion;
    }

    /**
     * Obtiene el dise�o del autom�vil.
     *
     * @return El dise�o del autom�vil.
     */
    public String getDise�o() {
        return dise�o;
    }

    /**
     * Obtiene las caracter�sticas de seguridad y tecnolog�a del autom�vil.
     *
     * @return Las caracter�sticas de seguridad y tecnolog�a del autom�vil.
     */
    public String getSeguridadYTecnologia() {
        return seguridadYTecnologia;
    }
}