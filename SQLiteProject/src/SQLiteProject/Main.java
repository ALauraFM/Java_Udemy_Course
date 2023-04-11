package SQLiteProject;


import connections.Connect;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {

        //connects to the database
        Connect connection = new Connect();
        //instantiates the table class
        NaturalPersonTable tableNaturalPerson = new NaturalPersonTable();
        //instantiates the class to insert a new person
        InsertNaturalPerson insertnp = new InsertNaturalPerson();
        //instantiates the class to search through the table
        SearchDataNaturalPerson searchnp = new SearchDataNaturalPerson();
        //instantiates the class to update a data
        UpdateDataNaturalPerson updatenp = new UpdateDataNaturalPerson();
        //instantiates the class to delete a data from a natural person
        DeleteNaturalPersonData deletenp = new DeleteNaturalPersonData();


        connection.connect();

        tableNaturalPerson.createTable();
        //updatenp.updateData(2, "Carla", "Fernandes", "109.544.987-00");
        //updatenp.updateData(3, "Julia", "Farias", "151.511.988-00");
        //insert things in the natural person table
        //insertnp.insertData("Ana Laura", "Fernandes", "100.475.431-00");
        //insertnp.insertData("Tasso", "Gomes", "123.487.989-03");
        searchnp.selectData();
        deletenp.deleteData(1);
        deletenp.deleteData(2);
        searchnp.selectData();
        connection.disconnect();
    }
}
