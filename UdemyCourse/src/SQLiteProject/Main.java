package SQLiteProject;


import connections.Connect;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {

        Connect connection = new Connect();
        NaturalPersonTable tableNaturalPerson = new NaturalPersonTable();
        InsertNaturalPerson insertnp = new InsertNaturalPerson();

        connection.connect();

        tableNaturalPerson.createTable();

        //insert things in the natural person table
        insertnp.insertData("Ana Laura", "Fernandes", "100.475.431-00");
        insertnp.insertData("Julia", "Farias", "722.987.784-02");
        connection.disconnect();
    }
}
