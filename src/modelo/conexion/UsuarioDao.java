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
        System.out.println("_RESGISTRANO DATOS..._ REMOTA DB");
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
        System.out.println("_Guardando Localmente..._ LOCAL");
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
        return resultado+";";
     } 
    public static Object[] bi_regristro_consultar(String act){     
        System.out.println("_consultando..._ CS");
            Object [] data = new Object[1];            
            int total=0, m=0, f=0;
            try {
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
                int n = 0, size =0;
                while(rs.next()){ size++;}
                
                  if(act == "grafico"){ data = new Object[3];}
                  else{
                data = new Object[size];}
                  
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

      public Object[] bi_usuario_datos(String id){
        System.out.println("_consultado los datos_  USUARIO=TRAER");
         Object [] data = new Object[3];
         try {
            Connection connection = null;
            CallableStatement cStmt = null;
            Conexion conexxion = new  Conexion();
            
            String estadoConexion = (conexxion.EstadoConexion());
            if ("error".equals(estadoConexion)){
                System.out.println("NO hay conexion en BD");
                return  data;
            }else{
                connection = conexxion.getConnection();
               
                cStmt = connection.prepareCall("{call bi_usuario_cs (?) }");
                cStmt.setString(1, id);
                
                cStmt.getResultSet();
                cStmt.execute();
                ResultSet rs = null;
                
                rs = cStmt.getResultSet(); 
                int x=0;                
               while(rs.next()){ 
                  /* System.out.println(" resultado : "+ rs.getString("nombre")
                        +","+ rs.getString("sexo")
                        +","+rs.getString("carrera"));*/                    
                    data[0] = rs.getString("nombre").trim();
                    data[1] = rs.getString("sexo").trim();
                    data[2] = rs.getString("carrera").trim();
                    
                }
                } return data;
            }catch (SQLException ex) {
                ex.printStackTrace();    
               return data;  
            }
    }

} 