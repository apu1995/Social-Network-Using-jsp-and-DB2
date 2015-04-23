<%@page import="java.sql.SQLException"%>
<%@page import="control.DBConnect"%>
<!DOCTYPE html>
<%
    String SQL = null;
    DBConnect db = new DBConnect();
%>
<html>
    <head>
        <title>Post Answer</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="style.css">
        <link href='http://fonts.googleapis.com/css?family=Indie+Flower' rel='stylesheet' type='text/css'>
        <link rel="stylesheet" type="text/css" href="style.css">
        <link href='http://fonts.googleapis.com/css?family=Indie+Flower' rel='stylesheet' type='text/css'>
        <link rel='stylesheet' href='http://fonts.googleapis.com/css?family=PT+Sans:400,700'>
        <link rel="stylesheet" href="assets/css/reset.css">
        <link rel="stylesheet" href="assets/css/supersized.css">
        <link rel="stylesheet" href="assets/css/style.css">
        <link rel="stylesheet" href="style.css">
        <link href='http://fonts.googleapis.com/css?family=Lato:300,400,700' rel='stylesheet' type='text/css' />
	<script type="text/javascript" src="js/modernizr.custom.79639.js"></script> 
	<noscript><link rel="stylesheet" type="text/css" href="css/noJS.css" /></noscript>
 
    </head>
    <body>
        <div class="page-container">
                <form action="pst_answer.jsp">
                    <h1>Post New Answer </h1><br>
                    <input type="text" name="answers" placeholder="Enter your Answer" /><br>
                    <select name="qid"  style="width:310px;">
                    <option>select one option</option>
                                   
                    
<%
        SQL = "SELECT * FROM QUESTION";
        String q = null;
        try
        {
            db.pstmt = db.conn.prepareStatement(SQL);
            try
            {
                db.rs = db.pstmt.executeQuery();
                while (db.rs.next())
                {                       
                   out.print ("<option value='"+db.rs.getInt("qid") +"'>"+db.rs.getString("ques")+"</option>");
                   //this is to create the drop down of questions.
                }                           
            }
            catch (SQLException e)
            {
            
            }
        }
        catch (SQLException e)
        {
        
        }
                                        
%>
                </select>
                <button type="submit">Post</button>
                </form>   
                <a href="Discussion.jsp"><button>Cancel</button> </a>                             
        </div>
    </body>
</html>