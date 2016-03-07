package modelo.conexion;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.sql.*;
public class Conexion {

	private String nombreBd="biblioteca";
	private String usuario="test";
	private String password="test";
        private String host="162.243.118.190";
	//private String url="jdbc::mysql://localhost/"+nombreBd;
	//private String url="jdbc:mysql://localhost:3306/"+nombreBd;
       // private String url="jdbc:mysql://45.55.198.111:3306/"+nombreBd;
	
        private String url="jdbc:mysql://"+host+":3306/"+nombreBd;
	          
	Connection conn=null;
	//correo morenoannamae@gmail.com 60910972
    static String Estado = "";

	//contructor de la clase
	public Conexion(){
            boolean ping = false;
            String reachableIP = "127.0.0.1";
            String unreachableIP = host;
            int connTimeout = 1000;
            long duration = 0;        
            try {
                duration = System.currentTimeMillis();            
                new Socket().connect(new InetSocketAddress(unreachableIP, 3306), connTimeout);
               
            }
            catch (Exception e) {
                duration = System.currentTimeMillis() - duration;           
                System.out.println("\t***Duración intento de conexión mide en ms:" + duration);
                System.out.println("\t***"+e.getMessage());
                this.Estado = "Sin Exito";
                ping=true;
            }
            if(ping){
                //System.out.println("Prueba de ping No superada");
                this.Estado = "error";            
            } else{
                    // si el servidor tenemos conexion 
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
