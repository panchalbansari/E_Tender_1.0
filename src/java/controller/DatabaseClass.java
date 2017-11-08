package controller;
import java.sql.Connection;
import java.sql.DriverManager;

//The DatabaseClass created for
public class DatabaseClass {


    //Connection initialization
    Connection con = null;

    //Setting Connection of database in constructor
    public DatabaseClass() {
        try {
            Class.forName("com.mysql.jdbc.Driver");//JDBC Connection library
            //getConnection("Database_Type://location:post/DataBase_Name", "ID", "Password");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/e_tender", "root", "");

        } catch (Exception e) {
            e.getMessage();
        }

    }
	
	

    //Method getconnection() returns the database connection instance 
    public Connection getconnection() {
        return con;

    }



}
