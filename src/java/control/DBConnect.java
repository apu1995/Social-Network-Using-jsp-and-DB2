package control;
import java.sql.*;
public class DBConnect 
{
    static final String URL = "jdbc:db2://localhost:50000/SN";
    static final String user = "Aashu";
    static final String password = "21ihsuyaa5";
    public Connection conn;
    public Statement st;
    public ResultSet rs;
    public PreparedStatement pstmt;
    
    public DBConnect()
    {
        conn=null;
        pstmt=null;
        try
        {
            System.out.println("class");
            Class.forName("com.ibm.db2.jcc.DB2Driver");
            conn=DriverManager.getConnection(URL,user,password);
            st=conn.createStatement();
       }
        catch(ClassNotFoundException | SQLException e )
        {
            System.out.println("error here.");
        }
   }
}