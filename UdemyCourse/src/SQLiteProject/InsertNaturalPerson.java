package SQLiteProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertNaturalPerson {

    //method to connect to the database
    private Connection connect(){

        //connection url
        String url = "jdbc:sqlite:C:/Users/Laura/Documents/GitHub/Java_Udemy_Course/UdemyCourse/src/database/banco_sqlite.db";
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

    public void insertData(String name, String surname, String cpf)
    {

        String upperCaseName = name.toUpperCase();
        String upperCaseSurname = surname.toUpperCase();

        String sql = "INSERT INTO natural_person_table (name, surname, cpf) VALUES (?, ?, ?)";

        try
        {
            Connection conn = this.connect();

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, upperCaseName);
            pstmt.setString(2, upperCaseSurname);
            pstmt.setString(3, cpf);

            pstmt.executeUpdate();
            System.out.println("The data was added");

        }
        catch(SQLException e)
        {
            System.err.println(e.getMessage());
        }
    }
}
