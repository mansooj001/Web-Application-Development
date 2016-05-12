<%--
  Created by IntelliJ IDEA.
  User: jason
  Date: 4/14/2016
  Time: 13:10
  To change this template use File | Settings | File Templates.
--%>
<%
    String login_msg = (String) request.getAttribute("error");
    if (login_msg != null)
        out.println("<font color=red size=4px>" + login_msg + "</font>");
%>
<html>
<head>
    <title>Register Page</title>
</head>
<body>
<form action="register.do" method="post">
    <div>
        Username: <input type="text" name="username"/><br>
        Password: <input type="password" name="password1"/><br>
        Retype password:<input type="password" name="password2"/><br>
        email: <input type="text" name="email"/><br>
        name: <input type="text" name="name"/><br>
        <input type="submit" value="login"/>
    </div>
</form>
</body>
</html>
