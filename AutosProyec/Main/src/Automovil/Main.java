package Automovil;

public class Main {
    public static void main(String[] args) {
        // Aqu� puedes crear instancias de Automovil y realizar operaciones seg�n sea necesario
        Automovil automovil1 = new Automovil("Tesla", "Model S", "El�ctrico", "Sed�n", "Autopilot");
        // Puedes acceder a los atributos de automovil1 utilizando los m�todos getter
        System.out.println("Marca: " + automovil1.getMarca());
        System.out.println("Modelo: " + automovil1.getModelo());
        System.out.println("Motor y Propulsi�n: " + automovil1.getMotorYPropulsion());
        System.out.println("Dise�o: " + automovil1.getDise�o());
        System.out.println("Seguridad y Tecnolog�a: " + automovil1.getSeguridadYTecnologia());
    }
}