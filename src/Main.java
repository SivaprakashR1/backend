import java.sql.Connection;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        DbFunction db = new DbFunction();
        Connection conn = db.connect_to_db("tutdb","postgres","1234567890");
        //db.createTable(conn,"employee");             // to create a table
        //db.insert_row(conn,"employee","Cat","India");    // insert a row
        //db.update_name(conn,"employee","Siva","Raj");

        //db.search_by_id(conn, "employee", 3);
        db.delete_row_by_name(conn, "employee", "Siva");
        db.read_data(conn, "employee");   // read the data

    }
}