package SQLiteProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateDataNaturalPerson {

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
     * Method to update data
     */

    public void updateData(int id, String name, String surname, String cpf)
    {
        String sql = "UPDATE natural_person_table SET name = ?, surname = ?, cpf = ? WHERE natural_person_id = ? ";
        String upperCaseName = name.toUpperCase();
        String upperCaseSurname = surname.toUpperCase();

        try
        {
            Connection conn = this.connect();

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, upperCaseName);
            pstmt.setString(2, upperCaseSurname);
            pstmt.setString(3, cpf);
            pstmt.setInt(4, id);


            pstmt.executeUpdate();
            System.out.println("The data was updated");

        }
        catch(SQLException e)
        {
            System.err.println(e.getMessage());
        }

    }

}
