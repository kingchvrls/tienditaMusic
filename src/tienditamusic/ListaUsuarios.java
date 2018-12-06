/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienditamusic;

import java.io.BufferedReader;
import java.io.File;
import java.util.*;

/**
 *
 * @author EDU
 */
public class ListaUsuarios{
	
    /** El atributo listaUsuarios es una colección de tipo ArrayList que contiene a las instancias de clase Usuario y aplica los métodos propios de la clase ArrayList para manipular sus elementos. 
     */
    private ArrayList<Usuario> listaUsuarios;
	
    public ListaUsuarios() {
        listaUsuarios = new ArrayList <Usuario> ();		
    } 
    /** A continuación se encuentran los métodos de la clase.
    */
	
        /** El método agregarUsuario recibe por parámetro una referencia a objeto de Clase Usuario.
	 *  Añade la referencia en la posición final dentro de la colección.
	 *  Retorna un valor boolean.
	 */
    public boolean agregarUsuario(Usuario u) {
	return listaUsuarios.add(u);	
    }
	
	/** El segundo método de nombre de identificación: "agregarUsuario", recibe por parámetro 4 valores de tipos respectivamente 
	    correspondientes con los tipos de los atributos de la clase.
	 *  El objeto referenciado por u se instancia con los valores entregados por parámetro.
	 *  Una vez inicializada, la instancia es añadida en la posición final de la colección.
	 *  Finalmente, el método retorna nada.
	 */	
    public void agregarUsuario(String user, String pass, int id, int tipo){
        Usuario u = new Usuario(user, pass, id, tipo);
        listaUsuarios.add(u);
    }
	
        /** El método eliminarUsuario recibe por parámetro una referencia a un objeto de clase Usuario.
	 *  El método verifica si en la colección existe alguna referencia a algún objeto con el mismo valor del atributo id.
	 *  Si lo encuentra, elimina dicha instancia y luego la retorna
	 */
    public Usuario eliminarUsuario (Usuario u) {
	for(int i=0;i<listaUsuarios.size();i++) {
            if(listaUsuarios.get(i).getIdUsuario()==u.getIdUsuario()) {
	    return listaUsuarios.remove(i);
	    }
	}
	return null;
    }
	
	/** El método editarUsuario recibe por parámetro una referencia a un objeto de clase Usuario.
	 *  El método busca en la colección alguna instancia con atributo id equivalente al atributo id de la instancia recibida por parámetro.
	 *  Si encuentra alguna equivalencia, elimina la instancia yacente en la colección y luego añade la recientemente recibida.
	 *  Finalmente retorna un valor boolean, donde este valor es true si se añadió la nueva instancia, o false en caso contrario.
	 */
    public boolean editarUsuario (Usuario u) {
	for(int i=0;i<listaUsuarios.size();i++) {
	    if(listaUsuarios.get(i).getIdUsuario()== u.getIdUsuario()) {
	        listaUsuarios.remove(i);
		listaUsuarios.add(u);
		return true;
	    }
	}
	return false;
    }
	/** El método buscarUsuario recibe por parámetro una cadena de nombre de identificación: user.
	  * Se busca en la colección alguna instancia Usuario cuyo atributo de nombre de usuario sea equivalente a user.
	  * Si encuentra alguna, el método retorna esa instancia Usuario.
	  */
    public Usuario buscarUsuario (String user){
        for (int i=0; i<listaUsuarios.size(); i++){
	    if(listaUsuarios.get(i).getNombreUsuario().equals(user)){
		return listaUsuarios.get(i);
	    }               
        }
        return null;
    }
	
        /** El método buscarUsuario que recibe como parámetro una instancia de clase Usuario, a diferencia del método anterior,
	    compara las instancias y no los nombres seudonimos de usuario.
	  * Si encuentra la instancia equivalente, este método retorna true, en caso contrario, false.
	  */
    public boolean buscarUsuario(Usuario u){
        for(int i=0; i<listaUsuarios.size(); i++){
	    if(listaUsuarios.get(i).equals(u)==true){
	        return true;
	    }
        }
        return false;
    }
	
	/** El método getUser recibe por parámetro un primitivo de tipo entero.
	 *  Busca la instancia en la posición del entero, en la colección.
	 *  Finalmente retorna la instancia ubicada en dicha posición.
	 */
    public Usuario getUser(int i){
        return listaUsuarios.get(i);
    }     
}
