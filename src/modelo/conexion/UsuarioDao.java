package modelo.conexion;

import java.sql.*;

import controladores.Coordinador;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import modelo.UsuarioVo;

public class UsuarioDao {
    private Coordinador micoordinador;
    public void setCoordinador(Coordinador miCoordinador) {
		this.micoordinador = miCoordinador;
	}
   
    public String registraUsuario(UsuarioVo miUsuarioVo){
		String resultado="";
		
		Connection  connection= null;
		Conexion conexxion = new Conexion();
		PreparedStatement preStatement = null;
		
                resultado = (conexxion.EstadoConexion());
                if(resultado == "error"){
                    System.out.println("no hay conexion");
                     return resultado + "bd"; 
                }
              
		connection=conexxion.getConnection();
		String consulta= "INSERT INTO registro (fechahora  , nombre, cedula, sexo, carrera)"+
                                                            "VALUES(?,?,?,?,?)";
		
		try {
			preStatement = connection.prepareStatement(consulta);
			preStatement.setString(1, miUsuarioVo.getFechahora());
			preStatement.setString(2,miUsuarioVo.getNombre());
			preStatement.setString(3,miUsuarioVo.getCedula());
			preStatement.setString(4,miUsuarioVo.getSexo());
			preStatement.setString(5,miUsuarioVo.getCarrera());
			preStatement.execute();
			
			return resultado="ok";
			
		} catch (SQLException e) {
			System.out.println("No Se pudo registar el dato: "+e.getMessage());
			return resultado="error";
		}
	}
        
    public String RegistrarFueraLinea(UsuarioVo miUsuarioVo) {
     ArrayList<String> lista = new ArrayList<String>();
        lista.add((miUsuarioVo.getFechahora()));
        lista.add(",");
        lista.add((miUsuarioVo.getNombre()));
        lista.add(",");
        lista.add((miUsuarioVo.getCedula()));
        lista.add(",");
        lista.add((miUsuarioVo.getSexo()));
        lista.add(",");
        lista.add((miUsuarioVo.getCarrera()));
        Iterator<String> nombreIterator = lista.iterator();
       String resultado = "", elemento = null;
        while(nombreIterator.hasNext()){
                elemento = nombreIterator.next();
                resultado += elemento+"";               
        }
      
        System.out.println("en usuario veo"+resultado);
        return resultado+";";
     } 
    public static Object[] bi_regristro_consultar(String act){            
            Object [] data = null;            
            int total=0, m=0, f=0;
            try {
                
                System.out.println("consultando...");
                Connection  connection= null;
                CallableStatement cStmt = null;
                Conexion conexxion = new Conexion();
                String resultado = (conexxion.EstadoConexion());
                if(resultado == "error"){
                     JOptionPane.showMessageDialog(null,"Consulta No Disponible\n No Hay Conexion A la Base de Datos ","No Conectada",JOptionPane.WARNING_MESSAGE);
           
                    System.out.println("no hay conexion");
                    
                    //return resultado + "bd"; 
                }else{
                   // micoordinador._bi_registro_up();                   
                                  
                connection=conexxion.getConnection();
                cStmt = connection.prepareCall("{call bi_registro_cs()}");
                cStmt.execute(); 
                cStmt.getResultSet();  
                ResultSet rs = null;
                ResultSet  r = null;
                rs = cStmt.getResultSet(); 
                r =cStmt.getResultSet();
                int n = 0;
                  if(act == "grafico"){ data = new Object[3];}
                  else{
                data = new Object[100];}
                Object fila =null;
                while(rs.next()){ 
                    if(act == "grafico"){
                        String sex= ""+rs.getString("sexo");
                        if( "masculino".equals(sex)){
                            m++;
                        }else{
                            f++;
                            System.out.println(rs.getString("sexo"));
                        }
                        total++;
                    }else{
                        fila= rs.getString("fechahora") ;
                        fila +=","+ rs.getString("nombre");
                        fila +=","+ rs.getString("cedula");
                        fila +=","+ rs.getString("sexo");
                        fila +=","+rs.getString("carrera");
                        data[n]= fila;
                         n++;   
                     }  
                }
                if(act == "grafico"){
                 data[0]=total;
                 data[1]=m;
                 data[2]=f;
                 }
                }
                 
                  return data; 
            } catch (SQLException e) {
			System.out.println("No Se pudo Realizar la consulta revisar el dato: "+e.getMessage());
			
		}
             return data;
        }
}
     
//    public UsuarioVo consultarUsuario(String doc) {
//      System.out.println("consultando...");
//        Connection connection = null;
//        Conexion miConexion= new Conexion();
//        PreparedStatement statement = null;
//        ResultSet result = null;
//        
//        UsuarioVo  miUsuario=null;
//        
//        connection=miConexion.getConnection();
//        // verificar o averiguar la linea de 62 del video
//        String consulta="SELECT * FROM usuario where documento= "+doc;        
//            try {
//
//               // String consulta="SELECT * FROM usuario WHERE documento="+doc;
//                statement=connection.prepareStatement(consulta);
//               // statement.setString(1,doc);
//                
//                result = statement.executeQuery();
//                
//                while(result.next() == true){
//                	System.out.println("documento: "+result.getString("documento")
//        			 		+"nombre: "+result.getString("nombre")
//        	 				+"profesion: "+result.getString("profesion")
//		                	+"edad: "+result.getInt("edad")
//		                	+"direccion: "+result.getString("direccion")
//		                	+"telefono: "+result.getString("telefono"));                     
//         
//                   miUsuario= new UsuarioVo();
//                   
//                   miUsuario.setDocumento(result.getString("documento"));
//                   miUsuario.setNombre(result.getString("nombre"));
//                   miUsuario.setProfesion(result.getString("profesion"));
//                   miUsuario.setEdad(result.getInt("edad"));
//                   miUsuario.setDireccion(result.getString("direccion"));
//                   miUsuario.setTelefono(result.getString("telefono"));
//                   
//                }
//            } catch (SQLException e) {
//            
//                System.out.println("Error en la consulta del Usuario: "+e.getMessage());
//            }
//        
//    return miUsuario;
//    }

