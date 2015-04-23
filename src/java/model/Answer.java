package model;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import control.DBConnect;

public class Answer
{
    private Integer QID;
    String answer;
    private String loginID;
    private Timestamp answered;
    public Integer likes;
    public Integer dislikes;
    public Answer()
    {
     // default constructor.   
    }
    public Answer(Integer QID, String answer, String loginID, Timestamp answered) 
    {
        this.QID = QID;
        this.answer = answer;
        this.loginID = loginID;
        this.answered = answered;
    }

    public Integer getLikes()
    {
        return likes;
    }

    public void setLikes(Integer likes)
    {
        this.likes = likes;
    }

    public Integer getDislikes() 
    {
        return dislikes;
    }

    public void setDislikes(Integer dislikes) 
    {
        this.dislikes = dislikes;
    }

    public Integer getQID()
    {
        return QID;
    }

    public void setQID(Integer QID)
    {
        this.QID = QID;
    }

    public String getAnswer()
    {
        return answer;
    }

    public void setAnswer(String answer)
    {
        this.answer = answer;
    }

    public String getloginID()
    {
        return loginID;
    }

    public void setloginID(String loginID)
    {
        this.loginID = loginID;
    }

    public Timestamp getAnswered()
    {
        return answered;
    }

    public void setAnswered(Timestamp answered)
    {
        this.answered = answered;
    }
    
    public Boolean postAnswer(int QID,String loginID,String answer)
    {
        DBConnect db = new DBConnect();
        try
        {
             String SQL = "INSERT INTO ANSWER(QID, USER_ID, ANSWER) VALUES (" + QID + ", '" + loginID + "', '" + answer + "')";
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
    public Boolean deleteAnswer(Integer AID)
    {
        DBConnect db = new DBConnect();
        
        try
        {
            String SQL = "DELETE FROM `ANSWER` WHERE AID = " + AID;
            db.pstmt = db.conn.prepareStatement(SQL);
            try
            {
                if (db.pstmt.executeUpdate() != 0)
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
        return false;
    }

   
} //end of answer class
