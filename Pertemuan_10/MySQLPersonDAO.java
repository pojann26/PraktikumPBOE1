package Pertemuan_10;
import java.sql .*;

public class MySQLPersonDAO implements PersonDAO{
    public void savePerson (Person person) throws Exception{
        String name = person.getName ();
        //membuat koneksi, nama db, user, password menyesuaikan
        Class.forName("com.mysql.jdbc.Driver") ;
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1/pbo", "root", "PW MySQL Workbench");
        //kerjakan mysql query
        String query = "INSERT INTO person (name) VALUES ('"+name+"')";
        System.out.println (query) ;
        Statement s = con.createStatement () ;
        s.executeUpdate (query) ;
        //tutup koneksi database
        con.close();
    }
}