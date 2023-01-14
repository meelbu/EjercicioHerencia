import entidades.Meli;

public class Main {
    public static void main(String[] args) {


        Meli meli = new Meli("Melina","González",30);
        System.out.println(meli);
        meli.MostrarDatos();
        meli.Saludar();

    }
}