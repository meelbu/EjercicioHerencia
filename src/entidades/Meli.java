package entidades;

public class Meli extends Persona {

    protected int edad;

    public Meli() {
    }

    public Meli(int edad) {
        this.edad = edad;
    }

    public Meli(String nombre, String apellido, int edad) {
        super(nombre, apellido);
        this.edad = edad;
    }

    @Override
    public void Saludar() {
        System.out.println("Hasta mañana!");
    }

    @Override
    public void MostrarDatos() {
        super.MostrarDatos();
    }
}
