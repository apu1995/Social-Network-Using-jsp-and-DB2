package model;
import control.DBConnect;
import java.sql.Date;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

public class User 
{
	private int user_id; 
	private String first_name; 
	private String middle_name; 
	private String last_name; 
	private String login_id; 
	private String password;
	private String branch;
	private String rollno;
	private String gender;
	private String mobileno;
	private String house;
	private String date_of_birth;
	private String home_town;
	private String about;
	private String hostel;
	private String education;
        private String security_question;
        private String security_answer;
        public void User()
        {
            // default constructor provided.
        }
        
    //getter and setter methods.
    public String getSecurity_question() 
    {
        return security_question;
    }

    public void setSecurity_question(String security_question)
    {
        this.security_question = security_question;
    }

    public String getSecurity_answer()
    {
        return security_answer;
    }

    public void setSecurity_answer(String security_answer)
    {
        this.security_answer = security_answer;
    }
        
	public int getUser_id() 
	{
		return user_id;
	}
	public void setUser_id(int user_id) 
	{
		this.user_id = user_id;
	}
	public String getFirst_name()
	{
		return first_name;
	}
	public void setFirst_name(String first_name) 
	{
		this.first_name = first_name;
	}
	public String getMiddle_name() 
	{
		return middle_name;
	}
	public void setMiddle_name(String middle_name) 
	{
		this.middle_name = middle_name;
	}
	public String getLast_name() 
	{
		return last_name;
	}
	public void setLast_name(String last_name)
	{
		this.last_name = last_name;
	}
	public String getLogin_id() 
	{
		return login_id;
	}
	public void setLogin_id(String login_id) 
	{
		this.login_id = login_id;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = encrypt_password(password);
	}
	public String getBranch()
	{
		return branch;
	}
	public void setBranch(String branch) 
	{
		this.branch = branch;
	}
	public String getRollno() 
	{
		return rollno;
	}
	public void setRollno(String rollno) 
	{
		this.rollno = rollno;
	}
	public String getGender() 
	{
		return gender;
	}
	public void setGender(String gender) 
	{
		this.gender = gender;
	}
	public String getMobileno()
	{
		return mobileno;
	}
	public void setMobileno(String mobileno)
	{
		this.mobileno = mobileno;
	}
	public String getHouse() 
	{
		return house;
	}
	public void setHouse(String house) 
	{
		this.house = house;
	}
	public String getDate_of_birth() 
	{
		return date_of_birth;
	}
	public void setDate_of_birth(String date_of_birth)
	{
		this.date_of_birth = date_of_birth;
	}
	public String getHome_town()
	{
		return home_town;
	}
	public void setHome_town(String home_town)
	{
		this.home_town = home_town;
	}
	public String getAbout()
	{
		return about;
	}
	public void setAbout(String about)
	{
		this.about = about;
	}
	public String getHostel()
	{
		return hostel;
	}
	public void setHostel(String hostel)
	{
		this.hostel = hostel;
	}
	public String getEducation() 
	{
		return education;
	}
	public void setEducation(String education)
	{
		this.education = education;
	}
	
        // method to encrypt the password
	private String encrypt_password(String password)
	{
		String generated_password = null;
                try
                {

                    MessageDigest md = MessageDigest.getInstance("MD5");
                    md.update(password.getBytes());
                    byte[] bytes = md.digest();
                    StringBuilder sb = new StringBuilder();
                    for(int i=0; i< bytes.length ;i++)
                    {
                        sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
                    }
                    generated_password=sb.toString();
                }
                catch (NoSuchAlgorithmException e)
                {
                
                }
                return generated_password;
	}
        //method to delete the user
        public boolean delete_user(String user_id)
        {
            DBConnect db = new DBConnect ();
            try
            {
                String SQL = "DELETE FROM USER2 WHERE LOGIN_ID = "+ user_id ;
                db.pstmt = db.conn.prepareStatement(SQL);
                try
                {
                    if (db.pstmt.executeUpdate()!= 0)
                        return true;
                }
                catch(SQLException e)
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
                catch(SQLException e)
                {
                    return false;
                }
            }
            return false;
    }
        
    // method to create user while registering
      public boolean create_user(String login_id, String first_name, String middle_name, String last_name, String password, String branch, String rollno, String gender, String mobileno, String house,String date_of_birth, String home_town, String about, String hostel, String education, String security_q, String security_a)
    {
        DBConnect db = new DBConnect();
        try{
                 String SQL = "insert into user2(login_id, first_name,middle_name,last_name,password,branch,rollno,gender,mobileno,house,date_of_birth,home_town,about,hostel,education) values ('" + login_id + "', '" + first_name + "','" 
                                + middle_name + "','" + last_name + "','" + password + "','" + branch + "','" + rollno + "','" + gender + "','" + mobileno + "','" + house + "','" + date_of_birth + "','" + home_town + "','" + about + "','" + hostel + "','" + education + "')";
                        System.out.println(""+SQL);
                        try
                        {
                            
                            db.pstmt = db.conn.prepareStatement(SQL);
                            
                            try
                            {
                                if (db.pstmt.executeUpdate() != 0)
                                    return true;
                            }
                            catch(Exception e)
                        {
                            
                    }
                        } catch(Exception e){
                                    
                                }
             
                         finally
        {
            try
            {
                db.conn.close();
            }
            catch (Exception e)
            {
                
            }
        }
                        
        
    }           catch(Exception e){
        
    }
        return false;
        }
        
        public boolean update_user(String login_id, String first_name, String last_name, String branch, String rollno, String gender, String mobileno, String house,String date_of_birth, String home_town, String about, String hostel, String education)
    {
        DBConnect db = new DBConnect();
        try
        {
           
            String SQL =  "update user2 set first_name='" + first_name  + "',last_name ='" + last_name + "',branch ='" + branch + "',rollno ='" + rollno + "',gender ='" + gender + "',mobileno ='" + mobileno + "',house ='" + house + "',date_of_birth ='" + date_of_birth + "',home_town ='" + home_town + "',about ='" + about + "',hostel ='" + hostel + "',education ='" + education+"'+ WHERE login_id ='"+ login_id+"'";
            System.out.println(""+SQL);
            try
            {
                    db.pstmt = db.conn.prepareStatement(SQL);
                    try
                    {
                        if (db.pstmt.executeUpdate() != 0)
                            return true;
                    }
                    catch (Exception e)
                    {
                        System.out.println(e);
                    }
            }
            catch(Exception e)
            {
                     
            }
        }
        finally
        {
            try
            {
                db.conn.close();
            }
            catch (Exception e)
            {
                
            }
        }
        return false;
    }
    
    // method to send messages.    
    public boolean send_message(String SID, String RID, String message)
    {
            DBConnect db = new DBConnect();
             try
             {
           
                        String SQL = "insert into MESSAGES(SID, RID,message) values ('" + SID + "', '" + RID + "', '"+ message + "')";
                        System.out.println(""+SQL);
                        try
                        {
                            
                            db.pstmt = db.conn.prepareStatement(SQL);
                            
                            try
                            {
                                if (db.pstmt.executeUpdate() != 0)
                                    return true;
                            }
                            catch(Exception e)
                            {

                            }
                        } 
                        catch(Exception e)
                        {
                                    
                        }
                        finally
                        {
                            try
                            {
                                db.conn.close();
                            }
                            catch (Exception e)
                            {
                
                            }
                        }
    }          
    catch(Exception e)
    {
        
    }
        return false;
}
        
        
}// end of user class.

