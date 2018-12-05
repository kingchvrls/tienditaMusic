package tienditamusic;

public class Producto {
    private int id;
    private String nombre;
    private double precio;
    private String descripcion;
    
    public Producto(){
        id = 0;
        nombre = null;
        precio = 0;
        descripcion = null;
    }
    
    public Producto(int id, String nombre, double precio, String descripcion){
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public void setPrecio(double precio){
        this.precio = precio;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
    
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
}
