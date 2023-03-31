package SQLiteProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class NaturalPersonTable {

    public void createTable()
    {
        String url = "jdbc:sqlite:C:/Users/Laura/Documents/GitHub/Java_Udemy_Course/UdemyCourse/src/database/banco_sqlite.db";

        //Sql statement to create a new table
        String sql = "CREATE TABLE IF NOT EXISTS natural_person_table (\n"
                + "natural_person_id integer PRIMARY KEY, \n" //an id space for natural person
                + "name text NOT NULL, \n" //the name must be typed
                + "surname text NOT NULL, \n"
                + "cpf text NOT NULL \n"
                + ");";

        try
        {
            Connection conn = DriverManager.getConnection(url);

            //instance o Statement e create um
            Statement stmt = conn.createStatement();
            //Create a new table
            stmt.execute(sql);
            System.out.println("The table was created");
        }
        catch(SQLException e)
        {
            System.err.println(e.getMessage());
        }
    }
}
