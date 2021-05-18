<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<style>
.center {
  display: flex;
  justify-content: center;
  align-items: center;
  height: 200px;
  border: 3px solid green;
}
</style>
</head>
<body>
 <form action="log">
   <table border="1" align="center">
     <tr>
     <td>Username:</td>
     <td><input type="text" name="uname"></td>
     </tr>
     <tr>
     <td>Password:</td>
     <td><input type="password" name="pass"></td>
     </tr>
   </table>
   <div class="center">
   <input type="submit" value=" Login "><a href="register">New User</a>
  </div>

 </form>
</body>
</html>