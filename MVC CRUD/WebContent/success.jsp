<%@page import="com.org.model.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function updateRecord(){
	alert("update");
	document.myform.action="edit";
	document.myform.submit();
}
function deleteRecord(){
	alert("delete");
	document.myform.action="delete";
	document.myform.submit();
}
function addRecord(){
	alert("add");
	document.myform.action="add";
	document.myform.submit();
}

</script>
</head>
<body>
<form name="myform">
<table border="1" align="center">
<tr>
<th>Sr No</th>
<th>Id</th>
<th>Username</th>
<th>Password</th>
<th>Name</th>
<th>MobNo</th>
</tr>
<% List<Student> slist=(List)request.getAttribute("data");
    for(Student s:slist)
    	
    	{%>
    <tr>
    <td><input type="radio" name="id" value="<%=s.getId() %>"></td>
    <td><%=s.getId() %></td>
    <td><%=s.getUname() %></td>
    <td><%=s.getPass() %></td>
    <td><%=s.getName() %></td>
    <td><%=s.getMobno() %></td>
    <%}%>
    </tr>
</table>
<input type="button" value="update" onclick="updateRecord()">
   <input type="button" value="delete" onclick="deleteRecord()">
    <input type="button" value="add" onclick="addRecord()">
    

</form>
</body>
</html>