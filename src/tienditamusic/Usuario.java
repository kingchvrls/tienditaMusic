package tienditamusic;

/** La clase Usuario es una abstracción que representa el concepto de asociación de los clientes con la aplicación, así también como del personal de atención
    al cliente y el/los administradores.
 */

public class Usuario extends Persona 
{

       /** Atributos.
	 * El primer atributo: username, contiene el seudónimo o alias que utilizará el usuario para registrarse y acceder al software.
	 * El segundo atributo: password, contiene la contraseña que utilizará el usuario.
	 * El atributo id es un identificador para permitir la búsqueda fácil dentro de la colección de las instancias Usuario.
	 * El atributo tipo indica la categoría de usuario a la que representa la información de la instancia, para cliente, tipo tiene el valor 1, para vendedor el valor 2 y para administrador el valor 3.
	  */
	private String username;
	private String password;
	private int id;
        private int tipo;

	/** Constructores.
	 * El primer constructor solamente inicializa los valores de los atributos heredados de la clase padre de la instancia.
	 * El segundo constructor inicializa los atributos de la clase padre y los propios de la clase Usuario.
	     *@parameters El segundo constructor recibe por parámetros todos los valores necesarios para definir la totalidad de los atributos.
	 * El tercer constructor solamente inicializa los atributos no heredados, es decir, los que 4 atributos que son propios de la clase Usuario.
	     *@parameters El tercer constructor recibe por parámetros los 4 valores para definir los 4 respectivos atributos.
	 */
	 
	public Usuario() {
		super();
	}
	public Usuario(int id, String nombre, String rut, String telefono, String correo, String password, String username) {
		super(nombre, rut, telefono, correo);
                this.username = username;
                this.password = password;
		this.id = id;
	}
        public Usuario (String user, String pass, int id,int tipo ){
            username=user;
            password=pass;
            this.id=id;
            this.tipo=tipo;
        }
		
	/**
	 * A continuación se encuentran los Métodos Getter y Setter.
	 */
	public String getNombreUsuario() {
		return username;
	}
	
        public void setNombreUsuario(String username) {
		this.username = username;
	}
	
	public int getIdUsuario() {
		return id;
	}
	
        public void setIdUsuario(int id) {
		this.id = id;
	}
        
       	public String getContraseña() {
		return password;
	}
	
        public void setContraseña(String password) {
		this.password = password;
	}	
        public int getId(){
            return id;
        }
        public void setId(int id){
            this.id=id;
        }
        public int getTipo(){
            return tipo;
        }
        public void setTipo(int tipo){
            this.tipo=tipo;
        }
}
