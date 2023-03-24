package aluno.connection;

import java.sql.Connection;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.util.Scanner;

public class ConexaoDb {

    private static String USERNAME = "root";
    private static String PASSWORD = "yourpassword"; // put your database root password here
    private static String DBURL = "jdbc:mysql://localhost:3306/alunos";

    public static Connection CreatConnection()
            throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(DBURL, USERNAME, PASSWORD);

        return con;
    }
    /*public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
        Connection con2 = CreatConnection();
        if(con2 != null){
            System.out.println("conexao sucedida");
            con2.close();
        
            
            
                
            }
        }*/
}
