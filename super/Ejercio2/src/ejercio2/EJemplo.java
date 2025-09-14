package ejercio2;

public class EJemplo {

    public static void main(String[] args) {
        Animal A = new Animal("Carnivor");
        Pez P = new Pez("Pez", "Agua Salada");

        System.out.println("Informacion del Animal:");
        A.MostrarEspecie();

        System.out.println("Informacion del Pez:");
        P.MostrarEspecie();
    }
}

