package dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static  java.lang.Class.forName;

public class conexion {

    public static Connection ConectarnosBD(){

        try {
            String dbDrive = "com.mysql.cj.jdbc.Driver";
            String dbUrl = "jdbc:mysql://localhost:3306";

            String dbName = "misericordia";
            String dbUser = "root";
            String dbPassword = "";

            forName(dbDrive);
            Connection conex = DriverManager.getConnection(dbUrl+dbName,dbUser,dbPassword);
            System.out.println("se conecta");
            return conex;
        }catch (ClassNotFoundException | SQLException ex){
            System.out.println("no se conecto");
            ex.printStackTrace(System.out);
        }
        return null;
    }
}
