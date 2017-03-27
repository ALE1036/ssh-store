<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Product</title>
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
        <h2>商品列表页</h2>
        <table border="1">
            <tr>
                <th scope="col">商品名</th>
                <th scope="col">价格</th>
                <th scope="col">描述</th>
                <th scope="col">卖家</th>
                <th scope="col">数据操作</th>
            </tr>

		<s:iterator value="list" var="pr">
		    <tr>
                <td><s:property value="#pr.pname" /></td>
                <td><s:property value="#pr.price" /></td>
                <td><s:property value="#pr.dsc" /></td>
                <td><s:property value="#pr.seller.sname" /></td>
                <td><a href="product_edit.action?pid=<s:property value="#pr.pid" />">编辑</a>/
                	<a href="product_delete.action?pid=<s:property value="#pr.pid" />">删除</a></td>
            </tr>
        </s:iterator>
        </table>
        <div class="page">
            <ul>
                <li>第 <s:property value="currPage" /> / <s:property value="totalPage" />页</li>
                <li>总记录数：<s:property value="totalCount" />条 | 每页显示：<s:property value="pageSize" />条</li><br>
             
               <s:if test="currPage != 1">
                <li><a href='product_findAll.action?currPage=1'>[首页]</a></li>
                <li><a href='product_findAll.action?currPage=<s:property value="currPage-1" />'>[上一页]</a></li>
               </s:if>
             
               <s:if test="currPage != totalPage">
                <li><a href='product_findAll.action?currPage=<s:property value="currPage+1" />'>[下一页]</a></li>
                <li><a href='product_findAll.action?currPage=<s:property value="totalPage" />'>[尾页]</a></li>
               </s:if>
            </ul>

        </div>
        <a class="add" href="product_saveUI.action">增加商品</a>
        <a class="add" href="product-index.jsp" >返回首页</a>
    </div>

</body>

</html>
