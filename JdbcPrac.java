import java.sql.*;

public class JdbcPrac {
    public static void main(String args[]) {
        try {
            // load driver
            Class.forName("com.mysql.jdbc.Driver");

            // creating connection
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test_db?characterEncoding=latin1",
                    "root",
                    "Avinash@sql78");
            System.out.println("db connected");

            // creating and executing query
            // String query = "create table testing(id int(10) primary key,name varchar(20)
            // not null)";
            // Statement stmt = con.createStatement();
            // stmt.executeUpdate(query);
            // System.out.println("table created");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
