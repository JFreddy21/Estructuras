package Automovil;

public class Automovil {
    private String marca;
    private String modelo;
    private String motorYPropulsion;
    private String diseño;
    private String seguridadYTecnologia;

    /**
     * Constructor de la clase Automovil.
     *
     * @param marca                La marca del automóvil.
     * @param modelo               El modelo del automóvil.
     * @param motorYPropulsion    El tipo de motor y propulsión del automóvil.
     * @param diseño               El diseño del automóvil.
     * @param seguridadYTecnologia  Las características de seguridad y tecnología del automóvil.
     */
    public Automovil(String marca, String modelo, String motorYPropulsion, String diseño, String seguridadYTecnologia) {
        this.marca = marca;
        this.modelo = modelo;
        this.motorYPropulsion = motorYPropulsion;
        this.diseño = diseño;
        this.seguridadYTecnologia = seguridadYTecnologia;
    }

    /**
     * Obtiene la marca del automóvil.
     *
     * @return La marca del automóvil.
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Obtiene el modelo del automóvil.
     *
     * @return El modelo del automóvil.
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Obtiene el tipo de motor y propulsión del automóvil.
     *
     * @return El tipo de motor y propulsión del automóvil.
     */
    public String getMotorYPropulsion() {
        return motorYPropulsion;
    }

    /**
     * Obtiene el diseño del automóvil.
     *
     * @return El diseño del automóvil.
     */
    public String getDiseño() {
        return diseño;
    }

    /**
     * Obtiene las características de seguridad y tecnología del automóvil.
     *
     * @return Las características de seguridad y tecnología del automóvil.
     */
    public String getSeguridadYTecnologia() {
        return seguridadYTecnologia;
    }
}