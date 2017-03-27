<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Login</title>
</head>
<style type="text/css">
html,
body{
    margin: 0;
    padding: 0;
}
li{
list-style: none;
}
form{
	margin-top: 20px;
	text-align: center;
}
input[type="submit"]{
	width: 72px;
	height: 30px;
}
</style>
<body>
    <div align="center">
    	<h2>登录页面</h2>
        <form action="user_login" method="post">
            <p>账号：
                <input type="text" name="username">
            </p>
            <p>密码：
                <input type="password" name="password">
            </p>
            <p>
                <input type="submit" value="登录">
            </p>
        </form>
        <h4><s:actionerror/></h4>
    </div>
</body>

</html>
