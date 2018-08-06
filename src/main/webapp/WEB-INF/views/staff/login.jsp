<%--
  Created by IntelliJ IDEA.
  User: 85211
  Date: 2018/6/12
  Time: 9:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="text/javascript" src="/static/js/jquery-3.3.1.js"></script>
<link type="text/css" href="/static/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" src="/static/bootstrap/js/bootstrap.min.js"></script>
<html>
<head>
    <title>登陆超市管理系统</title>
</head>
<body>
<div class="container-fluid">
    <div class="row" style="margin-top: 10%;">
        <div class="col-md-4"></div>
        <div class="col-md-4" id="colmd4">
            <form class="form-horizontal" action="/staff/login" method="post">
                <h1 style="text-align: center;">登陆</h1>
                <br>
                <br>
                <div class="form-group">
                    <label for="staffnamw-input" class="col-sm-2 control-label">账户:</label>
                    <div class="col-sm-10">
                        <input type="text" name="staffnumber" class="form-control" id="staffnamw-input" placeholder="账户">
                    </div>
                </div>
                <br>
                <div class="form-group">
                    <label for="staffpas-input" class="col-sm-2 control-label">密码:</label>
                    <div class="col-sm-10">
                        <input type="password" name="staffpassword" class="form-control" id="staffpas-input" placeholder="密码">
                    </div>
                </div>
                <br>
                <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-10">
                        <div class="row">
                            <div class="col-md-6">
                                <button class="btn btn-default" style="left: 20px;position: relative;">忘记密码</button>
                            </div>
                            <div class="col-md-6">
                                <button type="submit" class="btn btn-default" id="login-btn">登陆</button>
                            </div>
                        </div>
                    </div>
                </div>
            </form>
        </div>
        <div class="col-md-4"></div>
    </div>
</div>
<script type="text/javascript">
    alert("密码或账户错误！请仔细检查！");
</script>
</body>
</html>
