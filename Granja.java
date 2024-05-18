import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author (Heidelberg Gelvez - 1152394)
 */
public class Granja {
    private List <Animal> animales;

    public static void main(String[] args) {
        Granja granja = new Granja();
        //fechas de nacimiento de los animales
        Fecha fechaAnimal1 = new Fecha(11, 2, 2017);
        Fecha fechaAnimal2 = new Fecha(12, 6, 2019);
        Fecha fechaAnimal3 = new Fecha(15, 11, 2010);
        Fecha fechaAnimal4 = new Fecha(7, 11, 2019);
        Fecha fechaAnimal5 = new Fecha(22, 6, 2018);
        //animales registrados
        Animal animal1 = new Animal (435, "Carol", 1.6, Tipo.GALLINA, fechaAnimal1);
        Animal animal2 = new Animal (342, "Cala", 700.5, Tipo.VACA, fechaAnimal2);
        Animal animal3 = new Animal (543, "Pepo", 215.7, Tipo.CERDO, fechaAnimal3);
        Animal animal4 = new Animal (633, "Vera", 2.3, Tipo.GALLINA, fechaAnimal4);
        Animal animal5 = new Animal (134, "Chamusa", 745.3, Tipo.VACA, fechaAnimal5);
        //añadir animales
        granja.añadirAnimales(animal1);
        granja.añadirAnimales(animal2);
        granja.añadirAnimales(animal3);
        granja.añadirAnimales(animal4);
        granja.añadirAnimales(animal5);
        //contar los animales por tipo
        int Gallinas = granja.contarAnimalesPorTipo(Tipo.GALLINA);
        int Vacas = granja.contarAnimalesPorTipo(Tipo.VACA);
        int Cerdos = granja.contarAnimalesPorTipo(Tipo.CERDO);
        //mostrar edad
        animal1.calcularEdad();
        animal2.calcularEdad();
        animal3.calcularEdad();
        animal4.calcularEdad();
        animal5.calcularEdad();
        //mostrar numero de animales por tipo
        System.out.println("");
        System.out.println("Numero de Gallinas: " + Gallinas);
        System.out.println("Numero de Vacas: " + Vacas);
        System.out.println("Numero de Cerdos: " + Cerdos);
        
    }
    
    public Granja() {
        animales = new ArrayList<>();
    }

    public void añadirAnimales(Animal animal) {
        animales.add(animal);
    }

    public int contarAnimalesPorTipo(Tipo tipo) {
        int n = 0;
        for (Animal animal : animales) {
            if (animal.getTipo() == tipo) n++;
        }
        return n;
    }
    
    //fin
}