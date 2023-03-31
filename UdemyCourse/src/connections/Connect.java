package connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {

    //database connection attribute

    private Connection connection;

    /**
     * Method that connects to the database, in case it doesn't
     * exist, it creates one
     * @return true - the connection was made
     */

     public boolean connect() throws ClassNotFoundException{
        try
        {
          //command to open the SQLite library
          Class.forName("org.sqlite.JDBC");
          //connection url
          String url = "jdbc:sqlite:C:/Users/Laura/Documents/GitHub/Java_Udemy_Course/UdemyCourse/src/database/banco_sqlite.db";
          //connect to the database
          this.connection = DriverManager.getConnection(url);
        }
        catch(SQLException e)
        {
          System.err.println(e.getMessage());
          return false; //if doesn't connect, return false
        }
         System.out.println("Connection established");
         return true;//if it connects, return true
    }

    /**
     * Method to disconnect from the database
     * @return turn - if it disconnects
     */


    public boolean disconnect()
    {
        try
        {
            if(this.connection.isClosed() == false)
                this.connection.close();

        }
        catch (SQLException e)
        {
                System.err.println(e.getMessage());
                return false;
        }
        System.out.println("Disconnected from the database");
        return true; //in case it disconnects, return true;
    }


}
