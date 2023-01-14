package entidades;

public abstract class Persona {

    protected String nombre;
    protected String apellido;

    public Persona() {
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public abstract void Saludar();

    public void MostrarDatos(){

        System.out.println("Mi nombre es: " + nombre +  " - Apellido: " + apellido);
    }


}
