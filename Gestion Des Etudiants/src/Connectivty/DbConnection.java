package Connectivty;
import java.sql.*;

public class DbConnection {
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn;
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestiondesetudiants","root","");
        System.out.println("Connection etablie");
        return conn;
    }

}
