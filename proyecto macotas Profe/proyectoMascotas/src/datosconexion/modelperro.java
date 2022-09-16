/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datosconexion;
import ClasesMascotas.*;
import com.mysql.cj.protocol.Resultset;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;     
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.LinkedList;
/**
 *
 * @author Esquivel_Cesar
 */
public class modelperro {
    conexion conex;
    
    //CONSTRUCTOR con un nuevo objeto para acceder a los parametros de la BD
    public modelperro(){
        this.conex = new conexion();
    }
     
    public boolean CrearMascota(clsPerro perro)
    {
        try(Connection con = DriverManager.getConnection(conex.getURL(), conex.getUser(), conex.getPassword()))
        {
            String query = "INSERT INTO mascota (codigo, nombre, anionac, color, estadosalud) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement estadomascota=  con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            estadomascota.setString(1, perro.getCodigo());
            estadomascota.setString(2, perro.getNombre());
            estadomascota.setInt(3, perro.getAnioNac());
            estadomascota.setString(4, perro.getColor());
            estadomascota.setString(5, perro.getEstadoSalud());
            int colinsertada = estadomascota.executeUpdate();
            if (colinsertada > 0)
            {
                ResultSet llavegenerada = estadomascota.getGeneratedKeys();
                if(llavegenerada.next())
                {
                    int codmascota = llavegenerada.getInt(1);
                    query = "INSERT INTO perro (raza, pedigree, id_mascota) VALUES (?,?,?)";
                    PreparedStatement estadoperro = con.prepareStatement(query);
                    estadoperro.setString(1, perro.getRaza());
                    estadoperro.setBoolean(2, perro.getPedigree());
                    estadoperro.setInt(3, codmascota);
                    colinsertada = estadoperro.executeUpdate();
                    if (colinsertada > 0)
                    {
                        return true;
                    }
                    
                }
                
            }
                    
            return false;
        }catch(SQLException e)
        {
           return false;
        }
    }
    
      public boolean EliminarMascota(clsPerro perro)
    {
       try(Connection con = DriverManager.getConnection(conex.getURL(), conex.getUser(), conex.getPassword()))
        {
            String queryDog = "DELETE FROM perro WHERE id_mascota = ?";
            PreparedStatement estadoperro = con.prepareStatement(queryDog);
            estadoperro.setInt(1, perro.getIdperro());
            
            //Aqui va el codigo para eliminar el id de la tabla mascota
            
            
            int filaperro = estadoperro.executeUpdate();
            return filaperro > 0 ;
                
        } catch (SQLException e) {
            return false;
        }
    } 
    
    
    
    //Metodo para buscar en la base de datos
    
    public mascota BuscarMascota (String codigo)
    {
        clsPerro perro = null;   //instaciamos un objeto perro que vamos a retornar cuando se cumpla la condicion de busqueda
        try //Conexion a la BD
        {
            Connection con = DriverManager.getConnection(conex.getURL(), conex.getUser(), conex.getPassword());
            String query = "SELECT * FROM mascota AS m INNER JOIN perro AS p ON m.id_mas = p.id_mascota WHERE m.codigo = ?";
            PreparedStatement estadoperro = con.prepareStatement(query);
            estadoperro.setString(1, codigo);
            ResultSet resul = estadoperro.executeQuery(); //con el ResulSet obtenemos la ejeucicón de la consulta y los campos obtenidos en ella
            while (resul.next()){
                //la variable resul toma las posiciones de los campos de la tabla y estos valores se los pasamos a cada variable
                int mascotaid = resul.getInt(1);
                String mascotacod = resul.getString(2);
                String mascotanomb = resul.getString(3);
                int mascotanac = resul.getInt(4);
                String mascotacolor = resul.getString(5);
                String mascotasalud = resul.getString(6);
                int perroid = resul.getInt(7);
                String mascotaraza = resul.getString(8);
                Boolean mascotapedig = resul.getBoolean(9);
                
                // en el objeto perro instanciado al comienzo pasamos los valores de cada variable hacia el constructor de la clase perro
                
                perro = new clsPerro(perroid, mascotaraza, mascotapedig, mascotaid, mascotacod, mascotanomb, mascotanac, mascotacolor, mascotasalud); 
                
            }
            return perro;
        }
        catch(Exception e){
            return perro;
        }
 
    }
    
    
    public boolean EditarMascota(clsPerro perro)
    {
       try(Connection con = DriverManager.getConnection(conex.getURL(), conex.getUser(), conex.getPassword()))
        {
             String queryPet = "UPDATE mascota SET codigo = ?, nombre = ?, anionac = ?, color = ?, estadosalud = ? WHERE id_mas = ?";
            PreparedStatement statementPet = con.prepareStatement(queryPet);
            statementPet.setString(1, perro.getCodigo());
            statementPet.setString(2, perro.getNombre());
            statementPet.setInt(3, perro.getAnioNac());
            statementPet.setString(4, perro.getColor());
            statementPet.setString(5, perro.getEstadoSalud());
            statementPet.setInt(6, perro.getId());
            
           String queryDog = "UPDATE perro SET raza = ?, pedigree = ? WHERE id = ?";
            PreparedStatement statementDog = con.prepareStatement(queryDog);
            statementDog.setString(1, perro.getRaza());
            statementDog.setBoolean(2, perro.getPedigree());
            statementDog.setInt(3, perro.getIdperro());
            int rowsUpdatedPet = statementPet.executeUpdate();
            int rowsUpdatedDog = statementDog.executeUpdate();
            return rowsUpdatedPet > 0 && rowsUpdatedDog > 0;
        } catch (SQLException e) {
            return false;
        }
    } 
    
    
  
    
    
    public LinkedList <mascota> ListarMascota ()
    {
        LinkedList<mascota> listaperro = new LinkedList<>();   //instaciamos un objeto perro que vamos a retornar cuando se cumpla la condicion de busqueda
        try(Connection con = DriverManager.getConnection(conex.getURL(), conex.getUser(), conex.getPassword())) //Conexion a la BD
        {
            String query = "SELECT * FROM mascota AS m INNER JOIN perro AS p ON m.id_mas = p.id_mascota ";
            PreparedStatement estadoperro = con.prepareStatement(query);
            
            ResultSet resul = estadoperro.executeQuery(); //con el ResulSet obtenemos la ejeucicón de la consulta y los campos obtenidos en ella
            while (resul.next()){
                //la variable resul toma las posiciones de los campos de la tabla y estos valores se los pasamos a cada variable
                int mascotaid = resul.getInt(1);
                String mascotacod = resul.getString(2);
                String mascotanomb = resul.getString(3);
                int mascotanac = resul.getInt(4);
                String mascotacolor = resul.getString(5);
                String mascotasalud = resul.getString(6);
                int perroid = resul.getInt(7);
                String mascotaraza = resul.getString(8);
                Boolean mascotapedig = resul.getBoolean(9);
                
                // en el objeto perro instanciado al comienzo pasamos los valores de cada variable hacia el constructor de la clase perro
                
                clsPerro perro = new clsPerro(perroid, mascotaraza, mascotapedig, mascotaid, mascotacod, mascotanomb, mascotanac, mascotacolor, mascotasalud); 
                listaperro.add(perro);
            }
            return listaperro;
        }
        catch(Exception e){
            return listaperro;
        }
 
    }
}
