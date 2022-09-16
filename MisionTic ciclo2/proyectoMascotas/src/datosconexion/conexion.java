/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datosconexion;

/**
 *
 * @author Esquivel_Cesar
 */
public class conexion {
    private final String Driver = "com.mysql.jdbc.Driver";
    private final String User = "root";
    private final String Password = "";
    private final String URL = "jdbc:mysql://localhost:3306/adminmascotas";
                                                           
    
   
    
    /**
     * @return the Driver
     */
    public String getDriver() {
        return Driver;
    }

    /**
     * @return the User
     */
    public String getUser() {
        return User;
    }

    /**
     * @return the Password
     */
    public String getPassword() {
        return Password;
    }

    /**
     * @return the URL
     */
    public String getURL() {
        return URL;
    }
    
    
    
}
