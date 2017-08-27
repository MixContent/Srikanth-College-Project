<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>students List By Course</h1>
	<table border="1">
		<tr>
			<th>Roll NO</th>
			<th>Student Name</th>
			<th>Age</th>
			<th>Course</th>
		</tr>
		<%-- <c:forEach items="${topStudentByCourse }" var="s">
			<tr>
				<td><c:out value="${s.studentRollNo }" /></td>
				<td><c:out value="${s.studentName }" /></td>
				<td><c:out value="${s.studentAge }" /></td>
				<td><c:out value="${s.courseName }" /></td>
			</tr>
		</c:forEach> --%>
		
			<tr>
				<td><c:out value="${topStudentByCourse.studentRollNo }" /></td>
				<td><c:out value="${topStudentByCourse.studentName }" /></td>
				<td><c:out value="${topStudentByCourse.studentAge }" /></td>
				<td><c:out value="${topStudentByCourse.courseName }" /></td>
			</tr>
	</table>
</body>
</html>