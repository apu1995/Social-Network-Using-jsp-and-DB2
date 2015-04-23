package model;
import java.sql.Timestamp;
import control.DBConnect;
import java.sql.SQLException;

public class Message 
{
    int MID;
    String SID;
    String RID;
    String message;
    // default constructor.
    public Message()
    {
        
    }
    public Message(String SID , String RID,String message,int MID)
    {
        this.SID=SID;
        this.MID = MID;
        this.RID = RID;
        this.message = message;
    }

    public String getSID() 
    {
        return SID;
    }

    public void setSID(String SID) 
    {
        this.SID = SID;
    }
    
    public String getRID() 
    {
        return RID;
    }

    public void setRID(String RID)
    {
        this.RID = RID;
    }
    
    
    public int getMID() 
    {
        return MID;
    }

    public void setMID(int MID)
    {
        this.MID = MID;
    }
    
    public String getMessage() 
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }
    //methdo to send a message.
    public boolean sendMessage(String sid, String message , String rid)
    {
        DBConnect db = new DBConnect ();
        try
        {
             String SQL = "insert into messages(SID,RID,MESSAGE) values ('" + sid + "','" + rid + "','" + message + "')";
             db.pstmt = db.conn.prepareStatement(SQL);
             try
             {
             db.pstmt.executeUpdate();
             return true;
             }
             catch (SQLException e)
             {
             return false;
             }
        }
        catch(SQLException e)
        {
           return false; 
        }
         finally
        {
            try
            {
            db.conn.close();
            }
            catch (SQLException e)
            {
            return false;
            }
        }
        
 }
}// end of message class. 