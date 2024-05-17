
/**
 * 
 * @author (Heidelberg Gelvez - 1152394)
 */
public class Animal{
    //atributos
    private int identificador;
    private String nombre;
    private double peso;
    private Tipo tipo;
    private Fecha fechaNacimiento;
    
    //constructor
    public Animal(int identificador, String nombre, double peso, Tipo tipo, Fecha fechaNacimiento){
        this.identificador = identificador;
        this.nombre = nombre;
        this.peso = peso;
        this.tipo = tipo;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public Animal(){
        this.identificador = 1231;
        this.nombre = "Pepa";
        this.peso = 125;
        this.tipo = Tipo.VACA;
    }
    
    //getters and setters
    public int getIdentificador(){
        return identificador;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public double getPeso(){
        return peso;
    }
    
    public Tipo getTipo(){
        return tipo;
    }
    
    public Fecha getFechaNacimiento(){
        return fechaNacimiento;
    }
    
    public void setIdentificador(int identificador){
        this.identificador = identificador;
    }
    
    public void setiNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setPeso(double peso){
        this.peso = peso;
    }
    
    public void setTipo(Tipo tipo){
        this.tipo = tipo;
    }
    
    public void setFechaNacimiento(Fecha fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public void calcularEdad(){
        int edad;
        edad = 2024-fechaNacimiento.getAño();
        System.out.println("La edad de " +getNombre() + " es: " +edad +" años");
    }
    
}