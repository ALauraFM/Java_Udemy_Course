package SQLiteProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteNaturalPersonData {

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

    public void deleteData(int id)
    {
        String sql = "DELETE FROM natural_person_table WHERE natural_person_id = ?";

        try
        {
            Connection conn = this.connect();

            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1, id);

            pstmt.executeUpdate();
        }
        catch(SQLException e)
        {
            System.err.println(e.getMessage());
        }
    }
}
