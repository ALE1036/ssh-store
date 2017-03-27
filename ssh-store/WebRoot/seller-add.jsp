<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>add页</title>
</head>
<style type="text/css">
html,
body {
    margin: 0;
    padding: 0;
}

form {
    margin: 20px auto;
    text-align: center;
}

input[type="submit"] {
    width: 72px;
    height: 30px;
}

textarea {
    width: 300px;
    height: 100px;
}
</style>

<body>
    <div class="main" align="center">
        <h2>增加卖家</h2>
        <form action="seller_save" method="post">
             <p>卖家名：
                <input type="text" name="sname">
            </p>
            <p>地址：
                <input type="text" name="address">
            </p>
            <p>手机号：
                <input type="text" name="phone">
            </p>
            <p>
                <input type="submit" value="提交">
            </p>
        </form>
            <p>
              <a href="seller_findAll.action">返回列表页</a>
            </p>
    </div>
</body>

</html>
