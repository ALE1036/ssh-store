<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
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
        <h2>增加商品</h2>
        <s:form action="product_save" method="post" theme="simple" >
    <!--    <form action="product_save" method="post"> </form>  -->
             <p>卖家：
                <s:select list="list" name="seller.sid" listKey="sid" listValue="sname" headerKey="" headerValue="---请选择卖家---" />
            </p>
            <p>商品名：
                <s:textfield name="pname" />
            </p>
            <p>价格：
                <s:textfield name="price" /> 
            </p>
            <p>详细描述：
                <s:textarea name="dsc" />
            </p>
            <p>
                <input type="submit" value="提交">
            </p>
        </s:form>
        	<p>
              <a href="product_findAll.action">返回列表页</a>
            </p>
    </div>
</body>

</html>
