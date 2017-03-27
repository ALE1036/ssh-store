<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Seller</title>
</head>
<style type="text/css">
html,
body,
div,
ul,
li{
    margin: 0;
    padding: 0;
}
a{
	text-decoration: none;
}


.main {
    width: 720px;
    height: auto;
    margin: 20px auto;
    text-align: center;
    border: 2px solid #666;
}

.main>table {
    width: 100%;
    text-align: center;
}

.main>table tr {
    height: 50px;
}
a:hover{
	text-decoration:underline;
}
.add{
	display: block;
	width: 100px;
	height: 35px;
	margin: 10px auto;
	background: #666;
	text-align: center;
	line-height: 35px;
	border-radius: 4px;
	font-size: 14px;
	color: white;
}
.add:hover{
	background: #777;
	color: #111;
}
.page{
    width: 100%;
    height: 50px;
}
.page ul{
    position: absolute;
    left: 50%;
    margin-left: -156px;
}
.page li{
    list-style: none;
    float: left;
}
</style>

<body>
    <div class="main">
        <h2>卖家列表页</h2>
        <table border="1">
            <tr>
                <th scope="col">卖家名</th>
                <th scope="col">地址</th>
                <th scope="col">手机号</th>
                <th scope="col">数据操作</th>
            </tr>
	<!--
            <tr>
                <td>张三丰</td>
                <td>武当山</td>
                <td>1517971234</td>
                <td><a href="#">编辑</a>/<a href="#">删除</a></td>
            </tr>   -->
		<s:iterator value="list" var="se">
		    <tr>
                <td><s:property value="#se.sname" /></td>
                <td><s:property value="#se.address" /></td>
                <td><s:property value="#se.phone" /></td>
                <td><a href="seller_edit.action?sid=<s:property value="#se.sid" />">编辑</a>/<a href="seller_delete.action?sid=<s:property value="#se.sid" />">删除</a></td>
            </tr>
        </s:iterator>
        </table>
        <div class="page">
            <ul>
                <li>第 <s:property value="currPage" /> / <s:property value="totalPage" />页</li>
                <li>总记录数：<s:property value="totalCount" />条 | 每页显示：<s:property value="pageSize" />条</li><br>
             
               <s:if test="currPage != 1">
                <li><a href='seller_findAll.action?currPage=1'>[首页]</a></li>
                <li><a href='seller_findAll.action?currPage=<s:property value="currPage-1" />'>[上一页]</a></li>
               </s:if>
             
               <s:if test="currPage != totalPage">
                <li><a href='seller_findAll.action?currPage=<s:property value="currPage+1" />'>[下一页]</a></li>
                <li><a href='seller_findAll.action?currPage=<s:property value="totalPage" />'>[尾页]</a></li>
               </s:if>
            </ul>

        </div>
        <a class="add" href="seller_saveUI.action">增加卖家</a>
        <a class="add" href="product-index.jsp">返回首页</a>
    </div>

</body>

</html>
