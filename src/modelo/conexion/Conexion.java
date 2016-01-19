package modelo.conexion;
import java.sql.*;
public class Conexion {

	private String nombreBd="biblioteca";
	private String usuario="maryon";
	private String password="best1995";
	//private String url="jdbc::mysql://localhost/"+nombreBd;
	private String url="jdbc:mysql://localhost:3306/"+nombreBd;
	
	Connection conn=null;
	//correo morenoannamae@gmail.com 60910972
    private String Estado = "";

	//contructor de la clase
	public Conexion(){
	try {	
		// para obtener el driver
		Class.forName("com.mysql.jdbc.Driver");	
		
		// obtener la conexion
		conn=DriverManager.getConnection(url,usuario,password);
		this.Estado = "Sin Exito";
		if(conn != null) {
			System.out.println("Conexion Exitosa a la BD: "+nombreBd);
                         this.Estado = "Exitosa";
                }
	}catch(ClassNotFoundException e) {
		System.out.println("ocurre una ClassNotFoundException"+e.getMessage());
		 this.Estado = "error";
	} catch (SQLException e) {
		System.out.println("ocurre una SQLException "+e.getMessage());
                 this.Estado = "error";
        }
	}
	public Connection getConnection(){
		return conn;
	}
        public  String EstadoConexion(){
            return  this.Estado;
        }
	public void deconectar() {
		conn= null;
	}
	public static void main(String[] args){
		Conexion con = new Conexion();
		con.getConnection();
                System.out.println(con.EstadoConexion());
	}
}
