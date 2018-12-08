package tienditamusic;

import java.util.Calendar;

/**
 * Clase primitiva, extiende de Producto, es manejada por MapaDiscos
 * @author Carlos Cubillos
 * @author Tomás Rojas
 * @see Producto
 * @see MapaDiscos
 */
 
public class Disco extends Producto {
    /**Atributos.
     * "autor" contiene el nombre del artista del disco.
     * "tracks" contiene una cifra que corresponde al número total de canciones o pistas musicales que contiene el disco.
     * "tiempo" contiene el tiempo total, en unidad de minutos, que suman juntas todas las pistas del del Disco.
     * "listaTracks" es una variable de referencia a una instancia ListaTracks, que es una colección donde se contiene y maneja
       todas las pistas que contiene el título del disco.
     */
    private String autor;
    private int tracks;
    private int tiempo;
    private Calendar fechaLanzamiento;
    private ListaTracks listaTracks;
    
    /**Constructor.
     * La clase solo posee 1 constructor.
     * @param El constructor recibe todos los valores necesarios para inicializar cada uno de sus atributos.
     * Los atributos que son heredados desde la clase padre también son inicializados con el método super(), en la sentencia 33.
     */
    public Disco(String autor, int tracks, int tiempo, Calendar fechaLanzamiento, int id, String nombre, double precio, String descripcion) {
        super(id, nombre, precio, descripcion);
        this.autor = autor;
        this.tracks = tracks;
        this.tiempo = tiempo;
        this.fechaLanzamiento = fechaLanzamiento;
    }
    
    /**
     * Métodos Getter y Setter.
     */
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getTracks() {
        return tracks;
    }
    public void setTracks(int tracks) {
        this.tracks = tracks;
    }
    public int getTiempo() {
        return tiempo;
    }
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    public Calendar getFechaLanzamiento() {
        return fechaLanzamiento;
    }
    public void setFechaLanzamiento(Calendar fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }
}
