<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center" style="font-family:Monotype Corsiva;color:orange">Edit Course Fee and Duration</h1>  
<div align="center">
       <form:form method="post" action="editSave"  modelAttribute="courseRecord"> 
       <form:hidden path="id"/>
        <form:hidden path="name"/>
        
 <h4 style="color:red">* marked items entry is compulsory</h4>
 <br/>
 <h3 style="font-family:Lucida Calligraphy;color:purple">   
 <table cellpadding="5">
 <tr>
   <td>The Course Number:</td>
   <td><form:input path="id" disabled="true"/></td> 
 </tr> 
 <tr> 
<td>The Course Name:</td>
<td><form:input path="name" disabled="true"/></td>   
</tr>
<tr>
<td>*Enter New Fees:</td>
<td><form:input path="fee"/></td>  
</tr>
<tr>
<td>*Enter New Duration:</td>
<td><form:input path="monthDuration"/></td>   
</tr>
</table>
<input type="submit" value="submit"/> 
</h3>
</form:form>
</div>
</body>
</html>