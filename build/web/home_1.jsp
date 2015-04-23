<%@page import="control.DBConnect"%>
<html>
	<head>
		<title>
		index
		</title>
		<link rel="stylesheet" type="text/css" href="main.css">
		<link href="style_1.css" type="text/css" rel="stylesheet"/>
                <style>
                    body
                    {
                        color:white;
                        text-decoration: none;
                    }
            #paddings
        {
            margin-top:100px;
            margin-bottom: 10px;
        }
                </style>
                
	</head>
	<body >
		    <div id="nav">
			<div id="nav_wrapper">
			<ul>
			<li><a href="home_1.jsp">Home</a></li><li>
			<a href="Discussion.jsp">Discussions</a></li><li>
			<a href="#">Notifications</a></li><li>
			<a href="message.html">Send Message</a></li><li>
			<a href="#">Settings<img src="arrow.png" id="circle" /></a>
				<ul>
				<li><a href="deleteuser.jsp">Delete Account</a></li><li>
				<a href="logout.jsp">Logout</a></li>
				</ul></ul>
			</div>
		</div>
             <div id="paddings">
        
    </div>

<%
    try
    {
                           
    DBConnect db=new DBConnect();
    String n =(String)session.getAttribute("login_id");
    String qSQL= "select * from user2 where login_id='"+n+"'";
    db.pstmt=db.conn.prepareStatement(qSQL);
    db.rs=db.pstmt.executeQuery();
        while(db.rs.next())
        {       
        out.println("<table class=\"table-fill\"><thead><tr><th class=\"text-left\">Profile</th><th class=\"text-left\"></th></tr></thead><tbody class=\"table-hover\">");
        out.println("<tr><td class=\"text-left\">Name</td><td class=\"text-left\">"+db.rs.getString("first_name")+" "+db.rs.getString("last_name")+"</td></tr>");
        out.println("<tr><td class=\"text-left\"> Login Id</td><td class=\"text-left\">"+db.rs.getString("login_id")+"</td></tr>");
        out.println("<tr><td class=\"text-left\"> Branch</td><td class=\"text-left\">"+db.rs.getString("branch")+"</td></tr>");
        out.println("<tr><td class=\"text-left\"> Roll No</td><td class=\"text-left\">"+db.rs.getString("rollno")+"</td></tr>");
        out.println("<tr><td class=\"text-left\"> Gender</td><td class=\"text-left\">"+db.rs.getString("gender")+"</td></tr>");
        out.println("<tr><td class=\"text-left\"> Mobile Number</td><td class=\"text-left\">"+db.rs.getString("mobileno")+"</td></tr>");
        out.println("<tr><td class=\"text-left\"> House</td><td class=\"text-left\">"+db.rs.getString("house")+"</td></tr>");
        out.println("<tr><td class=\"text-left\"> Date of Birth</td><td class=\"text-left\">"+db.rs.getString("date_of_birth")+"</td></tr>");
        out.println("<tr><td class=\"text-left\"> Home town</td><td class=\"text-left\">"+db.rs.getString("home_town")+"</td></tr>");
        out.println("<tr><td class=\"text-left\"> About</td><td class=\"text-left\">"+db.rs.getString("about")+"</td></tr>");
        out.println("<tr><td class=\"text-left\"> Hostel</td><td class=\"text-left\">"+db.rs.getString("hostel")+"</td></tr>");
        out.println("<tr><td class=\"text-left\"> Education</td><td class=\"text-left\">"+db.rs.getString("education")+"</td></tr><br>");
        
        out.println("</tbody></table>");
        }
    }
    catch(Exception e)
    {
        out.println(""+e);
    }
%>
 <div id="paddings">
        
    </div>
                        

<center>
			<div id="bottom">
				<a href="about.html">About us</a><br>
				LNM Institute of Information Technology
			</div>
		</center>
                        
</body>
</html>