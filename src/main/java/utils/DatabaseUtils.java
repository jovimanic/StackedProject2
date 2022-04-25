package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;


public class DatabaseUtils extends CommonMethods{

    /** UNDER CONSTRUCTION ---> DO NOT USE <-----
     * UNDER CONSTRUCTION ---> DO NOT USE <-----
     * UNDER CONSTRUCTION ---> DO NOT USE <-----
     * This class is to store database utilities and methods of code that will allow us to access
     * our database and process the data
     */

    static Logger logger = Logger.getLogger(DatabaseUtils.class.getName());
    private static Connection getRemoteConnection() {
        if (System.getenv(DATABASE_HOST) != null) {
            try {
                Class.forName("org.postgresql.Driver");
                String dbName = System.getenv(DATABASE_NAME);
                String userName = System.getenv(DATABASE_USERNAME);
                String password = System.getenv(DATABASE_PASSWORD);
                String hostname = System.getenv(DATABASE_HOST);
                String port = System.getenv(DATABASE_PORT);
                String jdbcUrl = "jdbc:postgresql://" + hostname + ":" + port + "/" + dbName + "?user=" + userName + "&password=" + password;
                Connection con = DriverManager.getConnection(jdbcUrl);
                logger.info("Remote connection successful.");
                return con;
            }
            catch (ClassNotFoundException | SQLException e) { e.printStackTrace();}
        }
        return null;
    }


}
