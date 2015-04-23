package model;
import control.DBConnect;
import static java.lang.System.out;
import java.sql.SQLException;
import java.util.ArrayList;
public class Discussion 
{
    //default constructor.
    public Discussion() 
    {
    }
    
    //method to fetch all the qusetions to be displayed in connections.
    public ArrayList<Question> fetch() throws SQLException
    {
                DBConnect db1=new DBConnect();
                String qSQL="select user_id,ques,qid from question";
                System.out.println(qSQL);
	 	db1.pstmt=db1.conn.prepareStatement(qSQL);
	 	db1.rs=db1.pstmt.executeQuery();
                ArrayList<Question> qids=new ArrayList<Question>();
                while(db1.rs.next())
                {
                    qids.add(new Question(db1.rs.getString("user_id"),db1.rs.getString("ques"),db1.rs.getInt("qid")));
                }
                return qids;
                
    }
    
} // end of discussion class.