package tienditamusic;

/** La clase producto representa una abstracción de las características que se requieren conocer de un producto en venta.
  */

public class Producto {
    /** Atributos de la clase Producto
     * El atributo entero id identifica al objeto Producto con el fin de diferenciarlo respecto a los demás elementos de la colección que lo contiene, con el fin de facilitar los procesos de búsqueda.
     * El atributo nombre es una cadena que contiene el nombre o nombre de etiqueta del producto.
     * El atributo precio es un primitivo double que almacena el precio del producto. En especial, este es el atributo más susceptible a cambios.
     * El atributo descripción es una cadena que almacena detalles sobre aspectos del concepto del producto, idealmente aspectos cualitativos.
      */
    private int id;
    private String nombre;
    private double precio;
    private String descripcion;
    
    /** Constructores de la clase Producto.
      * El primer constructor inicializa la instancia con valores neutrales, 0 y null.
      * El segundo constructor inicializa los atributos con los valores que recibe por parámetro.
          *@parameters
          * El parámetro id se define como valor a la variable id de identificación que utilizará la instancia para singularizarse.
          * El parámetro nombre se define para el atributo del mismo nombre de identificación: "nombre".
          * De la misma manera, el parámetro precio y descripción se utilizan para definir los atributos del mismo nombre de identificacion.
      */
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
    
    /** Métodos Getter y Setter.
      */
    
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
