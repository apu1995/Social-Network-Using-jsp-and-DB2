package control;
import java.sql.SQLException;
public class LoginValidate
{

    public Boolean validate (String username, String password)
    {
        DBConnect db = new DBConnect ();
        String Query = "select * from login where username='"+username+"' and password='"+password+"'";
        try
        {
            db.pstmt = db.conn.prepareStatement (Query);
            try
            {
                db.rs = db.pstmt.executeQuery();
                if (db.rs.next())
                    return true;
                else
                    return false;
                
            }
            catch (SQLException e){}
        }
	catch(SQLException e){}
        finally
        {
            try
            {
                db.conn.close();
            }
            catch (SQLException e){}
        }
        return false;
    }

}
