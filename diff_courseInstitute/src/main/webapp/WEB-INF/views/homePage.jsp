
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Course Details</title>
</head>
<body>
<h1 align="center" style="font-family:Monotype Corsiva;color:orange">
<u>Course Details</u>
</h1>
<hr size="3" color="lightgreen"/>
<h4><i>
<div align="center">
<a href="addNewCourse">Create New Course</a>
</div>
</i></h4>
<div align="center">
    <table border="1" cellpadding="10">
        <thead>
            <tr>
                <th>CODE</th>
                <th>NAME</th>
                <th>FEES</th>
                <th>DURATION(Month)</th>
                 <th>ACTIONS</th>
                
                </tr>
        </thead>
        <tbody>
         <c:forEach var="course" items="${courseList}">   
            <tr>
            	<td>${course.id}</td>
                <td>${course.name}</td>
                <td>${course.fee}</td>
                <td>${course.monthDuration}</td>
                <td>
                	<a href="editCourse/${course.id}">Edit</a>
                	&nbsp;&nbsp;&nbsp;
                	<a href="removeCourse/${course.id}">Remove</a>
                </td>
            </tr>
            </c:forEach>
        </tbody>
    </table>
</div>    

</body>
</html>