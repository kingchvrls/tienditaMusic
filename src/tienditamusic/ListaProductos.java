package tienditamusic;

import java.util.ArrayList;

/**
 * Tiene una colección ArrayList de Productos y una instancia de MapaDiscos.
 * 
 * @author Carlos Cubillos
 * @author Tomás Rojas
 * @see Producto
 * @see MapaDiscos
 * @see VentanaAdministrarProductos
 */

public class ListaProductos {
    /**
     * El ArrayList listaProducto almacena y maneja las instancias Producto.
     */
    private final ArrayList <Producto> listaProductos;
    /**
     * Posee una instancia de MapaDiscos, para mantener la encapsulación.
     */
    private final MapaDiscos mapaDiscos;

    public ListaProductos() {
        listaProductos=new ArrayList<>();
        mapaDiscos = new MapaDiscos();
    }

    /**
     * Agrega un Producto al ArrayList listaProductos.
     * 
     * @param p 
     * @return Retorna true si funciona y false en caso de fallar.
     */
    public boolean agregarProducto(Producto p) {
        return listaProductos.add(p);
    }
    
    /**
     * Busca por ID un Producto y lo elimina de listaProductos .
     * 
     * @param id
     * @return Retorna el Producto eliminado, de falla retorna null
     */
    public Producto eliminarProducto(int id) {
        for(int i=0;i<listaProductos.size();i++) {
            if(listaProductos.get(i).getId()==id) {
                    return listaProductos.remove(i);
            }
        }
        return null;
    }
    
    /**
     * Busca y edita (Reemplaza) un Producto de listaProductos
     * 
     * @param p es una 
     * @return Retorna true si el Producto se encontró y modificó, false en caso contrario.
     */
    public boolean editarProducto(Producto p) {
        for(int i=0;i<listaProductos.size();i++) {
            if(listaProductos.get(i).getId()==p.getId()){				 
                listaProductos.remove(i);
                listaProductos.add(i, p);
                return true;
            }
        }
        return false;
    }

    /**
     * Busca un Producto en listaProductos y lo retorna.
     * 
     * @param Cadena que contiene el nombre del producto que se desea buscar.
     * @return Retorna la instancia Producto buscada en caso de encontrarla, de no ser así retorna null.
     */
    public Producto buscarProducto(String nombre){
        for(int i=0;i<listaProductos.size();i++){
            if(listaProductos.get(i).getNombre().equals(nombre)==true){
                return listaProductos.get(i);
            }
        }
        return null;
    }
    
    /**
     * Busca una instancia Producto en listaProductos e indica si esta existe o no en la colección.
     * @param p es una referencia a instancia de clase Producto.
     * @return True si el Producto se encuentra en listaProductos, false en el caso contrario.
     */
    public boolean buscarProducto(Producto p){
        for (int i=0;i<listaProductos.size();i++){
            if(listaProductos.get(i).equals(p)==true){
                return true;
            }
        }
        return false;
    }
}
