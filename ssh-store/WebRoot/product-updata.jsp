<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>updata页</title>
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
        <h2>编辑商品</h2>
        <form action="product_updata" method="post">
        		<input type="hidden" name="pid" value="${model.pid}" >
        		<input type="hidden" name="seller.sid" value="${model.seller.sid}">
            <p>商品名：
                <input type="text" name="pname" value="${model.pname}" >
            </p>
            <p>价格：
                <input type="text" name="price" value="${model.price}" >
            </p>
            <p>详细描述：
                <textarea name="dsc">${model.dsc}</textarea>
            </p>
            <p>
                <input type="submit" value="提交">
            </p>
          
        </form>
        	<p>
              <a href="product_findAll.action">返回列表页</a>
            </p>
    </div>
</body>

</html>
