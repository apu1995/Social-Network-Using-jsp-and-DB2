package model;
import control.DBConnect;
import static java.lang.System.out;
import java.sql.SQLException;
import java.util.ArrayList;
public class Chat 
{
    public Chat() throws SQLException
    {
        //default constructor;
    }
    public ArrayList<Message> fetch() throws SQLException
    {
        DBConnect db1=new DBConnect();
        String qSQL="select SID, MID , RID , MESSAGE from messages";
        db1.pstmt=db1.conn.prepareStatement(qSQL);
	db1.rs=db1.pstmt.executeQuery();
        ArrayList<Message> mids=new ArrayList<Message>();
        while(db1.rs.next())
        {
            mids.add(new Message(db1.rs.getString("SID"),db1.rs.getString("RID"),db1.rs.getString("MESSAGE"),db1.rs.getInt("MID")));
        }
        return mids;
    }
}