/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datosconexion;

import ClasesMascotas.clsGato;
import ClasesMascotas.mascota;
import java.sql.*;

/**
 *
 * @author USUARIO
 */
public class modelogato {
    conexion conex;

    public modelogato() {
        this.conex = new conexion();
    }

    public boolean crearMascota(clsGato gato) {

        try ( Connection con = DriverManager.getConnection(conex.getURL(), conex.getUser(), conex.getPassword())) {

            String query = "INSERT INTO mascota(codigo, nombre, anionac, color, estadosalud) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement estadoMascota = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            estadoMascota.setString(1, gato.getCodigo());
            estadoMascota.setString(2, gato.getNombre());
            estadoMascota.setInt(3, gato.getAnioNac());
            estadoMascota.setString(4, gato.getColor());
            estadoMascota.setString(5, gato.getEstadoSalud());

            int insercion = estadoMascota.executeUpdate();

            if (insercion > 0) {
                ResultSet llaveGenerada = estadoMascota.getGeneratedKeys();
                if (llaveGenerada.next()) {
                    
                    int codMascota = llaveGenerada.getInt(1);//posicion donde se genero
                    String query2 = "INSERT INTO gato (raza, id_mascota) VALUES (?, ?)";
                    PreparedStatement estadoGato = con.prepareStatement(query2);
                    estadoGato.setString(1, gato.getRaza());
                    estadoGato.setInt(2, codMascota);

                    insercion = estadoGato.executeUpdate();
                    if (insercion > 0) {
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
    
    public mascota  buscarMascota(String codigo){
        clsGato gato = null;
       try ( Connection con = DriverManager.getConnection(conex.getURL(), conex.getUser(), conex.getPassword())) {
            String query = "SELECT * FROM mascota As m INNER JOIN gato AS g ON m.id = g.id_mascota WHERE m.codigo = ? ";
            PreparedStatement estadoGato  = con.prepareStatement(query);
            estadoGato.setString(1, codigo);
            ResultSet resul = estadoGato.executeQuery();
            
            while (resul.next()){
                int mascotaId = resul.getInt(1);
                String mascotaCod = resul.getString(2);
                String mascotaNombre = resul.getString(3);
                int mascotaNac = resul.getInt(4);
                String mascotaColor = resul.getString(5);
                String mascotaEstadoSal = resul.getString(6);
                int gatoId = resul.getInt(7);
                String mascotaRaza = resul.getString(8);                
                gato = new clsGato(gatoId, mascotaRaza, mascotaId, mascotaCod, mascotaNombre, mascotaNac, mascotaColor, mascotaEstadoSal);
                con.close();
            }
            con.close();
            return gato;
        }catch (SQLException e){
            return gato;
        }
    }
    
    public boolean editarMascota(clsGato gato){
        try ( Connection con = DriverManager.getConnection(conex.getURL(), conex.getUser(), conex.getPassword())) {
        String queryPet = "UPDATE mascota SET codigo= ?, nombre =?, anionac = ?, color = ?, estadosalud = ? WHERE id = ? ";
        PreparedStatement statementPet = con.prepareStatement(queryPet);
        statementPet.setString(1, gato.getCodigo());
        statementPet.setString(2, gato.getNombre());
        statementPet.setInt(3, gato.getAnioNac());
        statementPet.setString(4, gato.getColor());
        statementPet.setString(5, gato.getEstadoSalud());
        statementPet.setInt(6, gato.getId());
        
        String queryGato = "UPDATE gato SET  raza = ?  WHERE id = ?";
        PreparedStatement statementGato = con.prepareStatement(queryGato);
        statementGato.setString(1, gato.getRaza());
        statementGato.setInt(2, gato.getIdGato());
        
        int rowsUpdatePet = statementPet.executeUpdate();
        int rowsUpdateGato = statementGato.executeUpdate();
        con.close();
        return rowsUpdatePet > 0 && rowsUpdateGato > 0;
         
        } catch (SQLException e) {
            return false;
        }
        
    }
     
    public boolean eliminarMascota(clsGato gato){
        
        try (Connection con = DriverManager.getConnection(conex.getURL(), conex.getUser(), conex.getPassword())) {
            String queryGato = "DELETE FROM  gato WHERE id_mascota = ?";
            PreparedStatement estadoGato = con.prepareStatement(queryGato);
            estadoGato.setInt(1, gato.getIdGato());
            
            String queryMascota = "DELETE FROM mascota  WHERE id = ?";
            PreparedStatement estadoMascota = con.prepareStatement(queryMascota);
            estadoMascota.setInt(1, gato.getId());
            
            int filagato = estadoGato.executeUpdate();
             int filaMascota = estadoMascota.executeUpdate();
            con.close();
            return filagato > 0 && filaMascota > 0;
        } catch (Exception e) {
            return false;
        }
    }

}
