/**
 * @author Sanduni Wijesinghe <nipunisandunikaw@gmail.com>
 * @since 10/9/2021
 * /


/*
 * ----------------------------------------------------------------------
 *  Copyright(c) GDSE-Gangsterss.All Right Reserved.
 *  Licenced under the Sri Lankan Information Licence.
 * -----------------------------------------------------------------------
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    private static DbConnection dbConnection;
    private Connection connection;

    private DbConnection   () throws ClassNotFoundException, SQLException {
        Class.forName    ("com.mysql.cj.jdbc.Driver");
        connection =     DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/ShoppingS",
                "root",
                "password");
    }
    public static DbConnection getInstance() throws ClassNotFoundException, SQLException {
        if (dbConnection==null){
            dbConnection= new DbConnection();
        }
        return dbConnection;
    }

    public Connection getConnection(){
        return connection;
    }
}
