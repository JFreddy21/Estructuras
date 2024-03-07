package Automovil;

public class Main {
    public static void main(String[] args) {
        // Aquí puedes crear instancias de Automovil y realizar operaciones según sea necesario
        Automovil automovil1 = new Automovil("Tesla", "Model S", "Eléctrico", "Sedán", "Autopilot");
        // Puedes acceder a los atributos de automovil1 utilizando los métodos getter
        System.out.println("Marca: " + automovil1.getMarca());
        System.out.println("Modelo: " + automovil1.getModelo());
        System.out.println("Motor y Propulsión: " + automovil1.getMotorYPropulsion());
        System.out.println("Diseño: " + automovil1.getDiseño());
        System.out.println("Seguridad y Tecnología: " + automovil1.getSeguridadYTecnologia());
    }
}