package SQLiteProject;

import java.sql.*;

public class SearchDataNaturalPerson {

    private Connection connect(){

        //connection url
        String url = "jdbc:sqlite:C:/Users/Laura/Documents/GitHub/Java_Udemy_Course/SQLiteProject/src/database/banco_sqlite.db";
        Connection conn = null;

        try
        {
            conn = DriverManager.getConnection(url);

        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    /**
     * searching method to search data from the natural person table
     */
    public void selectData()
    {
        String sql = "SELECT natural_person_id, name, surname, cpf FROM natural_person_table";

        try
        {
            Connection conn = this.connect();

            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery(sql);

            //loop to bring the query results

            while(rs.next())
            {
                System.out.println(rs.getInt("natural_person_id") + " "
                        + rs.getString("name") + " "
                        + rs.getString("surname") + " "
                        + rs.getString("cpf"));
            }
        }
        catch(SQLException e)
        {
            System.err.println(e.getMessage());
        }
    }


}
