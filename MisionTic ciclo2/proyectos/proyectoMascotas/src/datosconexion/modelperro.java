/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datosconexion;

import ClasesMascotas.*;

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
    public modelperro() {
        this.conex = new conexion();
    }

    public boolean crearMascota(clsPerro perro) {
        try ( Connection con = DriverManager.getConnection(conex.getURL(), conex.getUser(), conex.getPassword())) {
            String query = "INSERT INTO mascota (codigo, nombre, anionac, color, estadosalud) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement estadomascota = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            estadomascota.setString(1, perro.getCodigo());
            estadomascota.setString(2, perro.getNombre());
            estadomascota.setInt(3, perro.getAnioNac());
            estadomascota.setString(4, perro.getColor());
            estadomascota.setString(5, perro.getEstadoSalud());
            int colinsertada = estadomascota.executeUpdate();
            if (colinsertada > 0) {
                ResultSet llavegenerada = estadomascota.getGeneratedKeys();
                if (llavegenerada.next()) {
                    int codmascota = llavegenerada.getInt(1);
                    query = "INSERT INTO perro (raza, pedigree, id_mascota) VALUES (?,?,?)";
                    PreparedStatement estadoperro = con.prepareStatement(query);
                    estadoperro.setString(1, perro.getRaza());
                    estadoperro.setBoolean(2, perro.getPedigree());
                    estadoperro.setInt(3, codmascota);
                    colinsertada = estadoperro.executeUpdate();
                    if (colinsertada > 0) {
                        return true;
                    }

                }

            }
            con.close();
            return false;
        } catch (SQLException e) {
            return false;
        }
    }

    public mascota BuscarMascota(String codigo) {
        clsPerro perro = null;
        try ( Connection con = DriverManager.getConnection(conex.getURL(), conex.getUser(), conex.getPassword())) {
           
            String query = "SELECT * FROM mascota As m INNER JOIN perro AS p ON m.id = p.id_mascota WHERE m.codigo = ?";
            PreparedStatement estadoperro = con.prepareStatement(query);
            estadoperro.setString(1, codigo);
            ResultSet resul = estadoperro.executeQuery();
            while (resul.next()) {
                int mascotaid = resul.getInt(1);
                String mascotacod = resul.getString(2);
                String mascotanombre = resul.getString(3);
                int anhionac = resul.getInt(4);
                String mascotacolor = resul.getString(5);
                String mascotaestadoSal = resul.getString(6);
                int perroid = resul.getInt(7);
                String mascotaraza = resul.getString(8);
                boolean mascotapeligri = resul.getBoolean(9);

                perro = new clsPerro(perroid, mascotaraza, mascotapeligri, mascotaid, mascotacod, mascotanombre, anhionac, mascotacolor, mascotaestadoSal);

            }
            con.close();
            return perro;

        } catch (Exception e) {
            return perro;
        }

    }

    public boolean EditarMascota(clsPerro perro) {
        try ( Connection con = DriverManager.getConnection(conex.getURL(), conex.getUser(), conex.getPassword())) {

            String queryPet = "UPDATE mascota SET codigo = ?, nombre = ?, anionac = ?, color = ?, estadosalud = ? WHERE id= ?";
            PreparedStatement statementPet = con.prepareStatement(queryPet);
            statementPet.setString(1, perro.getCodigo());
            statementPet.setString(2, perro.getNombre());
            statementPet.setInt(3, perro.getAnioNac());
            statementPet.setString(4, perro.getColor());
            statementPet.setString(5, perro.getEstadoSalud());
            statementPet.setInt(6, perro.getId());
            
            String queryDog = "UPDATE perro SET raza = ?, pedigre = ? WHERE id = ?";
            PreparedStatement statementDog = con.prepareStatement(queryDog);
            statementDog.setString(1, perro.getRaza());
            statementDog.setBoolean(2, perro.getPedigree());
            statementDog.setInt(3, perro.getIdperro());
            
            int rowsUpdatePet = statementPet.executeUpdate();
            int rowsUpdateDog = statementDog.executeUpdate();
            con.close();
            return rowsUpdateDog > 0 && rowsUpdatePet > 0; 
        } catch (SQLException e) {
            return false;
        }
    }
    
    public boolean eliminarMascota(clsPerro perro){
        
        try (Connection con = DriverManager.getConnection(conex.getURL(), conex.getUser(), conex.getPassword())) {
            
            String queryDog = "DELETE FROM perro WHERE id_mascota = ?";
            PreparedStatement estadoPerro=  con.prepareStatement(queryDog);
            estadoPerro.setInt(1, perro.getIdperro());
            
            String queryMascota = "DELETE FROM mascota  WHERE id = ?";
            PreparedStatement estadoMascota = con.prepareStatement(queryMascota);
            estadoMascota.setInt(1, perro.getId());
            
            int filaPerro = estadoPerro.executeUpdate();
            int filaMascota = estadoMascota.executeUpdate();
            con.close();
            return filaPerro > 0 && filaMascota > 0;
        } catch (Exception e) {
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
