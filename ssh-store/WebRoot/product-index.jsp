<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Document</title>
</head>
<style type="text/css">
html,
body {
    width: 100%;
    height: 100%;
}

* {
    margin: 0;
    padding: 0;
    list-style: none;
    text-decoration: none;
}

.contain {
    width: 1000px;
    height: 560px;
    margin: 80px auto;
    border: 2px solid #111;
}

.contain div {
    box-sizing: border-box;
}

.side {
    width: 23%;
    height: 100%;
    border: 2px solid red;
    display: inline-block;
    text-align: center;
}

.side ul {
    margin-top: 10px;
}

.side ul li {
    margin-top: 20px;
}
a:hover{
	text-decoration: underline;
}
.main {
    width: 75%;
    height: 100%;
    border: 2px solid #888;
    float: right;
}

.main img {
    width: 100%;
    height: auto;
}

.user {
    position: absolute;
    top: 38px;
    right: 34px
}
.user span{
	font-weight: bold;
	color: red;
}
</style>

<body>
	<s:if test= "#session.user == NULL " >
	
		<form action="inter_out" id="outfrom">
		 	233
		</form>
	
	<script type="text/javascript">
		function validate(){
			  document.getElementById("outfrom").submit();   
			}
			window.load=validate();
	</script>
	 
	</s:if>
	
	<h2 align="center" style="margin-top: 20px;">商城首页</h2>
    <div class="user">用户：<span><s:property value="#session.user.username" /></span> | <a href="user_logout">注销</a></div>
    <div class="contain">
        <div class="side">
            <ul>
                <li><a href="product_findAll.action">商品管理</a></li>
                <li><a href="seller_findAll.action">卖家管理</a></li>
                <li><a href="#">用户管理</a></li>
            </ul>
        </div>
        <div class="main"><img src="${pageContext.request.contextPath }/image/asuna.JPG"></div>
    </div>
</body>

</html>
