package tienditamusic;

import java.io.IOException;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * Clase que representa un track de disco, la maneja ListaTracks
 * 
 * @author Carlos Cubillos
 * @author Tomás Rojas
 * @see ListaTracks
 * @see MapaDiscos
 */
public class Track {
    private int id;
    private final SimpleIntegerProperty idProp;
    private String titulo;
    private final SimpleStringProperty nameProp;
    private String genero;
    private final SimpleStringProperty genreProp;
    private int tiempo;
    private final SimpleIntegerProperty timeProp;

    public Track(int id, String titulo, String genero, int tiempo) {
        this.id = id;
        idProp = new SimpleIntegerProperty(id);
        this.titulo = titulo;
        nameProp = new SimpleStringProperty(titulo);
        this.genero = genero;
        genreProp = new SimpleStringProperty(genero);
        this.tiempo = tiempo;
        timeProp = new SimpleIntegerProperty(tiempo);
    }

    public Track() {
        id = 0;
        titulo = null;
        genero = null;
        tiempo = 0;
        nameProp = new SimpleStringProperty("");
        genreProp = new SimpleStringProperty("");
        timeProp = new SimpleIntegerProperty(0);
        idProp = new SimpleIntegerProperty(0);
    }

    public int getId() {
        return id;
    }
    public void setId(String id) throws IOException{
        try{
            int ident = Integer.parseInt(id);
            if(ident<0) throw new IOException();
            this.id = ident;
        }
        catch (NumberFormatException e) {
            throw new IOException();
        }
    }
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getTiempo() {
        return tiempo;
    }
    public void setTiempo(String tiempo) throws IOException{
        try{
            int time = Integer.parseInt(tiempo);
            if(time<0) throw new IOException();
            this.tiempo = time;
        }
        catch (NumberFormatException e) {
            throw new IOException();
        }
    }    
    public void setTiempo(int tiempo){
        this.tiempo = tiempo;
    }
    
    public String getName(){
        return nameProp.get();
    }
    public void setName(String name){
        nameProp.set(name);
    }
    
    public String getGeneroProp(){
        return genreProp.get();
    }
    public void setGeneroProp(String name){
        genreProp.set(name);
    }
    
    public Integer getTimeProp(){
        return timeProp.get();
    }
    public void setTimeProp(Integer time){
        timeProp.set(time);
    }
    
    public Integer getIdProp(){
        return idProp.get();
    }
    public void setIdProp(Integer id){
        idProp.set(id);
    }
}
