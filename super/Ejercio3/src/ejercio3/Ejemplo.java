
package ejercio3;


class Animal {
    private String Especie;

    public Animal(String Especie) {
        this.Especie = Especie;
    }

    public void MostrarEspecie() {
        System.out.println("Especie: " + Especie);
    }
}

class Pez extends Animal {
    private String TipoDeAgua;

    public Pez(String Especie, String TipoDeAgua) {
        super(Especie);
        this.TipoDeAgua = TipoDeAgua;
    }

    @Override
    public void MostrarEspecie() {
        super.MostrarEspecie();
         System.out.println("Especie directa: " + super.Especie);

        System.out.println("Tipo de agua: " + TipoDeAgua);
    }
}
public class Ejemplo {

public static void main(String[] args) {
        

        Animal A = new Animal("Carnivoro");
        Pez P = new Pez("Pez", "Agua Salada");

        A.MostrarEspecie();
        P.MostrarEspecie();
         System.out.println(super.toString());
    }
}