package control;
import java.sql.Date;
import model.User;
public class UpdateDB 
{
    //create user call user class method create_user(*);
    public Boolean create_user(String login_id,String first_name,String middle_name,String last_name,String password,String branch,String rollno,String gender,String mobileno,String house,String date_of_birth,String home_town,String about,String hostel,String education,String security_q , String security_a)
    {  
        User Obj = new User();
        try
        {
           Obj.create_user(login_id,first_name,middle_name,last_name,password,branch,rollno,gender,mobileno,house,date_of_birth,home_town,about,hostel,education,security_q ,security_a);
            return true;
          
        }catch(Exception ex)
        {
            return false;
        }
    }
    
    // this method calls update_user(*) method of user class
    public Boolean update_user(String login_id,String first_name,String last_name,String branch,String rollno,String gender,String mobileno,String house,String date_of_birth,String home_town,String about,String hostel,String education)
    {  
        User Obj = new User();
        try
        {
           Obj.update_user(login_id,first_name,last_name,branch,rollno,gender,mobileno,house,date_of_birth,home_town,about,hostel,education);
            return true;
          
        }catch(Exception ex)
        {
            return false;
        }
    }
    // to delete user
    public Boolean delete_user1(String login_id)
    {  
        User Obj = new User();
        try
        {
           Obj.delete_user(login_id);
            return true;
          
        }catch(Exception ex)
        {
            return false;
        }
    }
     
    // calls send_message(*) of user class
    public Boolean send_message(String SID,String RID,String message)
    {  
        User Obj = new User();
        try
        {
           Obj.send_message(SID, RID , message);
            return true;
          
        }catch(Exception ex)
        {
            return false;
        }
    }
    
}
