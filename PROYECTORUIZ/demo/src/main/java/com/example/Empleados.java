public class Empleados {
    private String nombre = "";
    private int edad;

    public Empleados( String nombre, int edad){
        super();
        this.nombre = nombre;
        this.edad = edad;
    }
    public String getNombre(){
    return nombre;
    }
    public void setNombre(String nombre){
        nombre = nombre;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad( int edad){
        edad = edad
    }
}